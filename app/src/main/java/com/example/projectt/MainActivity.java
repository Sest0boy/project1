package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try (DBHelper db = new DBHelper(this)) {

            EditText data_Stuid = findViewById(R.id.StdC);
            EditText data_pass = findViewById(R.id.password);
            Button loginbtn = findViewById(R.id.loginbtn);

            loginbtn.setOnClickListener(v -> {
                String data_name_str = data_Stuid.getText().toString();
                String data_pass_str = data_pass.getText().toString();

                if (data_name_str.equalsIgnoreCase("")) {
                    data_Stuid.setError("Please enter a Stuid");
                } else if (data_pass_str.equalsIgnoreCase("")) {
                    data_pass.setError("Please enter a Password");
                } else {
                    db.addVisitor(new Visitor(data_name_str, Integer.parseInt(data_pass_str), Utility.get_ts()));
                    data_Stuid.setText("");
                    data_pass.setText("");
                    Intent intent = new Intent(this, MainInformation.class);
                    startActivity(intent);
                }
            });
        }
    }

}

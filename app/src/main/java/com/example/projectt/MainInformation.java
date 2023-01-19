package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_information);

        final Button btn1 = (Button) findViewById(R.id.btn01);
        final Button btn2 = (Button) findViewById(R.id.btn02);


        Button buttonSend = (Button) findViewById(R.id.buttonSend0);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"email@example.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "subject here");
                intent.putExtra(Intent.EXTRA_TEXT, "body text");
                startActivity(Intent.createChooser(intent, "Send email..."));
            }
        });
    }
    public void NextPage1(View view){
        Button button = (Button)findViewById(R.id.btn01);
        Intent intent = new Intent(this, Infofriend.class);
        startActivity(intent);
    }
    public void NextPage2(View view){
        Button button = (Button)findViewById(R.id.btn02);
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void backPage3(View view){
        Button button = (Button)findViewById(R.id.btnback02);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
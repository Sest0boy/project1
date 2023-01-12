package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void backPage3(View view){
        Button button = (Button)findViewById(R.id.btnback02);
        Intent intent = new Intent(this, MainInformation.class);
        startActivity(intent);
    }
}
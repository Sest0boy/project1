package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Informationjame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationjame);

        Button button = (Button) findViewById(R.id.btnFb4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTOFacebookPage("100011018040223");
            }
        });
    }

    public void NextPage1(View view){
        ImageView imageView = (ImageView)findViewById(R.id.left_icon2);
        Intent intent = new Intent(this, Inforationoat.class);
        startActivity(intent);
    }

    public void backPageHome4(View view){
        ImageView imageView = (ImageView)findViewById(R.id.left_icon2);
        Intent intent = new Intent(this, MainInformation.class);
        startActivity(intent);
    }
    public void backPage3(View view){
        ImageView imageView = (ImageView)findViewById(R.id.right_icon2);
        Intent intent = new Intent(this, Informationboat.class);
        startActivity(intent);
    }

    private void goTOFacebookPage(String id) {

        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + id));
            startActivity(intent);
        }catch (ActivityNotFoundException e) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" + id));
            startActivity(intent);
        }
    }
}
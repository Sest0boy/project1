package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Informationboat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationboat);

        Button button = (Button) findViewById(R.id.btnFb3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTOFacebookPage("100010892474208");
            }
        });
    }

    public void NextPage1(View view){
        ImageView imageView = (ImageView)findViewById(R.id.left_icon1);
        Intent intent = new Intent(this, Informationjame.class);
        startActivity(intent);
    }

    public void backPageHome3(View view){
        ImageView imageView = (ImageView)findViewById(R.id.left_icon1);
        Intent intent = new Intent(this, MainInformation.class);
        startActivity(intent);
    }
    public void backPage3(View view){
        ImageView imageView = (ImageView)findViewById(R.id.right_icon1);
        Intent intent = new Intent(this, Informationpeat.class);
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
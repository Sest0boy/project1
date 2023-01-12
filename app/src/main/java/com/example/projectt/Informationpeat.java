package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Informationpeat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationpeat);

        Button button = (Button) findViewById(R.id.btnFb2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTOFacebookPage("100005779091362");
            }
        });
    }


    public void NextPage1(View view){
        Button button = (Button)findViewById(R.id.btnFb2);
        Intent intent = new Intent(this, Informationboat.class);
        startActivity(intent);
    }
    public void backPage3(View view){
        Button button = (Button)findViewById(R.id.btnback01);
        Intent intent = new Intent(this, Informationpu.class);
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
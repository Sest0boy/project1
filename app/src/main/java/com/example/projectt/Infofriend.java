package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Infofriend extends AppCompatActivity {
    Button FB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infofriend);
        FB = findViewById(R.id.btnFbbas);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/Rittidec.Kamon");
            }
        });
        FB = findViewById(R.id.btnFbohm);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/BOONYOOL");
            }
        });
        FB = findViewById(R.id.btnFbaum);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/SuperNovaSniper");
            }
        });
        FB = findViewById(R.id.btnFbfern);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/fern.wichuta.7");
            }
        });
        FB = findViewById(R.id.btnFbpu);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/kittipan.pu");
            }
        });
        FB = findViewById(R.id.btnFbpeat);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/messages/t/100005779091362/");
            }
        });
        FB = findViewById(R.id.btnFbboat);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/boatzerot");
            }
        });
        FB = findViewById(R.id.btnFbjame);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/profile.php?id=100011018040223");
            }
        });
        FB = findViewById(R.id.btnFboat);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/oat.oat.3597");
            }
        });
        FB = findViewById(R.id.btnFbmon);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/profile.php?id=100048057098043");
            }
        });
        FB = findViewById(R.id.btnFbart);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/WatashiwaThanapronDesu");
            }
        });
        FB = findViewById(R.id.btnFbnine);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/profile.php?id=100004381662086");
            }
        });
        FB = findViewById(R.id.btnFbjui);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/profile.php?id=100002619888236");
            }
        });
        FB = findViewById(R.id.btnFbsura);
        FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/profile.php?id=100029545253186");
            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    public void backPagehome(View view){
        ImageView imageView = (ImageView) findViewById(R.id.left_icon0);
        Intent intent = new Intent(this, MainInformation.class);
        startActivity(intent);
    }

}
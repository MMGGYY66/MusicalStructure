package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        TextView main = (TextView) findViewById(R.id.principal);
        main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(ShareActivity.this, MainActivity.class);
                startActivity(playIntent);
            }
        });

        TextView browse = (TextView) findViewById(R.id.recherche);
        browse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(ShareActivity.this, BrowseActivity.class);
                startActivity(playIntent);
            }
        });

        TextView mix = (TextView) findViewById(R.id.mixage);
        mix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(ShareActivity.this, MixActivity.class);
                startActivity(playIntent);
            }
        });


        TextView buy = (TextView) findViewById(R.id.achat);
        buy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(ShareActivity.this, BuyActivity.class);
                startActivity(playIntent);
            }
        });

    }
}

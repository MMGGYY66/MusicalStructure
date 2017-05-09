package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        TextView main = (TextView) findViewById(R.id.principal);
        main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(BuyActivity.this, MainActivity.class);
                startActivity(playIntent);
            }
        });

        TextView browse = (TextView) findViewById(R.id.recherche);
        browse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(BuyActivity.this, BrowseActivity.class);
                startActivity(playIntent);
            }
        });

        TextView mix = (TextView) findViewById(R.id.mixage);
        mix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(BuyActivity.this, MixActivity.class);
                startActivity(playIntent);
            }
        });

        TextView share = (TextView) findViewById(R.id.partage);
        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(BuyActivity.this, ShareActivity.class);
                startActivity(playIntent);
            }
        });




    }
}

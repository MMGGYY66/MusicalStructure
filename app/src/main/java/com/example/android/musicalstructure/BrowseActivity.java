package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicalstructure.R.string.browse;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        TextView main = (TextView) findViewById(R.id.principal);
        main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(BrowseActivity.this, MainActivity.class);
                startActivity(playIntent);
            }
        });



        TextView mix = (TextView) findViewById(R.id.mixage);
        mix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(BrowseActivity.this, MixActivity.class);
                startActivity(playIntent);
            }
        });

        TextView share = (TextView) findViewById(R.id.partage);
        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(BrowseActivity.this, ShareActivity.class);
                startActivity(playIntent);
            }
        });

        TextView buy = (TextView) findViewById(R.id.achat);
        buy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playIntent = new Intent(BrowseActivity.this, BuyActivity.class);
                startActivity(playIntent);
            }
        });

    }
}

package com.example.ngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Servi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servi);
    }
    public void sea(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/service+oriented+NGO+near+me"));
        startActivity(intent);
    }
    public void join(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=sevice+oriented+NGOs"));
        startActivity(intent);
    }
}
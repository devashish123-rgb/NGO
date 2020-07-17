package com.example.ngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void ser(View view)
    {
        Intent intent=new Intent(this, Servi.class);
        startActivity(intent);
    }
    public void cha(View view)
    {
        Intent intent=new Intent(this, Chari.class);
        startActivity(intent);
    }
    public void par(View view)
    {
        Intent intent=new Intent(this, Parti.class);
        startActivity(intent);
    }
    public void emp(View view)
    {
        Intent intent=new Intent(this, Empo.class);
        startActivity(intent);
    }
    public void com(View view)
    {
        Intent intent=new Intent(this, Comm.class);
        startActivity(intent);
    }
    public void cit(View view)
    {
        Intent intent=new Intent(this, City.class);
        startActivity(intent);
    }
    public void nat(View view)
    {
        Intent intent=new Intent(this, Nati.class);
        startActivity(intent);
    }
    public void inter(View view)
    {
        Intent intent=new Intent(this, Inter.class);
        startActivity(intent);
    }
}
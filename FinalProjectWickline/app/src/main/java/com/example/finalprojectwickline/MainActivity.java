package com.example.finalprojectwickline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAuthor(View v){
        Intent intent = new Intent(MainActivity.this, Author.class);
        startActivity(intent);
    }

    public void openVideoGame(View v){
        Intent intent = new Intent(MainActivity.this, VideoGame.class);
        startActivity(intent);
    }

}
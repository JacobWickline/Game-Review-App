package com.example.finalprojectwickline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class Author extends AppCompatActivity {

    Switch switch1;
    ImageView author_image;
    TextView switch_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        switch1 = findViewById(R.id.switch1);
        author_image = findViewById(R.id.author_image);
        switch_text = findViewById(R.id.switch_text);

        //Sets different image on author page
        switch1.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(
                            CompoundButton buttonView, boolean isChecked) {
                        if (switch1.isChecked()) {
                            author_image.setImageResource(R.drawable.selfie_jacob2021);
                            switch_text.setText("Flip the switch back to see my old picture again!");
                        } else {
                            author_image.setImageResource(R.drawable.selfie_jacob2016);
                            switch_text.setText("Flip the switch to see a more current picture of me!");
                        }
                    }
                });

    }

    public void openMainActivity(View v){
        Intent intent = new Intent(Author.this, MainActivity.class);
        startActivity(intent);
    }

    public void openVideoGame(View v){
        Intent intent = new Intent(Author.this, VideoGame.class);
        startActivity(intent);
    }

}
package com.example.finalprojectwickline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class VideoGame extends AppCompatActivity {

    RatingBar rdr2_ratingbar;
    RatingBar witcher_ratingbar;
    RatingBar inscryption_ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_game);

        listenerRDR2RatingBar();
        listenerWitcherRatingBar();
        listenerInscryption();
    }

    public void listenerRDR2RatingBar(){
        rdr2_ratingbar = (RatingBar) findViewById(R.id.rdr2_ratingbar);

        rdr2_ratingbar.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                            if(v == 1){
                              Toast toast = Toast.makeText(getApplicationContext(),
                                      "I completely disagree, you should definitley play it before you declare such blasphemy.",
                                      Toast.LENGTH_LONG);
                              toast.show();
                            }

                            else if(v == 2){
                                Toast toast = Toast.makeText(getApplicationContext(),
                                        "I think you should play it if you haven't, I guarantee it will change your mind.",
                                        Toast.LENGTH_LONG);
                                toast.show();
                            }

                            else if(v == 3){
                                Toast toast = Toast.makeText(getApplicationContext(),
                                        "I'm gonna assume you haven't played it but watched the trailer, in that case you should play it.",
                                        Toast.LENGTH_LONG);
                                toast.show();
                            }

                            else if(v == 4){
                                Toast toast = Toast.makeText(getApplicationContext(),
                                        "I can sometimes agree with this, the game makes me mad sometimes.",
                                        Toast.LENGTH_LONG);
                                toast.show();
                            }

                            else if(v == 5){
                                Toast toast = Toast.makeText(getApplicationContext(),
                                        "I completely agree!",
                                        Toast.LENGTH_LONG);
                                toast.show();
                            }
                    }
                }
        );
    }

    public void listenerWitcherRatingBar(){
        witcher_ratingbar = (RatingBar) findViewById(R.id.witcher_ratingbar);

        witcher_ratingbar.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        if(v == 1){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I understand, but I would suggest giving the game a try.",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }

                        else if(v == 2){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I understand, this type of game isn't for everyone.",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }

                        else if(v == 3){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I can agree with this, grinding isn't always fun in this game.",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }

                        else if(v == 4){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I completely agree, this is a fun game but it has some flaws.",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }

                        else if(v == 5){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I disagree, I love this game but it has some flaws.",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }
                }
        );
    }

    public void listenerInscryption(){
        inscryption_ratingbar = (RatingBar) findViewById(R.id.inscryption_ratingbar);

        inscryption_ratingbar.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        if(v == 1){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I disagree, I would suggest giving the game a try.",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }

                        else if(v == 2){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I understand, not everyone enjoys card games.",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }

                        else if(v == 3){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I can sometimes agree with this, the game's creepy atmosphere can make this game unappealing.",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }

                        else if(v == 4){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I can agree with this, your opponent in this game can be unfair at times.",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }

                        else if(v == 5){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "I agree, this game is simply amazing and one of a kind!",
                                    Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }
                }
        );
    }

    public void openMainActivity(View v){
        Intent intent = new Intent(VideoGame.this, MainActivity.class);
        startActivity(intent);
    }

}
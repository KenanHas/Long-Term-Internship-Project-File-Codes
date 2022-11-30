package com.kenanh.catchthekenny;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView time;
    TextView score;
    private int skor;

    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView[] images;
    Handler handler;
    Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time = findViewById(R.id.time);
        score = findViewById(R.id.score);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);

        images = new ImageView[] {imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,
        imageView9,imageView10};
        hideImages();
        skor = 0;
        new CountDownTimer(11000, 1000) {
            @Override
            public void onTick(long l) {
                time.setText("Time: "+l/1000);
            }
            @Override
            public void onFinish() {
                handler.removeCallbacks(runnable);
                for(ImageView image : images)
                {
                    image.setVisibility(View.INVISIBLE);
                }
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Restart");
                alert.setMessage("Do you want to restart the game?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"Game Over!",Toast.LENGTH_LONG);
                    }
                });
                alert.show();
            }
        }.start();
    }
    public void increaseScore(View view) {
        skor++;
        score.setText("Score: " + skor);
    }
    public void hideImages()
    {
        handler= new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
            for(ImageView image: images)
            {
                image.setVisibility(View.INVISIBLE);
            }
                Random random = new Random();
                int i = random.nextInt(9);
                images[i].setVisibility(View.VISIBLE);
                handler.postDelayed(this,500);
            }
        };
        handler.post(runnable);

    }
}
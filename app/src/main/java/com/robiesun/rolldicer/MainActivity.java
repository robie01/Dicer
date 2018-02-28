package com.robiesun.rolldicer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.util.Random;


public class MainActivity extends AppCompatActivity {


    public static final Random RANDOM = new Random();
    Button rollDices;
    ImageView imageView1;
    ImageView imageView2;

    int rolledNumber;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        rollDices = (Button) findViewById(R.id.rollDices);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        r = new Random();

        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rolledNumber = r.nextInt(6) + 1;
                if(rolledNumber == 1){
                    imageView1.setImageResource(R.drawable.dice_1);
                    imageView2.setImageResource(R.drawable.dice_1);
                }else if(rolledNumber == 2){
                    imageView1.setImageResource(R.drawable.dice_2);
                    imageView2.setImageResource(R.drawable.dice_2);
                }else if(rolledNumber == 3){
                    imageView1.setImageResource(R.drawable.dice_3);
                    imageView2.setImageResource(R.drawable.dice_3);
                }else if(rolledNumber == 4){
                    imageView1.setImageResource(R.drawable.dice_4);
                    imageView2.setImageResource(R.drawable.dice_4);
                }else if(rolledNumber == 5){
                    imageView1.setImageResource(R.drawable.dice_5);
                    imageView2.setImageResource(R.drawable.dice_5);
                }else if(rolledNumber == 6){
                    imageView1.setImageResource(R.drawable.dice_6);
                    imageView2.setImageResource(R.drawable.dice_6);
                }

            }
        });
    }


//    public static int randomDiceValue()
//    {
//
//        return RANDOM.nextInt(6) + 1;
//    }
}
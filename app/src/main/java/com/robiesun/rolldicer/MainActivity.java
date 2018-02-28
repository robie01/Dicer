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
    ImageView imageView1, imageView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        rollDices = (Button) findViewById(R.id.rollDices);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = randomDiceValue();
                int value2 = randomDiceValue();

                int res1 = getResources().getIdentifier("dice_" + value1, "drawable", "package com.robiesun.rolldicer");
                int res2 = getResources().getIdentifier("dice_" + value2, "drawable", "package com.robiesun.rolldicer");

                imageView1.setImageResource(res1);
                imageView2.setImageResource(res2);

            }
        });
    }


    public static int randomDiceValue()
    {

        return RANDOM.nextInt(6) + 1;
    }
}
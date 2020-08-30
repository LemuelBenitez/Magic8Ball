package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageView answer;
Random ran = new Random();
int[] msg = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
Button askButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        askButton = (Button)findViewById(R.id.askButton);
        answer = (ImageView)findViewById(R.id.answer);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int number = ran.nextInt(5);
                answer.setImageResource(msg[number]);
            }
        });
    }

}
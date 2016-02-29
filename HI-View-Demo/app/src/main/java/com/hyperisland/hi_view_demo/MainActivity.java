package com.hyperisland.hi_view_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private View awesomeView;

    private static int[] colors = {
            R.color.red,
            R.color.orange,
            R.color.yellow,
            R.color.green,
            R.color.cyan,
            R.color.blue,
            R.color.purple,
    };

    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = new Random();
        initUI();
    }

    private void initUI() {
        awesomeView = findViewById(R.id.awesomeView);
        myButton = (Button) findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awesomeView.setBackgroundColor(MainActivity.this.getResources().getColor(colors[random.nextInt(colors.length)]));
            }
        });
    }
}

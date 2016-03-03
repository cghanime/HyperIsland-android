package com.hyperisland.hi_view_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rand_btn;
    private View awesomeView;
    private TextView awesomeText;
    private Button order_btn;
    private Button reset;

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
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = new Random();
        initUI();
    }

    private void initUI() {
        awesomeView = findViewById(R.id.awesomeView);
        awesomeText = (TextView) findViewById(R.id.awesomeText);
        rand_btn = (Button) findViewById(R.id.rand_btn);
        order_btn = (Button) findViewById(R.id.order_btn);
        reset = (Button) findViewById(R.id.reset);
        rand_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awesomeView.setBackgroundColor(MainActivity.this.getResources().getColor(colors[random.nextInt(colors.length)]));
                awesomeText.setTextColor(MainActivity.this.getResources().getColor(colors[random.nextInt(colors.length)]));
            }
        });

        order_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { index++;
                awesomeView.setBackgroundColor(MainActivity.this.getResources().getColor(colors[index % colors.length]));
                awesomeText.setTextColor(MainActivity.this.getResources().getColor(colors[index % colors.length]));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int white = 0;
                awesomeView.setBackgroundColor(white);
                awesomeText.setTextColor(white);
            }
        });
    }
}
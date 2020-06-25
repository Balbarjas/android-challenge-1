package com.example.x_o;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public abstract class MainActivity extends AppCompatActivity {
Boolean xturn = true;
TextView turn ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button zero = findViewById(R.id.button0);
        final Button one = findViewById(R.id.button1);
        final Button two = findViewById(R.id.button2);
        final Button three = findViewById(R.id.button3);
        final Button fuor = findViewById(R.id.button4);
        final Button five = findViewById(R.id.button5);
        final Button six = findViewById(R.id.button6);
        final Button seven = findViewById(R.id.button7);
        final Button eight= findViewById(R.id.button8);
         Button reset = findViewById(R.id.button10);
        TextView turn = findViewById(R.id.textView);
         zero.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (xturn) {
                     checkXwin();
                     zero.setText("X");
                 }
                 else {
                     checkowin();
                     zero.setText("O");
                 }
             }
         });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xturn) {
                    checkXwin();
                    zero.setText("X");
                }
                else {
                    checkowin();
                    zero.setText("O");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xturn) {
                    checkXwin();
                    one.setText("X");
                }
                else {
                    checkowin();
                    one.setText("O");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xturn) {
                    checkXwin();
                    two.setText("X");
                }
                else {
                    checkowin();
                    two.setText("O");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xturn){
                    checkXwin();
                    three.setText("X");
                }
                else {
                    checkowin();
                    three.setText("O");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xturn) {
                    checkXwin();
                    fuor.setText("X");
                } else {
                    checkowin();
                    fuor.setText("O");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xturn) {
                    checkXwin();
                    five.setText("X");
                }
                else {
                    checkowin();
                    five.setText("O");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xturn){
                    checkXwin();
                    six.setText("X");
            }
                else {
                    checkowin();
                    six.setText("O");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xturn) {
                    checkXwin();
                    seven.setText("X");
                }
                else {
                    checkowin();
                    seven.setText("O");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xturn) {
                    checkXwin();
                    eight.setText("X");
                }
                else {
                    checkowin();
                    eight.setText("O");
                }
            }
        });

    }

    public  void checkXwin(){
        xturn = false ;
        turn.setText("O turn");
    }

    public  void checkowin(){
        xturn = true ;
        turn.setText("X turn");
    }
}










































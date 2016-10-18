package com.example.jmcgowen.semsterproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.Calender);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityCalender.class));
            }


        }
        );

        Button button1 = (Button) findViewById(R.id.Sports);
        button1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          startActivity(new Intent(MainActivity.this, Sports.class));
                                      }


                                  }
        );

        Button button2 = (Button) findViewById(R.id.OtherActivities);
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           startActivity(new Intent(MainActivity.this, Other.class));
                                       }


                                   }
        );


    }
}

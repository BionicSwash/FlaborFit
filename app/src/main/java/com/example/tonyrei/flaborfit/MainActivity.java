package com.example.tonyrei.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_WEIGHTS = "Weight Lifting";
    public static final String EXERCISE_YOGA ="Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RelativeLayout weightButn = (RelativeLayout)findViewById(R.id.weightButn);
        RelativeLayout yogaButn = (RelativeLayout)findViewById(R.id.lotusButn);
        RelativeLayout cardioButn = (RelativeLayout)findViewById(R.id.heartButn);

        assert weightButn != null;
        weightButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);

            }
        });
        yogaButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);

            }
        });

        cardioButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);

            }
        });





    }
    private void loadDetailActivity (String exerciseTitle){

    }
}

package com.example.tonyrei.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String EXERCISE_WEIGHTS = "Weight Lifting";
    public static final String EXERCISE_YOGA ="Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";
    public static final String SETTINGS_MENU = "Settings";

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
        assert yogaButn != null;
        yogaButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);

            }
        });

        assert cardioButn != null;
        cardioButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);

            }
        });







    }
    private void loadDetailActivity (String exerciseTitle){
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }
}

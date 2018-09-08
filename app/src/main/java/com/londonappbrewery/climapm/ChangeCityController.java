package com.londonappbrewery.climapm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChangeCityController extends AppCompatActivity {

    ImageButton mBackImageButton;
    EditText mCityNameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_city_layout);

        mCityNameEditText = findViewById(R.id.queryET);
        mBackImageButton = findViewById(R.id.backButton);

        mBackImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mCityNameEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                String cityName = mCityNameEditText.getText().toString();
                Intent intent = new Intent(ChangeCityController.this,WeatherController.class);
                intent.putExtra("City",cityName);
                startActivity(intent);
                return false;
            }
        });

    }
}

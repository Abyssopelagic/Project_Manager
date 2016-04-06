package com.example.ksbay.project_manager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class LengthConversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_conversion);
    }

    public void convertMeter(View paramView) {
        //default convert to Meter
        double initialToMeter = 0.0;
        double finalConvert = 0.0;
        double numberFrom = 0.0;

        TextView From = (TextView) findViewById(R.id.numFrom);
        if (!From.getText().toString().matches("")) {
            numberFrom = Double.parseDouble(From.getText().toString());
        }

        Spinner spinnerFrom = (Spinner) findViewById(R.id.spinnerFrom);
        String toConvert = spinnerFrom.getSelectedItem().toString();

        Spinner spinnerTo = (Spinner) findViewById(R.id.spinnerTo);
        String convertTo = spinnerTo.getSelectedItem().toString();

        switch (toConvert) {
            case "inch (in)":
                initialToMeter = numberFrom * 0.0254;
                break;
            case "foot (ft)":
                initialToMeter = numberFrom * 0.3048;
                break;
            case "yard (yd)":
                initialToMeter = numberFrom * 0.9144;
                break;
            case "centimeter (cm)":
                initialToMeter = numberFrom * 0.01;
                break;
            case "meter (m)":
                initialToMeter = numberFrom;
                break;
            case "kilometer (km)":
                initialToMeter = numberFrom * 1000;
                break;
            case "mile (mi)":
                initialToMeter = numberFrom * 1609.34;
                break;
        }

        switch (convertTo) {
            case "inch (in)":
                finalConvert = initialToMeter / 0.0254;
                break;
            case "foot (ft)":
                finalConvert = initialToMeter / 0.3048;
                break;
            case "yard (yd)":
                finalConvert = initialToMeter / 0.9144;
                break;
            case "centimeter (cm)":
                finalConvert = initialToMeter / 0.01;
                break;
            case "meter (m)":
                finalConvert = initialToMeter;
                break;
            case "kilometer (km)":
                finalConvert = initialToMeter / 1000;
                break;
            case "mile (mi)":
                finalConvert = initialToMeter / 1609.34;
                break;
        }
        TextView convertedbox = (TextView) findViewById(R.id.numTo);
        convertedbox.setText(String.valueOf(finalConvert));


    }
}
package com.example.ksbay.project_manager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class VolumeConversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_conversion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void convertVolume(View paramView)
    {
        //default convert to Liter
        double initialToLiter=0.0;
        double finalConvert=0.0;

        TextView From = (TextView)findViewById(R.id.fromValue);
        Double numberFrom = Double.parseDouble(From.getText().toString());

        Spinner spinnerFrom = (Spinner) findViewById(R.id.fromList);
        String toConvert = spinnerFrom.getSelectedItem().toString();

        Spinner spinnerTo = (Spinner) findViewById(R.id.toList);
        String convertTo = spinnerTo.getSelectedItem().toString();

        switch(toConvert)
        {
            case "gallon": initialToLiter=numberFrom * 3.76;
                break;
            case "mm": initialToLiter=numberFrom/1000000;
                break;
            case "cm": initialToLiter=numberFrom/1000;
                break;
            case "ml": initialToLiter=numberFrom/1000;
                break;
            case "L": initialToLiter=numberFrom;
                break;
            case "M": initialToLiter=numberFrom*1000;
                break;
            case "in": initialToLiter=numberFrom*0.0164;
                break;
            case "oz": initialToLiter=numberFrom*0.0296;
                break;
            case "pt": initialToLiter=numberFrom*0.47;
                break;
            case "qt": initialToLiter=numberFrom*0.95;
                break;
            case "ft": initialToLiter=numberFrom*28.32;
                break;
            case "yd": initialToLiter=numberFrom*764.56;
                break;
        }

        switch(convertTo)
        {
            case "gallon": finalConvert=initialToLiter / 3.76;
                break;
            case "mm": finalConvert=initialToLiter*1000000;
                break;
            case "cm": finalConvert=initialToLiter*1000;
                break;
            case "ml": finalConvert=initialToLiter*1000;
                break;
            case "L": finalConvert=initialToLiter;
                break;
            case "M": finalConvert=initialToLiter/1000;
                break;
            case "in": finalConvert=initialToLiter/0.0164;
                break;
            case "oz": finalConvert=initialToLiter/0.0296;
                break;
            case "pt": finalConvert=initialToLiter/0.47;
                break;
            case "qt": finalConvert=initialToLiter/0.95;
                break;
            case "ft": finalConvert=initialToLiter/28.32;
                break;
            case "yd": finalConvert=initialToLiter/764.56;
                break;
        }
        TextView convertedbox = (TextView)findViewById(R.id.toValue);
        convertedbox.setText(String.valueOf(finalConvert));

    }

}

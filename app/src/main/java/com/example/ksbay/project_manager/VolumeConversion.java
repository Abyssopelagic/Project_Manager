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
    }

    public void convertVolume(View paramView) {
        //default convert to Liter
        double initialToLiter = 0.0;
        double finalConvert = 0.0;
        double numberFrom = 0.0;

        TextView From = (TextView) findViewById(R.id.fromValue);
        if (!From.getText().toString().matches("")) {
            numberFrom = Double.parseDouble(From.getText().toString());
        }

        Spinner spinnerFrom = (Spinner) findViewById(R.id.fromList);
        String toConvert = spinnerFrom.getSelectedItem().toString();

        Spinner spinnerTo = (Spinner) findViewById(R.id.toList);
        String convertTo = spinnerTo.getSelectedItem().toString();
        switch (toConvert) {
            case "gallon (gal)":
                initialToLiter = numberFrom * 3.76;
                break;
            case "cubic millimeters (mm^3)":
                initialToLiter = numberFrom / 1000000;
                break;
            case "cubic centimeters (cm^3)":
                initialToLiter = numberFrom / 1000;
                break;
            case "cubic milliliters (mL^3)":
                initialToLiter = numberFrom / 1000;
                break;
            case "Liter (L)":
                initialToLiter = numberFrom;
                break;
            case "cubic meters (m^3)":
                initialToLiter = numberFrom * 1000;
                break;
            case "cubic inches (in^3)":
                initialToLiter = numberFrom * 0.0164;
                break;
            case "ounces (oz)":
                initialToLiter = numberFrom * 0.0296;
                break;
            case "pint (pt)":
                initialToLiter = numberFrom * 0.47;
                break;
            case "quart (qt)":
                initialToLiter = numberFrom * 0.95;
                break;
            case "cubic feet (ft^3)":
                initialToLiter = numberFrom * 28.32;
                break;
            case "cubic yards (yd^3)":
                initialToLiter = numberFrom * 764.56;
                break;
        }

        switch (convertTo) {
            case "gallon (gal)":
                finalConvert = initialToLiter / 3.76;
                break;
            case "cubic millimeters (mm^3)":
                finalConvert = initialToLiter * 1000000;
                break;
            case "cubic centimeters (cm^3)":
                finalConvert = initialToLiter * 1000;
                break;
            case "cubic milliliters (ml^3)":
                finalConvert = initialToLiter * 1000;
                break;
            case "Liter (L)":
                finalConvert = initialToLiter;
                break;
            case "cubic meter (m^3)":
                finalConvert = initialToLiter / 1000;
                break;
            case "cubic inch (in^3)":
                finalConvert = initialToLiter / 0.0164;
                break;
            case "ounces (oz)":
                finalConvert = initialToLiter / 0.0296;
                break;
            case "pint (pt)":
                finalConvert = initialToLiter / 0.47;
                break;
            case "quart (qt)":
                finalConvert = initialToLiter / 0.95;
                break;
            case "cubic feet (ft^3)":
                finalConvert = initialToLiter / 28.32;
                break;
            case "cubic yard (yd^3)":
                finalConvert = initialToLiter / 764.56;
                break;
        }
        TextView convertedbox = (TextView) findViewById(R.id.toValue);
        convertedbox.setText(String.valueOf(finalConvert));


    }

}

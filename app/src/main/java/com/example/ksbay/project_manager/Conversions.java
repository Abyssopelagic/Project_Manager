package com.example.ksbay.project_manager;

import java.util.List;
import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import android.view.View;

public class Conversions extends AppCompatActivity implements OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //SPINNERFROM
        Spinner spinnerFrom = (Spinner) findViewById(R.id.spinnerFrom);

        spinnerFrom.setOnItemSelectedListener(this);

        List<String> selectFrom = new ArrayList<String>();
        selectFrom.add("feet");
        selectFrom.add("miles");

        ArrayAdapter<String> fromAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, selectFrom);

        fromAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerFrom.setAdapter(fromAdapter);
        //SPINNERTO
        Spinner spinnerTo = (Spinner) findViewById(R.id.spinnerTo);

        spinnerFrom.setOnItemSelectedListener(this);

        List<String> selectTo= new ArrayList<String>();
        selectTo.add("feet");
        selectTo.add("miles");

        ArrayAdapter<String> toAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, selectTo);

        toAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerTo.setAdapter(toAdapter);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public String from = "";

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(parent.getContext(), "Selected: " + from, Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0){

    }

    public void ConvertClick(View paramView){
        TextView localTextView = (TextView)findViewById(R.id.numTo);
        TextView From = (TextView)findViewById(R.id.numFrom);
        localTextView.setText(Double.toString(ConvertResult(From.getText().toString())));
    }

    public double ConvertResult(String from){



        return Double.parseDouble(from)*5280;
    }


}

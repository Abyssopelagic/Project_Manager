package com.example.ksbay.project_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConversionList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);
    }
    public void gotoLengthConversions (View view) {
        Intent intent = new Intent(this, LengthConversion.class);
        startActivity(intent);
    }
    public void gotoVolumeConversions (View view) {
        Intent intent = new Intent(this, VolumeConversion.class);
        startActivity(intent);
    }
}

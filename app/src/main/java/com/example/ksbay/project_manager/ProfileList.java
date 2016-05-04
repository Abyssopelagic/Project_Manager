package com.example.ksbay.project_manager;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import android.util.Log;

public class ProfileList extends AppCompatActivity {

    List<Member> users = new ArrayList<>();
    String json;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_list);
        users.add(new Member("place", "holder"));
    }

    //Attemps at saving and reading save
    @Override
    public void onPause() {
        super.onPause();
        saveUsers();
    }

    @Override
    public void onResume() {
        super.onResume();
        loadUsers();

    }
    //trying to put object into list cause problems. probably because the onresume sets users as some
    //weird value
    public void saveUsers() {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext());
        SharedPreferences.Editor editor = sharedPrefs.edit();
        Gson gson = new Gson();
        json = gson.toJson(users);
        editor.putString("usersObject",json);
        editor.commit();

    }

    public void loadUsers() {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext());
        Gson gson = new Gson();
        json = sharedPrefs.getString("usersObject","");
        Type type = new TypeToken<List<Member>>(){}.getType();
        users = gson.fromJson(json, type);
    }


    //onclick adds names into new member
    public void addMember(View paramView) {
        TextView fnametext = (TextView) findViewById(R.id.fnametext);
        TextView lnametext = (TextView) findViewById(R.id.lnametext);
        String fname = fnametext.getText().toString();
        String lname = lnametext.getText().toString();
        users.add(new Member(fname, lname));
    }

    //onclick searches first name in users list and returns last name if present
    public void searchUser(View paramView) {
        TextView fnametext = (TextView) findViewById(R.id.fnametext);
        TextView lnametext = (TextView) findViewById(R.id.lnametext);
        TextView output = (TextView) findViewById(R.id.nameout);
        String user = fnametext.getText().toString();
        for (Member s : users) {
            if (s.getFname().contains(user)) {
                output.setText(user + "'s last name is " + s.getLname());
            }
        }
    }

}



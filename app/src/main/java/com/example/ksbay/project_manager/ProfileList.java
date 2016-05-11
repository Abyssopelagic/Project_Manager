package com.example.ksbay.project_manager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;


public class ProfileList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_list);

        ArrayList image_details = getListData();
        final ListView lv1 = (ListView) findViewById(R.id.profileListView);
        lv1.setAdapter(new ProfileListAdapter(this, image_details));
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                ProfileItem profileData = (ProfileItem) o;
                Toast.makeText(ProfileList.this, "Selected :" + " " + profileData, Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList getListData() {
        ArrayList<ProfileItem> profiles = new ArrayList<>();
        ProfileItem profileData = new ProfileItem();
        profileData.setProfileName("Test House");
        profileData.setOwnerName("Test Owner");
        profiles.add(profileData);

        return profiles;
    }
}

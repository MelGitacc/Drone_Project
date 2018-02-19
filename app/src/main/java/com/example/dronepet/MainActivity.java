package com.example.dronepet;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.parrot.arsdk.ARSDK;


public class MainActivity extends AppCompatActivity {

    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;
    static {
        ARSDK.loadSDKLibs();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /*
       perform Onclick listener event for the take off button
        */
    public void handleFragment(View view) {

        Fragment selectedFragment;

        if( view == findViewById(R.id.FloatingBttnFollowMe)){
            Toast.makeText(getApplicationContext(), "follow me is selected", Toast.LENGTH_LONG).show();

        }else if(view == findViewById(R.id.FloatingBttnTakeOff)){
            selectedFragment = new ControlsFragment();
            fragmentManager = getFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, selectedFragment);
            fragmentTransaction.commit();


            Toast.makeText(getApplicationContext(), "take off is selected", Toast.LENGTH_LONG).show();

        }else if(view == findViewById(R.id.FloatingBttnMic)) {

            Toast.makeText(getApplicationContext(), "Mic is selected", Toast.LENGTH_LONG).show();
        }
    }
}



package com.example.dronepet;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
        if(view == findViewById(R.id.FloatingBttnTakeOff)){
         selectedFragment = new ControlsFragment();
         fragmentManager = getFragmentManager();
         fragmentTransaction = fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.fragment, selectedFragment);
         fragmentTransaction.commit();

        }else if(view == findViewById(R.id.FloatingBttnMic)){

        }else if( view == findViewById(R.id.FloatingBttnFollowMe)){

        }
    }
}



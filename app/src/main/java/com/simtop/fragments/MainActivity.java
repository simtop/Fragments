package com.simtop.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Passable{

    public static final String USERNAME = "USERNAME";
    public static final String PASSWORD = "PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        launchFragment(new SectionA(), R.id.sectionA);
    }

    /**
     * This method is called for launching a fragment
     * @param fragment the fragment that will be launched
     * @param fragmentContainer the FrameLayout Id that will contain the fragment
     */
    private void launchFragment(Fragment fragment, int fragmentContainer){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(fragmentContainer, fragment)
                .commit();
    }

    @Override
    public void newCredentials(String username, String password) {
       // Toast.makeText(this, "Username: " + username +
         //       " Password: " + password, Toast.LENGTH_SHORT).show();
        SectionB sectionB = new SectionB();
        Bundle credentials = new Bundle();
        credentials.putString(USERNAME,username);
        credentials.putString(PASSWORD, password);
        sectionB.setArguments(credentials);
        launchFragment(sectionB,R.id.sectionB);

    }
}

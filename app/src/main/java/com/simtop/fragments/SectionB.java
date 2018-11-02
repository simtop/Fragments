package com.simtop.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SectionB extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_section_b,container,false);

        TextView lblUsername = view.findViewById(R.id.lblUsername);
        TextView lblPassword = view.findViewById(R.id.lblPassword);

        Bundle credentials;
        if((credentials = getArguments())!= null){
            lblUsername.setText(credentials.getString(MainActivity.USERNAME));
            lblPassword.setText(credentials.getString(MainActivity.PASSWORD));
        }


        return view;
    }
}

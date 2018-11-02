package com.simtop.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SectionA extends Fragment {

    private Passable passable;
    private EditText txtUsername, txtPassword;
    private Button btnSubmitCredentials;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_section_a, container, false);

        txtUsername = view.findViewById(R.id.txtUsername);
        txtPassword = view.findViewById(R.id.txtPassword);
        btnSubmitCredentials = view.findViewById(R.id.btnSubmitCredentials);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        btnSubmitCredentials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUsername.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();
                if (!username.isEmpty() && !password.isEmpty()){
                    //TODO: Pass data to sectionB Fragment
                    //Done after creating Passable interface
                    passable.newCredentials(username,password);
                }
            }
        });

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            passable = (Passable) context;
        }
        catch (ClassCastException e){
            e.printStackTrace();
        }
    }

}



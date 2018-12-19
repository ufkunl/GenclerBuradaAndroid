package com.example.yldzufk.genclerburada.ui.loginBefore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.yldzufk.genclerburada.LoginBeforeActivity;
import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.base.BaseFragment;
import com.example.yldzufk.genclerburada.ui.common.NavigationController;

public class HomeFragment extends BaseFragment {

    public static HomeFragment fragment;

    public static HomeFragment newInstance() {
        if(fragment != null){
            return fragment;
        }else{
            Bundle args = new Bundle();
            HomeFragment fragment = new HomeFragment();
            fragment.setArguments(args);
            return fragment;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        Button btnUyeol =(Button) view.findViewById(R.id.btnUyeOl);
        Button btnGiris =(Button) view.findViewById(R.id.btnGiris);

        btnUyeol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationController navigationController = new NavigationController((LoginBeforeActivity) getActivity());
                navigationController.navigateToSignUp();

            }
        });

        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationController navigationController = new NavigationController((LoginBeforeActivity) getActivity());
                navigationController.navigateToLogin();
            }
        });

        return view;
    }
}

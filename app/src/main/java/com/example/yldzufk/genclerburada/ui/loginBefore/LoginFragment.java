package com.example.yldzufk.genclerburada.ui.loginBefore;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.style.IconMarginSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextClock;
import android.widget.TextView;

import com.example.yldzufk.genclerburada.LoginBeforeActivity;
import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.base.BaseFragment;
import com.example.yldzufk.genclerburada.ui.common.NavigationController;

public class LoginFragment extends BaseFragment {

    public static LoginFragment fragment;

    NavigationController navigationController;

    public static LoginFragment newInstance() {
        if(fragment != null){
            return fragment;
        }else{
            Bundle args = new Bundle();
            LoginFragment fragment = new LoginFragment();
            fragment.setArguments(args);
            return fragment;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);

        navigationController = new NavigationController((LoginBeforeActivity) getActivity());

        ImageButton btnBack = (ImageButton) view.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        TextView tvForgetPassword = (TextView) view.findViewById(R.id.tvForgetPassword);

        tvForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationController.navigateToForgotPassword();
            }
        });

        TextView tvSignUp = (TextView) view.findViewById(R.id.tvSignUp);

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigationController.navigateToSignUp();
            }
        });

        Button btnSignUp = (Button)view.findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigationController.navigateToLoginAfter();
            }
        });

        return view;
    }


}

package com.example.yldzufk.genclerburada.ui.loginBefore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.yldzufk.genclerburada.LoginBeforeActivity;
import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.base.BaseFragment;
import com.example.yldzufk.genclerburada.ui.common.NavigationController;

public class ForgotPasswordFragment extends BaseFragment {
    public static ForgotPasswordFragment fragment;

    public static ForgotPasswordFragment newInstance() {
        if(fragment != null){
            return fragment;
        }else{
            Bundle args = new Bundle();
            ForgotPasswordFragment fragment = new ForgotPasswordFragment();
            fragment.setArguments(args);
            return fragment;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forgot_password,container,false);

        ImageButton btnBack = (ImageButton) view.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        Button btnSendEmail = (Button) view.findViewById(R.id.btnSendEmail);

        btnSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationController navigationController = new NavigationController((LoginBeforeActivity) getActivity());
                navigationController.navigateToChangePassword();
            }
        });

        return view;
    }
}

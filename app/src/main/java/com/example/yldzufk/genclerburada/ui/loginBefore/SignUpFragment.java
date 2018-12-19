package com.example.yldzufk.genclerburada.ui.loginBefore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.base.BaseFragment;

public class SignUpFragment extends BaseFragment {
    public static SignUpFragment fragment;

    public static SignUpFragment newInstance() {
        if(fragment != null){
            return fragment;
        }else{
            Bundle args = new Bundle();
            SignUpFragment fragment = new SignUpFragment();
            fragment.setArguments(args);
            return fragment;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up,container,false);






        return view;
    }
}

package com.example.yldzufk.genclerburada.ui.loginBefore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.base.BaseFragment;

public class LoginFragment extends BaseFragment {

    public static LoginFragment fragment;

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






        return view;
    }
}

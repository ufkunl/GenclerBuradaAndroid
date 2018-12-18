package com.example.yldzufk.genclerburada.ui.mainBefore;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.yldzufk.genclerburada.MainBeforeActivity;
import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.base.BaseFragment;

import jp.wasabeef.blurry.Blurry;

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

        ImageView ivbackgraund = (ImageView) view.findViewById(R.id.ivBackground);

        Blurry.with((MainBeforeActivity) getActivity())
                .radius(80)
                .sampling(2)
                .from(BitmapFactory.decodeResource(getResources(), R.drawable.backgraund))
                .into(ivbackgraund);
        return view;
    }
}

package com.example.yldzufk.genclerburada.ui.confessionlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yldzufk.genclerburada.MainActivity;
import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.base.BaseFragment;
import com.example.yldzufk.genclerburada.ui.common.NavigationController;

/**
 * Created by PC on 18.12.2018.
 */

public class ConfessionListFragment extends BaseFragment{


    public static ConfessionListFragment fragment;

    public static ConfessionListFragment newInstance() {
        if(fragment != null){
            return fragment;
        }else{
            Bundle args = new Bundle();
            ConfessionListFragment fragment = new ConfessionListFragment();
            fragment.setArguments(args);
            return fragment;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_confession_list,container,false);


       // NavigationController navigationController = new NavigationController((MainActivity) getActivity());



        return view;

    }
}

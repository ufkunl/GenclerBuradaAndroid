package com.example.yldzufk.genclerburada.ui.common;

import android.support.v4.app.FragmentManager;

import com.example.yldzufk.genclerburada.MainBeforeActivity;
import com.example.yldzufk.genclerburada.MainActivity;
import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.ui.main.ConfessionListFragment;
import com.example.yldzufk.genclerburada.ui.mainBefore.HomeFragment;
import com.example.yldzufk.genclerburada.ui.mainBefore.LoginFragment;
import com.example.yldzufk.genclerburada.ui.mainBefore.SignUpFragment;

/**
 * Created by PC on 18.12.2018.
 */

public class NavigationController {

    private FragmentManager fragmentManager;
    private int containerId;

    public NavigationController(MainActivity mainActivity) {
        this.fragmentManager = mainActivity.getSupportFragmentManager();
        this.containerId = R.id.container;
    }

    public NavigationController(MainBeforeActivity mainBeforeActivity) {
        this.fragmentManager = mainBeforeActivity.getSupportFragmentManager();
        this.containerId = R.id.container;
    }

    public void navigateToConfessionList(){
        ConfessionListFragment confessionListFragment = ConfessionListFragment.newInstance();
        fragmentManager.beginTransaction()
                .add(containerId,confessionListFragment)
                .commitAllowingStateLoss();
    }

    public void navigateToHome(){
        HomeFragment homeFragment = HomeFragment.newInstance();
        fragmentManager.beginTransaction()
                .add(containerId,homeFragment)
                .commitAllowingStateLoss();
    }

    public void navigateToLogin(){
        LoginFragment loginFragment = LoginFragment.newInstance();
        fragmentManager.beginTransaction()
                .add(containerId,loginFragment)
                .commitAllowingStateLoss();
    }

    public void navigateToSignUp(){
        SignUpFragment signUpFragment = SignUpFragment.newInstance();
        fragmentManager.beginTransaction()
                .add(containerId,signUpFragment)
                .commitAllowingStateLoss();
    }

}

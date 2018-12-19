package com.example.yldzufk.genclerburada.ui.common;

import android.support.v4.app.FragmentManager;

import com.example.yldzufk.genclerburada.LoginAfterActivity;
import com.example.yldzufk.genclerburada.LoginBeforeActivity;
import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.ui.main.ConfessionListFragment;
import com.example.yldzufk.genclerburada.ui.loginBefore.HomeFragment;
import com.example.yldzufk.genclerburada.ui.loginBefore.LoginFragment;
import com.example.yldzufk.genclerburada.ui.loginBefore.SignUpFragment;

/**
 * Created by PC on 18.12.2018.
 */

public class NavigationController {

    private FragmentManager fragmentManager;
    private int containerId;

    public NavigationController(LoginAfterActivity loginAfterActivity) {
        this.fragmentManager = loginAfterActivity.getSupportFragmentManager();
        this.containerId = R.id.container;
    }

    public NavigationController(LoginBeforeActivity loginBeforeActivity) {
        this.fragmentManager = loginBeforeActivity.getSupportFragmentManager();
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

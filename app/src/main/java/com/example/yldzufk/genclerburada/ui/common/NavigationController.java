package com.example.yldzufk.genclerburada.ui.common;

import android.support.v4.app.FragmentManager;
import com.example.yldzufk.genclerburada.MainActivity;
import com.example.yldzufk.genclerburada.R;
import com.example.yldzufk.genclerburada.ui.confessionlist.ConfessionListFragment;

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

    public void navigateToConfessionList(){
        ConfessionListFragment confessionListFragment = ConfessionListFragment.newInstance();
        fragmentManager.beginTransaction()
                .add(containerId,confessionListFragment)
                .commitAllowingStateLoss();
    }




}

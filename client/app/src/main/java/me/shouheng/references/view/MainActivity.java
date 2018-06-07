package me.shouheng.references.view;

import android.os.Bundle;

import javax.inject.Inject;

import me.shouheng.references.R;
import me.shouheng.references.base.CommonDaggerActivity;
import me.shouheng.references.viewmodel.MainViewModel;

public class MainActivity extends CommonDaggerActivity {

    @Inject
    public MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewModel.log();
    }
}
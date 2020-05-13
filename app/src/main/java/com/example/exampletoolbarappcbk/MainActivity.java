package com.example.exampletoolbarappcbk;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exampletoolbarappcbk.ui.notifications.NotificationsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       getSupportFragmentManager().beginTransaction().add(R.id.nav_host_fragment,new NotificationsFragment()).commitAllowingStateLoss();

    }

}

package com.example.bottommenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView nav = findViewById(R.id.nav);
        nav.setSelectedItemId(R.id.home);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                Intent i = null;
                switch (item.getItemId())
                {
                    case R.id.history:
                        i = new Intent(getApplicationContext(), HistoryActivity.class);
                        break;
                    case R.id.home:
                        i = new Intent(getApplicationContext(), MainActivity.class);
                        break;
                    case R.id.cart:
                        i = new Intent(getApplicationContext(), CartActivity.class);
                        break;
                    case R.id.people:
                        i = new Intent(getApplicationContext(), PeopleActivity.class);
                        break;
                }

                if (i != null)
                {
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }
                return true;
            }
        });
    }
}
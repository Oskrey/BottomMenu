package com.example.bottommenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    BottomNavigationView nav = findViewById(R.id.nav);
        nav.setOnItemSelectedListener(new
        NavigationBarView.OnItemSelectedListener() {
                                                      @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.home:
                        fragment = new HomeFragment();
                        loadFragment(fragment);
                        return true;

                    case R.id.cart:
                        fragment = new CartFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.history:
                        fragment = new HistoryFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.people:
                        fragment = new PeopleFragment();
                        loadFragment(fragment);
                        return true;
                }

                return false;
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainerView, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
package com.example.bottommenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        BottomNavigationView nav = findViewById(R.id.nav);
        nav.setSelectedItemId(R.id.history);
        nav.setOnItemSelectedListener(new
                                              NavigationBarView.OnItemSelectedListener() {
                                                  @Override
                                                  public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                                                      Intent i = null;
                                                      switch (item.getItemId()){
                                                          case R.id.history:
                                                              i = new Intent(getApplicationContext(), History.class);
                                                              break;
                                                          case R.id.home:
                                                              i = new Intent(getApplicationContext(),
                                                                      MainActivity.class);
                                                              break;
                                                      }
                                                      if(i != null) {
                                                          i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                                          startActivity(i);
                                                      }
                                                      return true;
                                                  }
                                              });
    }
}
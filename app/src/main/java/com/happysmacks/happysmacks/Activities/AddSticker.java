package com.happysmacks.happysmacks.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.happysmacks.happysmacks.R;

public class AddSticker extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_add_sticker);
  }
  @Override
  public void onBackPressed() {
    super.onBackPressed();
//        Intent intent = new Intent(this, AddSticker.class);
//        startActivity(intent);
    finishAffinity();
  }
}
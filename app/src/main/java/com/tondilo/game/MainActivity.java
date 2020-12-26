package com.tondilo.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.tondilo.game.imageprocessing.imgprc;
import com.tondilo.mylibrary1.MyClass;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("PayamMain","onCreate");

        MyClass p1=new MyClass();
        String str1=p1.GetString();
        Log.d("PayamMain",str1);

        imgprc p2=new imgprc();
        String str2=p2.GetString();
        Log.d("PayamMain",str2);

        Toast.makeText(this, "salam", Toast.LENGTH_SHORT).show();
    }
}
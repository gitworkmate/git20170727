package a20170727gitdemo.a20170727gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG","MainActivity");
        Log.e("TAG","MainActivitydev");
        Log.e("TAG", "MainActivitybug");
    }
}

package com.example.nishant.sharedpref;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t=(TextView)findViewById(R.id.textView);

        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);

        String string=sharedPreferences.getString("Name",null);
        String string1=sharedPreferences.getString("Email",null);
        String string2=sharedPreferences.getString("Password",null);

        String all = string + " " + string1 + " " +string2 ;
        t.setText(all);
    }
}

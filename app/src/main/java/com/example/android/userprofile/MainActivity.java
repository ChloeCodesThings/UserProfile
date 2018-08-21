package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.headshot);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Chloe");


        TextView birthday= (TextView) findViewById(R.id.birthday);
        birthday.setText("9/13/1989");


        TextView country = (TextView) findViewById(R.id.country);
        country.setText("USA");
    }

}

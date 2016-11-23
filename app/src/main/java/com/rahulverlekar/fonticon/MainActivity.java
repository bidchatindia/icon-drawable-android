package com.rahulverlekar.fonticon;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.FontAwesomeIcons;
import com.rahulverlekar.fonticon.IconMoon.IconMoonIcons;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtNewFont = (TextView) findViewById(R.id.tv_icon);
        Typeface type = Typeface.createFromAsset(getAssets(),"icomoon.ttf");
        txtNewFont.setTypeface(type);
        txtNewFont.setText("\ue905 \ue91d \ue918");

        ImageView ivImage = (ImageView) findViewById(R.id.iv_icon);
        ivImage.setImageDrawable(new IconDrawable(this, IconMoonIcons.iconmoon_bidchat)
                .colorRes(android.R.color.holo_green_light));
    }
}

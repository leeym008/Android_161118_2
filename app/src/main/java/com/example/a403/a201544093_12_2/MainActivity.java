package com.example.a403.a201544093_12_2;

import android.content.res.ObbInfo;
import android.support.v4.media.MediaBrowserCompatUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TV1,TV2;
    CheckBox CB;
    RadioGroup RG;
    RadioButton RB1,RB2,RB3;
    Button B;
    ImageView IV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV1=(TextView)findViewById(R.id.textView1);
        TV2=(TextView)findViewById(R.id.textView2);
        CB = (CheckBox)findViewById(R.id.checkBox1);
        RB1 = (RadioButton)findViewById(R.id.radioButton1);
        RB2 = (RadioButton)findViewById(R.id.radioButton2);
        RB3 = (RadioButton)findViewById(R.id.radioButton3);
        B = (Button)findViewById(R.id.button);
        RG = (RadioGroup)findViewById(R.id.radioGroup1);
        IV = (ImageView)findViewById(R.id.imageView);


        CB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    TV2.setVisibility(View.VISIBLE);
                    RB1.setVisibility(View.VISIBLE);
                    RB2.setVisibility(View.VISIBLE);
                    RB3.setVisibility(View.VISIBLE);
                    B.setVisibility(View.VISIBLE);
                }
                else{
                    TV2.setVisibility(View.INVISIBLE);
                    RB1.setVisibility(View.INVISIBLE);
                    RB2.setVisibility(View.INVISIBLE);
                    RB3.setVisibility(View.INVISIBLE);
                    B.setVisibility(View.INVISIBLE);
                }
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IV.setVisibility(View.VISIBLE);
                if(RB1.isChecked()){
                    IV.setImageResource(R.drawable.a);
                }
                else if(RB2.isChecked()){
                    IV.setImageResource(R.drawable.b);
                }
                if(RB3.isChecked()){
                    IV.setImageResource(R.drawable.c);
                }
            }
        });
    }
}

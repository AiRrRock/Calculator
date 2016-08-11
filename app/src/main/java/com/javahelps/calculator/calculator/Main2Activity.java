package com.javahelps.calculator.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton sound, vibration, silent;
    private Button button;
    private TextView textView;
    private boolean flag=false;

    @Override


            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main2);

                radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);

                radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        // find which radio button is selected
                        if(checkedId == R.id.silent) {
                            Toast.makeText(getApplicationContext(), "Мимо",
                                    Toast.LENGTH_SHORT).show();
                        } else if(checkedId == R.id.sound) {
                            Toast.makeText(getApplicationContext(), "Жми далее",
                                    Toast.LENGTH_SHORT).show();
                                    flag =true;
                        } else {
                            Toast.makeText(getApplicationContext(), "МИМО",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }

                });

                sound = (RadioButton) findViewById(R.id.sound);
                vibration = (RadioButton) findViewById(R.id.vibration);
                silent = (RadioButton) findViewById(R.id.silent);
                textView = (TextView) findViewById(R.id.text);

                button = (Button)findViewById(R.id.chooseBtn);
                button.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        int selectedId = radioGroup.getCheckedRadioButtonId();

                        // find which radioButton is checked by id
                        if(selectedId == sound.getId()) {
                            textView.setText("Пшел вон");
                            onGo();
                        } else if(selectedId == vibration.getId()) {
                            textView.setText("Холодно");
                        } else {
                            textView.setText("Это не 1");
                        }

                    }
                });
            }

    private void onGo(){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
        }



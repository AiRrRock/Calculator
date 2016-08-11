package com.javahelps.calculator.calculator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main3Activity extends Activity {
    private CheckBox blogging, game, music;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blogging = (CheckBox) findViewById(R.id.blogging);
        game = (CheckBox) findViewById(R.id.game);
        music = (CheckBox) findViewById(R.id.music);
        music.setOnClickListener(checkboxClickListener);
        game.setOnClickListener(checkboxClickListener);
        blogging.setOnClickListener(checkboxClickListener);

        /* Set blogging by default */
        blogging.setChecked(true);

    }

    View.OnClickListener checkboxClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();
            if (checked) {
                String text = null;
                switch (view.getId()){
                    case R.id.game:
                        text = "smthin?";
                        break;
                    case R.id.music:
                        text = "smthing2";
                        break;
                    case R.id.blogging:
                        text="smthing";
                        break;
                }
                Toast.makeText(Main3Activity.this, text, Toast.LENGTH_LONG).show();
            }
        }
    };
}
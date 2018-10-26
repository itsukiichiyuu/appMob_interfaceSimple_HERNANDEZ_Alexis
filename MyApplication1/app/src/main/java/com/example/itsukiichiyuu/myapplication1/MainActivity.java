package com.example.itsukiichiyuu.myapplication1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String nameApp = getResources().getString(R.string.app_name);
        Log.i("info",nameApp);

        Date aujourdhui = Calendar.getInstance().getTime();

        TextView T1 = (TextView) findViewById(R.id.textViewHello);
        T1.setText(aujourdhui.toString());

        TextView T2 = (TextView) findViewById(R.id.textMail);

        //************************************************
        //je n'ai pas eu le temps de finir cette section
        //************************************************

       /* T2.addTextChangedListener(new TextWatcher(){
            @Override
            public void afterTextChanged(Editable s ) {
                T2.setText("test");
            }
        });*/

        Button monBouton=(Button)findViewById(R.id.monBouton);
        monBouton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "coucou", Toast.LENGTH_SHORT).show();
            }
        });
        final Switch monSwitch=(Switch)findViewById(R.id.switch1);
        monSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (monSwitch.getText()!="b"){
                    monSwitch.setText("b");
                }
                else
                {
                    monSwitch.setText("a");
                }
            }
        });


        String machaine=getResources().getString(R.string.text_osef);//affiche le string dans le logcat


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
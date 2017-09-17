package com.example.joy.holly_bolly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;

import java.util.ArrayList;
import java.util.Arrays;

import static android.widget.TextView.BufferType.*;

abstract

public class FourActivity extends AppCompatActivity  {
        //private int chances = 10;
        //private int l = 0;
        @Override
        protected void onCreate (Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_four);

            Bundle b = getIntent().getExtras();
            String t1=b.getString("name");
            final ArrayList<CharSequence> slist = new ArrayList<CharSequence>(Arrays.asList(t1.split("")));
            final ArrayList<CharSequence> tlist = new ArrayList<CharSequence>();

             int chances = 10;
             int l = 0;
            l = slist.size();

            Button q = (Button) findViewById(R.id.quit);
            Button r = (Button) findViewById(R.id.restart);
            Button c = (Button) findViewById(R.id.check);
            final EditText m = (EditText) findViewById(R.id.main_text);
            EditText ch = (EditText) findViewById(R.id.Check_box);
            EditText cn = (EditText) findViewById(R.id.chance);
            for (int i = 0; i < l; i++) {
                if (slist.get(i) == " ") {
                    tlist.add("   ");
                } else
                    tlist.add(" _ ");
            }
            m.setText(tlist, EDITABLE);
            cn.setText(chances);

            c.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (chances == 0) {
                        m.setText("OUT OF CHANCES");
                    }
                    while (chances != 0) {
                        int flag = -1;
                        String temp = ch.getText().toString();
                        for (int i = 0; i < l; i++) {

                            if (temp == slist.get(i)) {
                                tlist.set(i, temp.toString());
                                flag++;
                            }

                        }
                        if (flag == -1) {
                            chances--;
                            ch.setText(chances);
                        }
                        m.setText(tlist, EDITABLE);
                    }
                }
            });
            r.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FourActivity.this, threeActivity.class);
                    startActivity(intent);
                }
            });
            q.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                }
            });
        }


    }

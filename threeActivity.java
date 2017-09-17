package com.example.joy.holly_bolly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public abstract class threeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Button st ;
        EditText edit;
        final String s;

        edit =(EditText) findViewById(R.id.text_input) ;
        st=(Button) findViewById(R.id.store);
        s= edit.getText().toString();

        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchactivity1();
            }

         void launchactivity1(){
            Intent intent1 =new Intent(threeActivity.this,FourActivity.class);
            Bundle b=new Bundle();
            //b.putString("name",s);
             Intent intent = intent1.putExtra("name",s);
             startActivity(intent1);
         }
        });
    }

}



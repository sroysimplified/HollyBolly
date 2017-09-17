package com.example.joy.holly_bolly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button launchsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchsecond=(Button) findViewById(R.id.button);
        launchsecond.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View view)
            {
                launchActivity();
            }
        });
    }

    private void launchActivity() {
        Intent intent=new Intent(this,secondActivity.class);
        startActivity(intent);
    }
}

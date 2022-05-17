package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button filterbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filterbtn = findViewById(R.id.filterbtn);

        filterbtn.setOnClickListener(new filterbtn());

    }
    class filterbtn implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Dialog pricerange=new Dialog(MainActivity.this);
            pricerange.setContentView(R.layout.cost_range);
            pricerange.show();
        }
    }


}

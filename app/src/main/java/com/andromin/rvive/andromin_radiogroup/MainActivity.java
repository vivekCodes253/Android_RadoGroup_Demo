package com.andromin.rvive.andromin_radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void go(View v)
    {
        RadioGroup rg = (RadioGroup)findViewById(R.id.rg);

        int option = rg.getCheckedRadioButtonId();
        String output = "";

        switch (option)
        {
            case R.id.rba: output = "You selected option A";
            break;
            case R.id.rbb: output = "You selected option B";
            break;
            case R.id.rbc: output = "You selected option C";
                break;
            case R.id.rbd: output = "You selected option D";
                break;
            default: output = "No buttons selected";

        }

        Toast.makeText(this, output, Toast.LENGTH_SHORT).show();
    }

}

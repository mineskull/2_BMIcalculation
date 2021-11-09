package com.example.androidstudio8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(calcBMI);
    }

    private View.OnClickListener calcBMI = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat nf = new DecimalFormat("0.00");
            EditText fieldheight = (EditText)findViewById(R.id.height);
            EditText fieldweight = (EditText)findViewById(R.id.weight);
            //hight
            double height = Double.parseDouble(fieldheight.getText().toString())/100;
            //weight
            double weight = Double.parseDouble(fieldweight.getText().toString());
            //BMI
            double BMI = weight / (height*height);

            //result
            TextView result = (TextView)findViewById(R.id.result);
            result.setText(getText(R.string.bmi_result)
                    + nf.format(BMI));
        }
    };
}
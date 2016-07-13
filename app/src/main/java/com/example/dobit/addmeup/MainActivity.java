package com.example.dobit.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnResult);
        
        button.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        EditText fn = (EditText) findViewById(R.id.etFn);
                        TextView result = (TextView) findViewById(R.id.tvResult);
                        EditText sn = (EditText) findViewById(R.id.etSn);
                        double firstnum, secondnum, answer;

                        try {


                            firstnum = Double.parseDouble(fn.getText().toString());
                            secondnum = Double.parseDouble(sn.getText().toString());
                            answer = firstnum + secondnum;
                            result.setText(Double.toString(answer));
                        }catch (NumberFormatException e){
                            result.setText("Imvalid input");
                        }
                    }
                }
        );
    }
}

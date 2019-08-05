package com.meterstoinches.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private TextView result;
    private CheckBox mom,dad,grandpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mom=(CheckBox) findViewById(R.id.mom);
        dad=(CheckBox) findViewById(R.id.dad);
        grandpa=(CheckBox) findViewById(R.id.grandpa);
        result=(TextView) findViewById(R.id.result);
        submit=(Button) findViewById(R.id.buttonID);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(mom.getText().toString()+ " status is: "+mom.isChecked()
                + "\n");

                stringBuilder.append(dad.getText().toString()+ " status is: "+dad.isChecked()
                        + "\n");

                stringBuilder.append(grandpa.getText().toString()+ " status is: "+grandpa.isChecked()
                        + "\n");

                result.setText(stringBuilder);

            }
        });

    }
}

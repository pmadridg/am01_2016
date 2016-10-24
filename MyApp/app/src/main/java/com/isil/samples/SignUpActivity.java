package com.isil.samples;

import android.app.Activity;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.os.Bundle;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pablo on 10/23/2016.
 */

public class SignUpActivity extends Activity{

    private TextView txtfecnac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_signup);
        app();
    }
    private void app() {
        // TODO Auto-generated method stub
        txtfecnac =(TextView)findViewById(R.id.lblfecnac);


        txtfecnac.setTag(null);
        events();
    }

    private void events() {
        // TODO Auto-generated method stub
        txtfecnac.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showDialog(100);
            }
        });

    }

    @Override
    @Deprecated
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        switch (id) {
            case 100:
                final Calendar c=Calendar.getInstance();
                c.add(Calendar.YEAR,1);
                int year=c.get(Calendar.YEAR);
                int month=c.get(Calendar.MONTH);
                int day=c.get(Calendar.DAY_OF_MONTH);

                return new DatePickerDialog(this, new OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear,
                                          int dayOfMonth) {
                        // TODO Auto-generated method stub
                        String s= dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
                        Log.v("CONSOLE", "s "+s);
                        txtfecnac.setText(s);
                        txtfecnac.setTag(1);


                    }
                }, year, month, day);

            default:
                break;
        }
        return null;
    }
}

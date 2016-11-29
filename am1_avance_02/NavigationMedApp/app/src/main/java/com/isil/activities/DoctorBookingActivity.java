package com.isil.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pablo on 11/5/2016.
 */

public class DoctorBookingActivity extends Activity{
    private static final String TAG ="DoctorServiceActivity" ;
    private Button btnBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_booking);

        btnBook= (Button)findViewById(R.id.btnBook);

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoResult();
            }
        });
    }

    private void gotoResult() {
        Intent intent = new Intent(DoctorBookingActivity.this,
                DoctorActivity.class);
        startActivity(intent);
        finish();
    }
}

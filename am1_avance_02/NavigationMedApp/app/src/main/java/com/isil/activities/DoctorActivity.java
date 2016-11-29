package com.isil.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.isil.activities.model.DoctorEntity;

import java.util.List;
import com.isil.activities.view.adapters.DoctorAdapter;


/**
 * Created by Pablo on 11/4/2016.
 */

    public class DoctorActivity extends Activity{
    private ListView lstDoctor;
    private List<DoctorEntity> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_main);
        loadData();
        app();

    }
    private void app() {
        ui();
        events();
        //populate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        populate();
    }

    private void populate() {
        DoctorAdapter doctorAdapter= new DoctorAdapter(this,data);
        lstDoctor.setAdapter(doctorAdapter);
    }

    private void loadData() {

        DoctorApplication application= (DoctorApplication)getApplication();
        data= application.getDoctorRepository().allDoctor();
    }

    private void ui() {

        lstDoctor= (ListView)findViewById(R.id.lstDoctor);
    }

    private void events() {

        lstDoctor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                DoctorEntity doctorEntity= (DoctorEntity)adapterView.getAdapter().getItem(position);
                //gotoDoctorDetail(doctorEntity);

            }
        });
    }
    /*private void gotoDoctorDetail(DoctorEntity doctorEntity) {
        Bundle bundle= new Bundle();
        bundle.putSerializable("ENTITY",doctorEntity);


    }*/
}

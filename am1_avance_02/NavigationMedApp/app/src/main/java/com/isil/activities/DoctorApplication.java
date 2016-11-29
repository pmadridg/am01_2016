package com.isil.activities;

import android.app.Application;

import com.isil.activities.storage.DoctorRepository;
import com.isil.activities.storage.LocationRepository;
import com.isil.activities.storage.NoteRepository;

/**
 * Created by Pablo on 11/4/2016.
 */

public class DoctorApplication extends Application {

    private DoctorRepository doctorRepository;
    private LocationRepository locationRepository;
    private NoteRepository noteRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        doctorRepository= new DoctorRepository();
        doctorRepository.mock();
        locationRepository= new LocationRepository();
        locationRepository.mock();
        noteRepository= new NoteRepository();
        noteRepository.mock();
    }

    public DoctorRepository getDoctorRepository() {
        return doctorRepository;
    }


    public LocationRepository getLocRepository() {
        return locationRepository;
    }

    public NoteRepository getNoteRepository() {
        return noteRepository;
    }
}

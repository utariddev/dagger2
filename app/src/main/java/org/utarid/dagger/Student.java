package org.utarid.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Student {
    private String name;
    private String phone;
    private String grade;

    @Inject
    public Student() {
    }

    public void who() {
        Log.d("dagger", "student : " + this);
    }
}

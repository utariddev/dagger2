package org.utarid.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Teacher {
    private String name;
    private String phone;
    private String lesson;

    @Inject
    public Teacher() {
    }

    public void who() {
        Log.d("dagger", "teacher : " + this);
    }
}

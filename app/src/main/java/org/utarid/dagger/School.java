package org.utarid.dagger;

import android.util.Log;

import javax.inject.Inject;

public class School {
    private Student student;
    private Teacher teacher;

    @Inject
    public School(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public void who() {
        Log.d("dagger", "School : " + this);
        student.who();
        teacher.who();
    }
}

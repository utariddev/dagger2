package org.utarid.dagger.di;

import android.util.Log;

import org.utarid.dagger.School;

import javax.inject.Inject;

public class DependencyInjection {
    @Inject
    School school;

    public void di() {
        school.who();
    }
}

package org.utarid.dagger.di;

import org.utarid.dagger.Student;
import org.utarid.dagger.Teacher;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SchoolModule {

    public SchoolModule() {
    }

    @Singleton
    @Provides
    Student provideStudent() {
        return new Student();
    }

    @Singleton
    @Provides
    Teacher provideTeacher() {
        return new Teacher();
    }
}

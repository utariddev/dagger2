package org.utarid.dagger.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SchoolModule.class})
public interface SchoolComponent {
    void inject(DependencyInjection dependencyInjection);
}

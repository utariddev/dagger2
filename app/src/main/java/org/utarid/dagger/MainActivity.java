package org.utarid.dagger;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import org.utarid.dagger.databinding.ActivityMainBinding;
import org.utarid.dagger.di.DaggerSchoolComponent;
import org.utarid.dagger.di.DependencyInjection;
import org.utarid.dagger.di.SchoolModule;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private DependencyInjection di;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        di = new DependencyInjection();
//        SchoolComponent SchoolComponent = DaggerSchoolComponent.builder().schoolModule(new SchoolModule()).build();
        DaggerSchoolComponent.builder().schoolModule(new SchoolModule()).build().inject(di);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                SchoolComponent.inject(di);//her inject e school yenilenir. ama @singleton sayesinde teacher ve student nesnelri aynı kalır
                di.di();
            }
        });
    }
}
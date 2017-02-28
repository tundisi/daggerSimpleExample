package com.nextdots.pruebadagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.nextdots.pruebadagger.di.App;
import com.nextdots.pruebadagger.models.Programador;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // SI hay varios objectos diferentes con named se deben llamar aca @Named ("nombremetodo") @Inject ....
    @Inject Programador programador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getComponentTest().inject(this);
        Toast.makeText(this,programador.getNombre(),Toast.LENGTH_LONG).show();
    }
}

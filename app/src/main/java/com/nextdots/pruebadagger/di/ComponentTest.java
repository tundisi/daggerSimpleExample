package com.nextdots.pruebadagger.di;

import com.nextdots.pruebadagger.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ale on 28/02/2017.
 */

// Si se desea una sola instancia del objeto por aplicacion se coloca singleton aca y arriba de provides en el modulo
@Singleton
@Component(
        modules = {
                ModuleTest.class //Si se desea añadir otro modulo se coloca coma (,) y el otro modulo
            }
)

public interface ComponentTest {
    // Se colocan las actividades donde se va a usar el inject
    void inject(MainActivity mainActivity);
}

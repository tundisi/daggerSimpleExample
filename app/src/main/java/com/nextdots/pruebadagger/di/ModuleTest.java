package com.nextdots.pruebadagger.di;

import com.nextdots.pruebadagger.models.Programador;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ale on 28/02/2017.
 */

@Module
public class ModuleTest {

    // Si se desea una sola instancia del objeto por aplicacion se coloca singleton aca y arriba de component en el interface
    @Singleton
    @Provides // Si se desea hacer otro metodo con el mismo retorno, se debe colocar todos los metodos con @Named ("metodo1"),@Named ("metodo2")
    public Programador providesProgramador(){
        return new Programador("Tundisi");
    }

}

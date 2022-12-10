package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }



    @Test
    public void validarAMayorB()
    {

        int a = 10;

        int b = 1;

        String mensaje = "a > b";


        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);

        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);

        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);


        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);


        algoritmoX.algoritmoACubrir(a,b,mensaje);


        Mockito.verify(dependencia3).send(a,b);

        Mockito.verify(dependencia3).recover();
    }


    @Test
    public void validarAMenorB(){

        int a = 2;

        int b = 7;


        String mensaje = " a < b ";

        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);

        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);

        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);


        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);

        algoritmoX.algoritmoACubrir(a,b,mensaje);
        Mockito.verify(dependencia2).print(a,mensaje);
        Mockito.verify(dependencia3).recover();
    }



    @Test
    public void validarAIgualB(){

        int a = 10;

        int b = 10;

        String mensaje = " a = b ";


        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);

        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);

        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);


        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        algoritmoX.algoritmoACubrir(a,b,mensaje);


        Mockito.verify(dependencia1).save(mensaje);

        Mockito.verify(dependencia3).recover();
    }




}
//.
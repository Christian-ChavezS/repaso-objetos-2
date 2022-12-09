package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas{

    private static SalaDeJuntas salaDeJuntasAInstance;

    public static SalaDeJuntas getInstance(){
        if (salaDeJuntasAInstance != null)
        {

            return salaDeJuntasAInstance;

        }

        salaDeJuntasAInstance = new SalaDeJuntasC();


        return salaDeJuntasAInstance;
    }


    public String getNombre() {
        return "Sala C";
    }





}

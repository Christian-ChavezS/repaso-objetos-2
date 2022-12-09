package uaslp.objetos.escuela;

public class SalaDeJuntasB implements SalaDeJuntas{

    private static SalaDeJuntas salaDeJuntasAInstance;



    public static SalaDeJuntas getInstance(){
        if (salaDeJuntasAInstance != null)
        {

            return salaDeJuntasAInstance;

        }

        salaDeJuntasAInstance = new SalaDeJuntasB();


        return salaDeJuntasAInstance;

    }


    public String getNombre() {
        return "Sala B";
    }




}

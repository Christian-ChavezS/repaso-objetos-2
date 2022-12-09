package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {

    private static SalaDeJuntas salaDeJuntas;

    public static SalaDeJuntas get(String checkSala) {

        if ( checkSala == "Sala A")
        {
            salaDeJuntas = SalaDeJuntasA.getInstance();

        }
        else if( checkSala == "Sala B")
        {
            salaDeJuntas = SalaDeJuntasB.getInstance();

        }
        else if ( checkSala == "Sala C")
        {
            salaDeJuntas = SalaDeJuntasC.getInstance();

        }


        return salaDeJuntas;
    }




}

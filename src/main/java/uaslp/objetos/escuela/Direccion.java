package uaslp.objetos.escuela;

public class Direccion {

    private static Direccion uniqueInstance;

    private Direccion()
    {

    }


    public static Direccion getInstance(){
        if ( uniqueInstance!=null ) {
            return uniqueInstance;

        }


        return uniqueInstance = new Direccion();
    }





}

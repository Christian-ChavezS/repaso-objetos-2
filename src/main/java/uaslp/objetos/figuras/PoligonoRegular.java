package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{

    private double lado;
    private int numeroDeLados;


    public PoligonoRegular(int numeroDeLados){
        super("Poligono Regular");
        this.numeroDeLados = numeroDeLados;
    }


    public PoligonoRegular(int numeroDeLados, double lado){
        super("Poligono Regular");
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }



    public void setLado(double lado) {
         this.lado = lado;
    }


    public double getArea() {
        return (8.6602540378443866*(lado*numeroDeLados))/2;
    }

    public double getLado() {
        return lado;
    }
}

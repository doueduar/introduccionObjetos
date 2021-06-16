package src;

public class circulo {
    private double radio;
    final double pi = 3.141592;
    public circulo(double r){
        radio = r;
    }
    public void area(){
        double areaC = radio*radio*pi;
        System.out.println("El area es: "+areaC);
    }
    public void perimetro(){
        double perimetroC = 2*pi*radio;
        System.out.println("El perimetro es: "+perimetroC);
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
}

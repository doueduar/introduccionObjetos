package src;
public class Principal {
    public static void main(String[] args) {
        Principal ej = new Principal();
    }
    public Principal(){
        // rectangulo evaluar
        rectangulo r = new rectangulo(5,10);
        rectangulo r2 = r;
        r2.setAncho(6);
        r.areaR();
        r.perimetroR();
    }
}

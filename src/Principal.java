package src;
public class Principal {
    public static void main(String[] args) {
        Principal ej = new Principal();
    }
    public Principal(){
        //contador evaluar
        Contador c = new Contador(5);
        Contador c2 = c;
        c2.setContador(8);
        c.decremento();
        c.incremento();
        // cuadrado
        cuadrado cuadro = new cuadrado(6);
        cuadrado cuadro2 = cuadro;
        cuadro2.setLado(4);
        cuadro.area();
        cuadro.perimetro();
        //circulo
        circulo circu = new circulo(5);
        circulo circu2 = circu;
        circu2.setRadio(9);
        circu.area();
        circu.perimetro();
        //libro
        libro li = new libro("Que paso ayer");
        libro li2 = li;
        li2.setLibro("animal");
        li.prestar();
        li.informacion();
        li2.devolver();
        li.informacion();
        // rectangulo evaluar
        rectangulo r = new rectangulo(5,10);
        rectangulo r2 = r;
        r2.setAncho(6);
        r.areaR();
        r.perimetroR();
        System.out.print("\n");
        //fracciones
        

    }
}

package src;
import java.util.*;

public class Contador {
    private int n;
    Scanner scanner = new Scanner(System.in);
    // Contador por defecto
    public Contador(){
        n =0;
    }

    // Contador con parametros
    public Contador(int num){
        this.n = num;
        System.out.println("ingrese el valor del numero"+n);
    }

    public int getContador(){
        return n;
    }
    public void setContador(int num){
        n = num;
    }
    public void incremento(){
        n++;
    }
    public void decremento(){
        n--;
    }
}

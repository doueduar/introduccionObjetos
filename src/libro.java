package src;

public class libro {
    private String libro;
    private boolean estado;

    public libro(){
        libro = "";
    }
    public libro(String libro){
        this.libro = libro;
        estado = true;
    }
    public void prestar(){  
        if (estado) {
            estado = false;
        }else{
            System.out.println("no esta disponible");
        }
    }
    public void devolver(){
        if (!estado) {
            estado = true;
        }else{
            System.out.println("NO fue prestado");
        }
    }
    public void informacion(){
        System.out.print("Nombre del libro: "+libro+" estado: "+estado);
    }
    public void setLibro(String libro){
        this.libro = libro;
    }
    public String getLibro() {
        return libro;
    }
}

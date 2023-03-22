package patronesdisenotercerparcialpractica.ejercicio1;

public abstract class Pocion extends Decorator{

    private String tipo; 

    

    public Pocion(Componente componente, String tipo) {
        super(componente);
        this.tipo = tipo;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}

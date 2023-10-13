package pokemon;

public class Movimiento{
    private String nombre;
    private int puntosdeAtaque,pp;
    private Tipo tipo;

    public Movimiento(String nombre,int puntosdeAtaque,int pp,Tipo tipo){
        this.nombre=nombre;
        this.puntosdeAtaque=puntosdeAtaque;
        this.pp=pp;
        this.tipo=tipo;

    }

    
}
package pokemon;

public class Movimiento{
    private String nombre;
    private int puntosdeAtaque,pp;
    private Tipo tipo;
    private Clase ataqueTipo;


    
  
    public Movimiento(String nombre, int puntosdeAtaque,Tipo tipo, int pp, Clase ataqueTipo) {
        this.nombre = nombre;
        this.puntosdeAtaque = puntosdeAtaque;
        this.tipo = tipo;
        this.pp = pp;
        this.ataqueTipo = ataqueTipo;
        
    }

    

    public String getNombre() {
        return nombre;
    }
    public int getPuntosdeAtaque() {
        return puntosdeAtaque;
    }
    public int getPp() {
        return pp;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setPp(int pp) {
        this.pp = pp;
    }
      public pokemon.Clase getClase() {
        return ataqueTipo;
    }


} 

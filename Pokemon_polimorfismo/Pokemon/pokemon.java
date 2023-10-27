package pokemon;

public abstract class Pokemon {
    
    private int nivel;
    private Tipo tipo;
    private int ps;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;

   
    private Movimiento movimientos[];

    public Pokemon(int nivel, Tipo tipo, int ps, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int veloidad) {
        
        this.nivel=nivel;
        this.tipo = tipo; 
        this.ps = ps;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.movimientos = new Movimiento[4];
    }

    public int getHp() {
        return hp;
    }

    public int getNivel() {
        return nivel;
    }
    

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
    

    public void setMovimiento(int indice,Movimiento movimientos) {
        this.movimientos[indice] = movimientos;
    }

    public Movimiento getMovimiento(int indice) {
        return movimientos[indice];
    }

    private void calcularDanio(int danio,double efectividad){
        double puntosRestados=danio*efectividad;
        this.hp-=puntosRestados;
        System.out.printf("%s recibe %.2f puntos de danio\n",
                this.getNombre(),puntosRestados);
    }
    
    public void recibirAtaque(Movimiento movimiento,double efectividad){
        System.out.printf("%s recibe ATK %s\n",this.getNombre(),movimiento.getNombre());
        calcularDanio(movimiento.getPuntosdeAtaque(),efectividad);
    }

    protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon){
        System.out.printf("%s ataca a %s\n",this.getNombre(),pokemon.getNombre(),movimiento.getNombre());
        double efectividad = obtenerEfectividad(pokemon);
        
        if(movimiento.getPp()>0){
            pokemon.recibirAtaque(movimiento, efectividad);
            return true;
        }else{
            System.err.println("El movimiento no tiene punto de pp");
            return false;
        }
    }
    
    public void atacar(int m, Pokemon pokemon){
        Movimiento movimiento = getMovimiento(m);
        boolean seHaConcretadoAtaque = seHaConcretadoAtaque(movimiento, pokemon);
        if(seHaConcretadoAtaque) {
            pokemon.getMovimiento(m).setPp(movimiento.getPp() - 1);
        }
    }

    public abstract double obtenerEfectividad(Pokemon pokemon);

}

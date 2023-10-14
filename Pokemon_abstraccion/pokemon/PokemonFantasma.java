package pokemon;

public class PokemonFantasma extends Pokemon {
    public PokemonFantasma(String nombre,Tipo tipo,int nivel) {
        super (nombre,Tipo.FANTASMA,nivel);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimiento(0,listaMovimientos.buscarMovimientoPorNombre("Puño sombra"));
        setMovimiento(1,listaMovimientos.buscarMovimientoPorNombre("Lengüetazo"));
        setMovimiento(2,listaMovimientos.buscarMovimientoPorNombre("Golpe bajo"));
        setMovimiento(3,listaMovimientos.buscarMovimientoPorNombre("Vendetta"));

    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo()==Tipo.ELECTRICO)efectividad=1;
        if(pokemon.getTipo()==Tipo.SINIESTRO)efectividad=2;
        return efectividad;
    }
}

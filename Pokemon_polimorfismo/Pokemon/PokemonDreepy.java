package pokemon;

public class PokemonDreepy extends Pokemon {
    public PokemonDreepy() {
       super("Dreepy",50, Tipo.DRAGONFANTASMA, 28, 60, 30, 40, 30, 82);

    }
        ListaMovimientos listaMovimientos = new ListaMovimientos();{

        setMovimiento(0,listaMovimientos.buscarMovimientoPorNombre("Maldicíon"));
        setMovimiento(1,listaMovimientos.buscarMovimientoPorNombre("Impresionar"));
        setMovimiento(2,listaMovimientos.buscarMovimientoPorNombre("Bola sombra"));
        setMovimiento(3,listaMovimientos.buscarMovimientoPorNombre("Ataque Ala"));
    }


    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo()==Tipo.NORMAL)efectividad=1;
        if(pokemon.getTipo()==Tipo.SINIESTRO)efectividad=2;
        return efectividad;
    }
}
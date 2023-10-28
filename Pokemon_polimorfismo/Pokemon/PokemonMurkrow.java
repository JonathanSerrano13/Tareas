package pokemon;

public class PokemonMurkrow extends Pokemon {
    public PokemonMurkrow() {
        super("Murkrow",50, Tipo.SINIESTRO, 60, 85, 42, 85, 42, 91);
    }


        ListaMovimientos listaMovimientos = new ListaMovimientos();{

        setMovimiento(0,listaMovimientos.buscarMovimientoPorNombre("Picotazo"));
        setMovimiento(1,listaMovimientos.buscarMovimientoPorNombre("Golpe Bajo"));
        setMovimiento(2,listaMovimientos.buscarMovimientoPorNombre("Ataque Ala"));
        setMovimiento(3,listaMovimientos.buscarMovimientoPorNombre("Finta"));

    }


    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo()==Tipo.AGUA)efectividad=1;
        if(pokemon.getTipo()==Tipo.DRAGONFANTASMA)efectividad=2;
        return efectividad;
    }
}


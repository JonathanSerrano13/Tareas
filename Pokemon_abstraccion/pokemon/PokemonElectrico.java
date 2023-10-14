package pokemon;

public class PokemonElectrico extends Pokemon {
    public PokemonElectrico(String nombre, Tipo tipo,int nivel) {
        super (nombre,Tipo.ELECTRICO,nivel);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimiento(0,listaMovimientos.buscarMovimientoPorNombre("Impactrueno"));
        setMovimiento(1,listaMovimientos.buscarMovimientoPorNombre("Bola voltio"));
        setMovimiento(2,listaMovimientos.buscarMovimientoPorNombre("Ataque rapido"));
        setMovimiento(3,listaMovimientos.buscarMovimientoPorNombre("Chispa"));
    }


    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo()==Tipo.FANTASMA)efectividad=1;
        if(pokemon.getTipo()==Tipo.AGUA)efectividad=2;
        return efectividad;
    }
}

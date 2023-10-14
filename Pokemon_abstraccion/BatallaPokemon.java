import pokemon.PokemonElectrico;
import pokemon.PokemonFantasma;
import pokemon.Tipo;

public class BatallaPokemon {

    public static void main(String[] args) {
        PokemonElectrico pokemonElectrico=new PokemonElectrico("Pikachu",Tipo.ELECTRICO,10);
        PokemonFantasma pokemonFantasma=new PokemonFantasma("Gengar" ,Tipo.FANTASMA,10);
        pokemonElectrico.atacar(1,pokemonFantasma);
        System.out.println("Hp = "+pokemonFantasma.getHp());
        pokemonFantasma.atacar(2,pokemonElectrico);
        System.out.println("Hp = "+pokemonElectrico.getHp());

    }
}


import pokemon.PokemonDreepy;
import pokemon.PokemonMurkrow;

public class BatallaPokemon {

    public static void main(String[] args) {
        PokemonDreepy PokemonDreepy=new PokemonDreepy();
        PokemonMurkrow PokemonMurkrow=new PokemonMurkrow();
        PokemonDreepy.atacar(1,PokemonMurkrow);
        System.out.println("Ps = "+PokemonMurkrow.getPs());
        PokemonMurkrow.atacar(2,PokemonDreepy);
        System.out.println("Ps = "+PokemonDreepy.getPs());

    }
}


public class BatallaPokemon {

    public static void main(String[] args) {
        PokemonElectrico pokemonElectrico=new PokemonElectrico("Pikachu","PokemonElectrico",10);
        PokemonFantasma pokemonFantasma=new PokemonFantasma("Gengar" ,"PokemonFantasma",10);    
        pokemonElectrico.atacar("Rayitos relampagos",pokemonFantasma);
        pokemonFantasma.recibirAtaque("Rayitos relampagos");
        System.out.println("Hp = "+pokemonFantasma.getHp());
        pokemonFantasma.atacar("Sombra espectral",pokemonElectrico);
        pokemonElectrico.recibirAtaque("Sombra espectral");
        System.out.println("Hp = "+pokemonElectrico.getHp());

    }
}

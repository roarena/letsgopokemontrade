package eu.rodrigocamara.letsgopokemontrade.data.utils;

import eu.rodrigocamara.letsgopokemontrade.data.models.pokemons.Pokemon;
import eu.rodrigocamara.letsgopokemontrade.data.models.pokemons.Stats;

public class DataUtils {

    public static Pokemon createTestPokemon() {
        Pokemon testPokemon;
        testPokemon = new Pokemon();
        testPokemon.setName("Nidoking");
        testPokemon.setLevel(54);
        testPokemon.setIdTrainer("12345");
        testPokemon.setIvStatus("Amazing");
        testPokemon.setSex("Male");
        testPokemon.setNature("Impish");
        testPokemon.setShiny(false);
        testPokemon.setStats(new Stats(368, 337, 319, 318, 307,
                306, "Best", "Best", "Best", "Best",
                "Fantastic", "Best"));

        return testPokemon;
    }
}

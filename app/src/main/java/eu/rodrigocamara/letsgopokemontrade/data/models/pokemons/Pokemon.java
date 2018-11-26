package eu.rodrigocamara.letsgopokemontrade.data.models.pokemons;

public class Pokemon {
    private String name;
    private String sex;
    private String nature;
    private String ivStatus;
    private String idTrainer;
    private int level;
    private boolean isShiny = false;
    private Stats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isShiny() {
        return isShiny;
    }

    public void setShiny(boolean shiny) {
        isShiny = shiny;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getIvStatus() {
        return ivStatus;
    }

    public void setIvStatus(String ivStatus) {
        this.ivStatus = ivStatus;
    }

    public String getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(String idTrainer) {
        this.idTrainer = idTrainer;
    }
}

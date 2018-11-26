package eu.rodrigocamara.letsgopokemontrade.data.models.pokemons;

public class Stats {
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int speedDefence;
    private int speedAttack;
    private String ivHp;
    private String ivAttack;
    private String ivDefense;
    private String ivSpeed;
    private String ivSpeedDefence;
    private String ivSpeedAttack;

    public Stats(int hp, int attack, int defense, int speed, int speedDefence, int speedAttack,
                 String ivHp, String ivAttack, String ivDefense,
                 String ivSpeed, String ivSpeedDefence, String ivSpeedAttack) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.speedDefence = speedDefence;
        this.speedAttack = speedAttack;
        this.ivHp = ivHp;
        this.ivAttack = ivAttack;
        this.ivDefense = ivDefense;
        this.ivSpeed = ivSpeed;
        this.ivSpeedDefence = ivSpeedDefence;
        this.ivSpeedAttack = ivSpeedAttack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedDefence() {
        return speedDefence;
    }

    public void setSpeedDefence(int speedDefence) {
        this.speedDefence = speedDefence;
    }

    public int getSpeedAttack() {
        return speedAttack;
    }

    public void setSpeedAttack(int speedAttack) {
        this.speedAttack = speedAttack;
    }

    public String getIvHp() {
        return ivHp;
    }

    public void setIvHp(String ivHp) {
        this.ivHp = ivHp;
    }

    public String getIvAttack() {
        return ivAttack;
    }

    public void setIvAttack(String ivAttack) {
        this.ivAttack = ivAttack;
    }

    public String getIvDefense() {
        return ivDefense;
    }

    public void setIvDefense(String ivDefense) {
        this.ivDefense = ivDefense;
    }

    public String getIvSpeed() {
        return ivSpeed;
    }

    public void setIvSpeed(String ivSpeed) {
        this.ivSpeed = ivSpeed;
    }

    public String getIvSpeedDefence() {
        return ivSpeedDefence;
    }

    public void setIvSpeedDefence(String ivSpeedDefence) {
        this.ivSpeedDefence = ivSpeedDefence;
    }

    public String getIvSpeedAttack() {
        return ivSpeedAttack;
    }

    public void setIvSpeedAttack(String ivSpeedAttack) {
        this.ivSpeedAttack = ivSpeedAttack;
    }
}

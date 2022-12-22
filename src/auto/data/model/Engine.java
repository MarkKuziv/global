package auto.data.model;

import auto.data.enums.TypeFuelEnum;

public class Engine {
    private final int id;
    private TypeFuelEnum typeFuelEnum;
    private float power;
    private int hp;

    public Engine(int id,TypeFuelEnum typeFuelEnum, float power, int hp) {
        this.id = id;
        this.typeFuelEnum = typeFuelEnum;
        this.power = power;
        this.hp = hp;
    }

    public TypeFuelEnum getTypeFuelEnum() {
        return typeFuelEnum;
    }

    public void setTypeFuelEnum(TypeFuelEnum typeFuelEnum) {
        this.typeFuelEnum = typeFuelEnum;
    }

    public int getId() {
        return id;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", typeFuelEnum=" + typeFuelEnum +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}

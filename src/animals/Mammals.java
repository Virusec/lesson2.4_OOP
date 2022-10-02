package animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String livingEnvironment;
    private final int speed;

    public Mammals(String name, int year, String livingEnvironment, int speed) {
        super(name, year);
        this.speed = Math.max(speed, 0);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (isNull(livingEnvironment)) {
            this.livingEnvironment = "Не задано";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public abstract void walking();

    @Override
    public void eat() {
        System.out.println("Кушать");
    }

    @Override
    public void move() {
        System.out.println("Перемещаться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }
}

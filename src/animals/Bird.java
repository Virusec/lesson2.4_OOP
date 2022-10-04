package animals;

import java.util.Objects;

public abstract class Bird extends Animals {
    private String livingEnvironment;

    public Bird(String name, int year, String livingEnvironment) {
        super(name, year);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (isNull(livingEnvironment)) {
            this.livingEnvironment = "Не задано";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public abstract void hunt();

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
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}

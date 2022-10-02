package animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int year, String livingEnvironment) {
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

    public void hunt() {
        System.out.println("Пора на охоту");
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Amphibians{" + "name='" + getName() + '\'' +
                ", year=" + getYear() + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}

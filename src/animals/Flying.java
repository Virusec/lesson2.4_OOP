package animals;

import java.util.Objects;

public class Flying extends Bird {
    private final String typeOfMovement;

    public Flying(String name, int year, String livingEnvironment, String typeOfMovement) {
        super(name, year, livingEnvironment);
        if (isNull(typeOfMovement)) {
            this.typeOfMovement = "Летает";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    private void fly() {
        System.out.println("Летать");
    }

    @Override
    public void hunt() {
        System.out.println("Пора на охоту");
    }

    @Override
    public void eat() {
        System.out.println("Кушаем!");
    }

    @Override
    public void move() {
        System.out.println("Летим!");
    }

    @Override
    public String toString() {
        return "Bird(Flying){" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() + '\'' +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}

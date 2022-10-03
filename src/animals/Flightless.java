package animals;

import java.util.Objects;

public class Flightless extends Bird {
    private final String typeOfMovement;

    public Flightless(String name, int year, String livingEnvironment, String typeOfMovement) {
        super(name, year, livingEnvironment);
        if (isNull(typeOfMovement)) {
            this.typeOfMovement = "Двигается по земле";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    private void walking() {
        System.out.println("Идти гулять");
    }

    @Override
    public void hunt() {
        System.out.println("Охотиться");
    }

    @Override
    public void eat() {
        System.out.println("Еда!!!");
    }

    @Override
    public void move() {
        System.out.println("Перемещаемся!");
    }

    @Override
    public String toString() {
        return "Bird(Flightless){" +
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
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}

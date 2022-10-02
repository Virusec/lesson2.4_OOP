package animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String foodType;

    public Herbivores(String name, int year, String livingEnvironment, int speed, String foodType) {
        super(name, year, livingEnvironment, speed);
        setFoodType(foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        if (isNull(foodType)) {
            this.foodType = "Вода";
        } else {
            this.foodType = foodType;
        }
    }

    private void shepherd() {
        System.out.println("Пастись");
    }

    @Override
    public void walking() {
        System.out.println("Гуляю");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String toString() {
        return "Mammals(Herbivores){" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() + '\'' +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", speed=" + getSpeed() +
                ", foodType='" + foodType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(foodType, that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }
}

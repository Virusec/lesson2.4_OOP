package animals;

import java.util.Objects;

public class Predators extends Mammals {
    private String foodType;

    public Predators(String name, int year, String livingEnvironment, int speed, String foodType) {
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

    public void hunt() {
        System.out.println("Охотиться");
    }

    @Override
    public void walking() {
        System.out.println("Гуляю");
    }

    @Override
    public void eat() {
        System.out.println("Мясо!!!");
    }

    @Override
    public void move() {
        System.out.println("Перемещаемся!");
    }

    @Override
    public String toString() {
        return "Mammals(Predators){" +
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
        Predators predators = (Predators) o;
        return Objects.equals(foodType, predators.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }
}

package animals;

import java.util.Objects;

public abstract class Animals {
    private final String name;
    private int year;

    public Animals(String name, int year) {
        if (isNull(name)) {
            this.name = "Animal";
        }else {
            this.name = name;
        }
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("Спать");
    }

    public abstract void move();

    public boolean isNull(String value) {
        return value == null || value.isEmpty() || value.isBlank();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return year == animals.year && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}

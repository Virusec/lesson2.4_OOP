package transport;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String colorBody,
               int maxSpeed) {
        super(brand,
                model,
                productionYear,
                productionCountry,
                colorBody,
                maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Можно заправлять бензином или дизелем!");
    }

}

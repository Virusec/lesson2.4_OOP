package transport;

public class Train extends Transport {
    private final int cost;
    private int time;
    private final String departureStation;
    private final String arrivalStation;
    private int numOfWagons;

    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String colorBody,
                 int maxSpeed,
                 int cost,
                 int time,
                 String departureStation,
                 String arrivalStation,
                 int numOfWagons) {
        super(brand, model, productionYear, productionCountry, colorBody, maxSpeed);
        this.cost = cost;

        setTime(time);

        if (isNull(departureStation)) {
            this.departureStation = "Информация уточняется";
        } else {
            this.departureStation = departureStation;
        }

        if (isNull(arrivalStation)) {
            this.arrivalStation = "Информация уточняется";
        } else {
            this.arrivalStation = arrivalStation;
        }

        setNumOfWagons(numOfWagons);
    }

    public int getCost() {
        return cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time < 0) {
            this.time = 0;
        } else {
            this.time = time;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public int getNumOfWagons() {
        return numOfWagons;
    }

    public void setNumOfWagons(int numOfWagons) {
        if (numOfWagons <= 0) {
            this.numOfWagons = 2;
        } else {
            this.numOfWagons = numOfWagons;
        }
    }

    @Override
    public void refuel() {
        System.out.println("Нужно заправлять дизелем!");
    }
}

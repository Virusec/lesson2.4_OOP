package transport;

import java.time.LocalDate;

public class Car extends Transport {

    public static class Insurance {
        private final LocalDate expirationDate;
        private final double cost;
        private final String number;

        public Insurance() {
            this(null, 0, null);
        }

        public Insurance(LocalDate expirationDate, double cost, String number) {
            if (expirationDate == null) {
                this.expirationDate = LocalDate.now().plusDays(365);
            } else {
                this.expirationDate = expirationDate;
            }

            if (cost < 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }

            if (number == null) {
                this.number = "111_111_111";
            } else {
                this.number = number;
            }
        }

        public LocalDate getExpirationDate() {
            return expirationDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkInsuranceDate() {
            if (LocalDate.now().isAfter(expirationDate)) {
                System.out.println("Срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumberOfInsurance() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
                return;
            }
            char[] chars = number.toCharArray();
            int a = 0;
            for (int i = 0; i < number.length(); i++) {
                if (!(Character.isDigit(chars[i]))) {
                    a++;
                }
            }
            if (a > 0) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    public static class Key {

        private final String remoteEngineStart;
        private final String keylessAccess;

        public Key() {
            this("Не установлено", "Не установлено");
        }

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "Не установлено";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }

            if (keylessAccess == null || keylessAccess.isBlank()) {
                this.keylessAccess = "Не установлено";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Удаленный запуск - " + remoteEngineStart +
                    ", безключевой доступ - " + keylessAccess + ".";
        }
    }

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private String tires;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String colorBody,
               int maxSpeed,
               double engineVolume,
               String transmission,
               String bodyType,
               String registrationNumber,
               int seats,
               String tires,
               Key key,
               Insurance insurance) {

        super(brand, model, productionYear, productionCountry, colorBody, maxSpeed);
        setEngineVolume(engineVolume);
        setTransmission(transmission);

        if (isNull(bodyType)) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        setRegistrationNumber(registrationNumber);

        if (seats < 0) {
            this.seats = 4;
        } else {
            this.seats = seats;
        }

        setTires(tires);
        setKey(key);
        setInsurance(insurance);
    }

    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String colorBody,
               int maxSpeed,
               Double engineVolume,
               String tires) {
        this(brand,
                model,
                productionYear,
                productionCountry,
                colorBody,
                maxSpeed,
                engineVolume,
                tires,
                "Cедан",
                "X000xx000",
                4,
                "Ручная",
                new Key(),
                new Insurance());
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (isNull(transmission)) {
            this.transmission = "Ручная";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (isNull(registrationNumber) || !(registrationNumber.matches("[А-Я]\\d\\d\\d[А-Я][А-Я]\\d\\d\\d"))) {
            System.out.println("Не корректный номер");
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        if (isNull(tires)) {
            this.tires = "Лето";
        } else {
            this.tires = tires;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public void changeTires() {
        if (tires.equals("Лето")) {
            setTires("Зима");
        } else {
            setTires("Лето");
        }
    }

    @Override
    public void refuel() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных " +
                "электрод-парковках, если это электрокар");
    }
}

package transport;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                "Kalina",
                2019,
                "Россия",
                "красный",
                100,
                1.5,
                "Ручная",
                "Седан",
                "А001АВ777",
                4,
                "Лето",
                new Car.Key(),
                new Car.Insurance());
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германия",
                "черный",
                260,
                3.0,
                "Автомат",
                "Седан",
                "А111НВ750",
                4,
                "Зима", new Car.Key(),
                new Car.Insurance());
        Car bmw = new Car("BMW",
                "Z8",
                2021,
                "Германия",
                "черный",
                320,
                3.0,
                "Автомат",
                "Купе",
                "Н111КН777",
                2,
                "Лето", new Car.Key(),
                new Car.Insurance());
        Car kia = new Car("Kia",
                "Sportage 4 поколение",
                2018,
                "Южная Корея",
                "красный",
                180,
                2.4,
                "Автомат",
                "Кроссовер",
                "С462КН778",
                5,
                "Зима", new Car.Key(),
                new Car.Insurance());
        Car hyundai = new Car("Hyundai",
                "Avante",
                2016,
                "Южная Корея",
                "оранжевый",
                150,
                1.6,
                "Ручная",
                "Универсал",
                "Т612ЕН777",
                5,
                "Зима",
                new Car.Key("Установлено", "Не установлено"),
                new Car.Insurance(LocalDate.now(),
                        10000,
                        "123456789"));

        Train lastochka = new Train("Ласточка",
                "B-901",
                2011,
                "Россия",
                null,
                301,
                3500,
                80,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11);
        Train leningrad = new Train("Ленинград",
                "D-125",
                2019,
                "Россия",
                "синий",
                270,
                1700,
                55,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8);

        Bus aeroTown = new Bus("Hyundai",
                "Aero Town",
                2012,
                "Южная Корея",
                "красный",
                140);
        Bus aurora = new Bus("ПАЗ",
                "Аврора",
                2005,
                "Россия",
                "синий",
                100);
        Bus crafter = new Bus("Volkswagen",
                "Crafter",
                2020,
                "Германия",
                "",
                180);
        printCarInfo(lada);
        lada.changeTires();
        lada.setRegistrationNumber("А123РРw123");

        Car.Insurance basicInsurance = new Car.Insurance(LocalDate.of(2022, Month.MAY, 10), 2000, "555as123");
        basicInsurance.checkInsuranceDate();
        basicInsurance.checkNumberOfInsurance();
        printCarInfo(hyundai);
        hyundai.getInsurance().checkInsuranceDate();
        printCarInfo(lada);

        printTrainInfo(lastochka);
        printBusInfo(crafter);
        crafter.refuel();
    }

    private static void printBusInfo(Bus bus) {
        System.out.println("Марка - " + bus.getBrand() + ", " +
                "модель - " + bus.getModel() +
                ", год выпуска: " + bus.getProductionYear() +
                ", страна производитель: " + bus.getProductionCountry() +
                ", цвет: " + bus.getColorBody() +
                ", максимальная скорость: " + bus.getMaxSpeed() + ".");
    }

    private static void printTrainInfo(Train train) {
        System.out.println("Марка - " + train.getBrand() + ", " +
                "модель - " + train.getModel() +
                ", год выпуска: " + train.getProductionYear() +
                ", страна производитель: " + train.getProductionCountry() +
                ", цвет: " + train.getColorBody() +
                ", максимальная скорость: " + train.getMaxSpeed() +
                " км/ч, цена: " + train.getCost() +
                " рублей, время поездки: " + train.getTime() +
                " мин. Название станции отбытия - " + train.getDepartureStation() +
                ", конечная остановка - " + train.getArrivalStation() +
                ", количество вагонов: " + train.getNumOfWagons() + ".");
    }

    private static void printCarInfo(Car car) {
        System.out.println("Марка - " + car.getBrand() + ", " +
                "модель - " + car.getModel() +
                ", год выпуска: " + car.getProductionYear() +
                ", страна производитель: " + car.getProductionCountry() +
                ", цвет: " + car.getColorBody() +
                ", максимальная скорость: " + car.getMaxSpeed() +
                ", объём двигателя: " + car.getEngineVolume() +
                ", КПП - " + car.getTransmission() +
                ", кузов: " + car.getBodyType() +
                ", рег.номер: " + car.getRegistrationNumber() +
                ", количество мест - " + car.getSeats() +
                ", резина - " + car.getTires() +
                ", " + car.getKey() +
                ", номер страховки: " + car.getInsurance().getNumber() +
                ", цена: " + car.getInsurance().getCost() +
                ", дата окончания: " + car.getInsurance().getExpirationDate() + ".");
    }

}
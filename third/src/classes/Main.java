package classes;
import classes.car.Car;
import classes.car.enums.CarBodyType;
import classes.car.enums.CarEngineType;
import classes.car.heirs.BusinessClassCar;

import java.util.Arrays;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
        BusinessClassCar businessClassCar = new BusinessClassCar("Mercedes", "Class C", 33, 44,
                445, 220, CarBodyType.SEDAN, CarEngineType.DIESEL, "1223");

        TaxiCompany station = new TaxiCompany("Yandex");
        station.addCar(businessClassCar);

        System.out.println("Sorted:");
        station.sortCars();

        System.out.println("Cost of taxi station: " + station.calculateCost() + "$");
        station.findNecessaryCar();

    }
}

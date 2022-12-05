package classes.car.heirs;

import classes.car.Car;
import classes.car.enums.CarBodyType;
import classes.car.enums.CarEngineType;
import classes.car.enums.Category;

public class BusinessClassCar extends Car
{
    static Category category = Category.BUSINESS;
    public BusinessClassCar(String brand, String model, double powerReserve, double fuelConsumption,
                            double cost, double speed, CarBodyType bodyType, CarEngineType engineType, String number)
    {
        super(brand, model, powerReserve, fuelConsumption, cost, speed, bodyType, engineType, number, category);
    }
}

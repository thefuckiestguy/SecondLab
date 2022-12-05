package classes.car;

import classes.car.enums.CarBodyType;
import classes.car.enums.CarEngineType;
import classes.car.enums.Category;

public class Car implements Comparable<Car>
{
    private String brand;

    protected String model;
    private double powerReserve; // запас хода
    private double fuelConsumption; // расход
    private double cost;

    private double speed;

    String number;
    private Category category;
    private CarBodyType bodyType;
    private CarEngineType engineType;

    public Car(String brand, String model, double powerReserve, double fuelConsumption, double cost, double speed,
               CarBodyType bodyType, CarEngineType engineType, String number, Category category)
    {
        this.brand = brand;
        this.powerReserve = powerReserve;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.model = model;
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.number = number;
        this.category = category;
    }

    public String getNumber()
    {
        return number;
    }

    public String getModel()
    {
        return model;
    }

    public double getSpeed()
    {
        return speed;
    }

    public String getBrand()
    {
        return brand;
    }

    public double getFuelConsumption()
    {
        return fuelConsumption;
    }

    public double getPowerReserve()
    {
        return powerReserve;
    }

    public double getCost()
    {
        return cost;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "speed=" + speed +
                ", fuelConsumption=" + fuelConsumption +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                ", engineType=" + engineType +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o)
    {
        return (int) (this.getFuelConsumption() - o.getFuelConsumption());
    }
}

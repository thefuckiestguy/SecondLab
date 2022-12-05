package classes;

import classes.car.Car;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaxiCompany
{
    private String name;
    private Map<String, Car> cars;

    public TaxiCompany(String name)
    {
        this.name = name;
        this.cars = new HashMap<>();
    }

    public void addCar(Car car)
    {
        cars.put(car.getNumber(), car);
    }

    public void removeCar(Car car)
    {
        if (cars.containsKey(car.getNumber()))
        {
            cars.remove(car.getNumber());
        } else
        {
            System.out.println("error");
        }
    }

    public double calculateCost()
    {
        double sumOfCost = 0.0;
        if (!cars.isEmpty())
        {
            for (Map.Entry<String, Car> entry : cars.entrySet())
            {
                sumOfCost += entry.getValue().getCost();
            }
        }
        return sumOfCost;
    }

    public void sortCars()
    {
        this.cars = this.cars.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (t1, t2) -> t1, LinkedHashMap::new
        ));
    }

    @Override
    public String toString()
    {
        return "TaxiStation{" +
                "name='" + name + '\'' +
                ", cars=" + cars.toString() +
                '}';
    }

    private double cost;

    public void findNecessaryCar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose min speed: ");
        int minSpeed = sc.nextInt();
        System.out.print("Choose max speed: ");
        int maxSpeed = sc.nextInt();
        for (Map.Entry<String, Car> entry : cars.entrySet())
        {
            if ((entry.getValue().getSpeed() >= minSpeed) && (entry.getValue().getSpeed() <= maxSpeed))
            {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
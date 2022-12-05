package classes.car;

public interface CarStartable
{
    public default void StartCar()
    {
        System.out.println("Default Start");
    }
}

import java.io.*;
import java.util.*;

abstract class Vehicle
{
    Scanner s = new Scanner(System.in);

    abstract void rent();

    void bill()
    {
        System.out.println("Thank You for Choosing Our Vehicle Rental Service.");
    }
}

class Bike extends Vehicle
{
    void rent()
    {
        System.out.print("Enter Number of Days: ");
        int days = s.nextInt();

        int rentPerDay = 500;
        int total = days * rentPerDay;

        System.out.println("Bike Rent Per Day : Rs." + rentPerDay);
        System.out.println("Total Rent        : Rs." + total);
    }
}

class Car extends Vehicle
{
    void rent()
    {
        System.out.print("Enter Number of Days: ");
        int days = s.nextInt();

        int rentPerDay = 1500;
        int total = days * rentPerDay;

        System.out.println("Car Rent Per Day : Rs." + rentPerDay);
        System.out.println("Total Rent       : Rs." + total);
    }
}

class Bus extends Vehicle
{
    void rent()
    {
        System.out.print("Enter Number of Days: ");
        int days = s.nextInt();

        int rentPerDay = 5000;
        int total = days * rentPerDay;

        System.out.println("Bus Rent Per Day : Rs." + rentPerDay);
        System.out.println("Total Rent       : Rs." + total);
    }
}

public class Abstractmethod1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        Vehicle v;

        System.out.println("===== Vehicle Rental System =====");
        System.out.println("if you need bike press 1");
        System.out.println("if you need Car press 2");
        System.out.print("Enter Your Choice: ");

        int choice = s.nextInt();

        switch(choice)
        {
            case 1:
                v = new Bike();
                break;

            case 2:
                v = new Car();
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        v.rent();   
        v.bill();   
    }
}
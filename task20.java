import java.io.*;
import java.util.*;

class revs
{
    private String name;
    private int age;
    private String gender;

    
    revs()
    {
        System.out.println("Enter your details for bus seat!");
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = s.nextLine();

        System.out.print("Enter your age: ");
        age = s.nextInt();

        System.out.print("Enter your gender: ");
        gender = s.next();
    }
    void printTicket()
    {
        System.out.println("\nYour ticket is ready " + name);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("~ Successfully booked your ticket ~");
    }
}

class task20
{
    public static void main(String[] args)
    {
        revs m1 = new revs();
        revs m2 = new revs();

        m1.printTicket();
        m2.printTicket();
    }
}
import java.io.*;
import java.util.*;

class Employee
{
    static Scanner s = new Scanner(System.in);

    void Salary()
    {
        System.out.println("Salary calculation of Employee");
    }
}

class FullTimeEmployee extends Employee
{
    void Salary()
    {
        System.out.println("Enter the FullTimeEmployee ");
        System.out.println("Enter Employee Salary");
        int basic = s.nextInt();

        System.out.println("Enter Employee PF");
        int pf = s.nextInt();

        int total = basic + pf;

        System.out.println("Total Salary of Employee : " + total);
    }
}

class PartTimeEmployee extends Employee
{
    void Salary()
    {
        System.out.println("Enter the PartTimeEmployee salary... ");
        System.out.println("Enter Worked Days");
        int days = s.nextInt();

        System.out.println("Enter Salary Per Day");
        int rate = s.nextInt();

        int total = days * rate;

        System.out.println("Total Salary : " + total);
    }
}

public class VirtualMethod
{
    public static void main(String[] args)
    {
        Employee e;

        e = new FullTimeEmployee();
        e.Salary();

        System.out.println();

        e = new PartTimeEmployee();
        e.Salary();
    }
}
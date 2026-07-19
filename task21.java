import java.io.*;
import java.util.*;
class Student
{
    private String name;
    private int mark;

  
    Student()
    {
        System.out.println("Enter your details");
        Scanner s = new Scanner(System.in);
        System.out.println("Name");
        name=s.nextLine();
        System.out.println("mark");
        mark=s.nextInt();
    }

    Student(String n, int a)
    {
        name = n;
        mark = a;
    }

    void display()
    {
        
        System.out.println("Name : " + name);
        System.out.println("10th mark  : " + mark);
        System.out.println(name+ " 10th mark is "+ mark);
    }
}

class task21
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("abdul", 455);

        s1.display();
        s2.display();
    }
}
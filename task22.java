import java.io.*;

class MyClass1 {
    public String name1 = "abdul";
    public int rollno1 = 101;

    void display1() {
        System.out.println("The Roll Number: " + rollno1);
        System.out.println(rollno1 + " : " + name1);
    }
}

class MyClass2 extends MyClass1 {
    public String name2 = "joe";
    public int rollno2 = 102;

    void display2() {
        System.out.println("The Roll Number: " + rollno2);
        System.out.println(rollno2 + " : " + name2);
    }
}

class MyClass3 extends MyClass2 {
    public String name3 = "pandi";
    public int rollno3 = 103;

    void display3() {
        System.out.println("The Roll Number: " + rollno3);
        System.out.println(rollno3 + " : " + name3);
    }
}

class MyClass4 extends MyClass3 {
    public String name4 = "sanjai";
    public int rollno4 = 104;

    void display4() {
        System.out.println("The Roll Number: " + rollno4);
        System.out.println(rollno4 + " : " + name4);
    }
}

class MyClass5 extends MyClass4 {
    public String name5 = "sakthi";
    public int rollno5 = 105;

    void display5() {
        System.out.println("The Roll Number: " + rollno5);
        System.out.println(rollno5 + " : " + name5);
    }
}
 class task22 {
    public static void main(String[] args) {

        MyClass5 m1 = new MyClass5();

        m1.display1();
        m1.display2();
        m1.display3();
        m1.display4();
        m1.display5();
    }
}
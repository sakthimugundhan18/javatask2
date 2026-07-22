import java.util.*;

class Payment
{
    void pay(double amount)
    {
        System.out.println("\n----- Cash Payment -----");
         System.out.println(amount+" successfully sent through cash payment !");

       
    }

    void pay(String upiId, double amount)
    {
        System.out.println("\n----- UPI Payment -----");
        System.out.println(amount+" sent by "+ upiId+" through UPI payment");
    }

    void pay(String bankName, String accountNo, double amount)
    {
        System.out.print("----- Net Banking -----");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Amount: Rs." + amount);
        System.out.println("payment done through netbanking...");
    }
}

public class methodover1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Payment p = new Payment();

        System.out.println("===== Payment Menu =====");
        System.out.println("1. Cash Payment");
        System.out.println("2. UPI Payment");
        System.out.println("3. Net Banking");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();   // consume newline

        switch(choice)
        {
            case 1:
                System.out.print("\nEnter Amount: ");
                double amount = sc.nextDouble();
                p.pay(amount);
                break;

            case 2:
                System.out.print("\nEnter UPI ID: ");
                String upi = sc.nextLine();

                System.out.print("\nEnter Amount: ");
                double upiAmount = sc.nextDouble();

                p.pay(upi, upiAmount);
                break;

            case 3:
                System.out.print("\nEnter Bank Name: ");
                String bank = sc.nextLine();

                System.out.print("\nEnter Account Number: ");
                String account = sc.nextLine();

                System.out.print("\nEnter Amount: ");
                double bankAmount = sc.nextDouble();

                p.pay(bank, account, bankAmount);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
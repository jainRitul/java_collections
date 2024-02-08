import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;


class BankClass {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int n = 15000;
        List<Integer>l = new ArrayList<>();
         int choice = 0;
        while(choice!=4) {
            System.err.println("enter option: ");
            choice = sc.nextInt();
            if(choice == 1){
            withdraw(n,l);
            }

            else if(choice==2){
            deposit(n,l);
            }
            else if(choice==3){
            miniStatement(l);
            }
        }

    }

    public static void withdraw(int n,List<Integer>l) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount > n && amount / 100 != 0)
            return;
        int OTP = 0;
        if (amount > 10000) {
            System.out.println("Enter a OTP : ");
            OTP = sc.nextInt();
            l.add(amount);
        }
        int count = 0;

        while (OTP != 0) {
            OTP /= 10;
            count++;
        }
        if (count == 4) {
            System.out.println("OTP is of four digit");
        }
        

    }

    public static void deposit(int n,List<Integer>l) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter denomination:");
        int denomination = sc.nextInt();
        System.out.println("Enter the amount you will deposit:");
        int amount = sc.nextInt();
        if (amount / denomination > 200 && amount > n) {
            return;
        } else {
             l.add(amount);
            System.out.println("You can deposit the money");
        }
    }
    public static List<Integer> miniStatement(List<Integer>l){
       return l;
    }
    public static void exit() {
        return;
    }
}

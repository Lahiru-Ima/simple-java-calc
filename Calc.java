package MyJava;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        Calc obj = new Calc();

        System.out.print("Enter First Number: ");
        double x = sc.nextDouble();

        System.out.print("Enter Operation: ");
        String oper = sc.next();

        System.out.print("Enter Second Number: ");
        double y = sc.nextDouble();

        if (oper.equals("+"))
            obj.add(x,y);
        else if (oper.equals("-"))
            obj.sub(x,y);
        else if (oper.equals("*"))
            obj.mul(x,y);
        else if (oper.equals("/"))
            obj.div(x,y);
        else
            System.out.println("Input not recognized");

    }
    void add(double x,double y){
        System.out.println("Sum = " + (x+y));
    }
    void sub(double x,double y){
        System.out.println("Sub = " + (x-y));
    }
    void mul(double x,double y){
        System.out.println("Mul = " + (x*y));
    }
    void div(double x,double y){
        if (y !=0 )
            System.out.println("Div = " + (x/y));
        else
            System.out.println("Can't divided by zero");
    }
}


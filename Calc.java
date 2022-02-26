package MyJava;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        Calc obj = new Calc();

        System.out.print("Enter First Number: ");
        int x = sc.nextInt();

        System.out.print("Enter Operation: ");
        String oper = sc.next();

        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();

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
    void add(int x,int y){
        System.out.println("Sum = " + (x+y));
    }
    void sub(int x,int y){
        System.out.println("Sub = " + (x-y));
    }
    void mul(int x,int y){
        System.out.println("Mul = " + (x*y));
    }
    void div(int x,int y){
        if (y !=0 )
            System.out.println("Div = " + (x/y));
        else
            System.out.println("Can't divided by zero");
    }
}


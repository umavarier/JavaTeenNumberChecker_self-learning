//Java Program to check if one of the entered number is a "Teen" .


import java.util.Scanner;

public class TeenNumberChecker {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        System.out.println("Enter first number ");
        int number1= s.nextInt();
        s.nextLine();
        System.out.println("Enter second  number ");
        int number2= s.nextInt();
        s.nextLine();
        System.out.println("Enter 3rd  number ");
        int number3= s.nextInt();
        s.nextLine();
        hasTeen(number1, number2, number3);
        s.close();
    }

    public static void hasTeen(int y1,int y2,int y3)
    {
        if((y1>=13&&y1<=19) || (y2>=13&&y2<=19) ||(y3>=13&&y3<=19))
        {
            System.out.println("the numbers included teen ");
        }
        else
        {
            System.out.println("the numbers not  included a teen ");
        }
    }
}

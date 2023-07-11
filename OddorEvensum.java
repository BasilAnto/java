import java.util.*;
public class OddorEvensum {
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first number");
      int a=sc.nextInt();
      System.out.println("Enter the Second number");
      int b=sc.nextInt();
      int c= a + b;
      if (c % 2 ==0)
        {System.out.println("It is an Even sum");
      } else {
          System.out.println("It is an odd sum");
      }
    }
}
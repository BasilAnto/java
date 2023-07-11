import java.util.*;
public class OddorEven {
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      if (n % 2 ==0)
        {System.out.println("It is an Even Number");
      } else {
          System.out.println("It is an odd number");
      }
    }
}
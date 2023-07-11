import java.util.*;
public class PositiveorNegative {
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      if (n>0)
        {System.out.println("Number is Positive");
      } else if(n<0){
          System.out.println("Number is Negative");
      }else {
          System.out.println("Number is Zero");
      }
    }
}
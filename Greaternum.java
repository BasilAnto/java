import java.util.*;
public class Greaternum {
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      int a=sc.nextInt();
      System.out.println("Enter the Second number");
      int b=sc.nextInt();
      if (a>b)
        {System.out.println("A is Greater");
      }else if(b>a){
          System.out.println("B is Greater");
      } else {
          System.out.println("Both are Equal");
      }
    }
}
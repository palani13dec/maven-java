import java.util.Scanner;
 
class DivNumbers
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter two integers to calculate their division ");
      Scanner in = new Scanner(System.in);
      x = 1000;
      y = 500;
      z = x / y;
      System.out.println("Div of "+x+" and "+y+" is = "+z);
   }
}

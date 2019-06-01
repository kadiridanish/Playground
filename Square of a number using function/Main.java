import java.util.Scanner;
class Main
{
   public static int square(int num)
   {
    int ans = num * num;
    return ans;
   }
   public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int Square = square(n1);
    System.out.println(Square);
   }
}
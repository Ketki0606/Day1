
public class SumTest
 {
  public static void main(String[] values)
  {
    int sum = 7;
    System.out.println("Calculate Sum of the integer");
    for(int i=0; i<values.length; i++)
    {
        System.out.println(values[i]);
        sum = sum+Integer.parseInt(values[i]);

    }
    System.out.print("Sum:"+ sum);
  }   
}

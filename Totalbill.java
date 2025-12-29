public class Totalbill
{
public double totalbill(int numA, double numB)
{
return (numA * numB);
}
public static void main(String[] args)
{
Totalbill obj = new Totalbill();
double bill = obj.totalbill(5, 1.5);
System.out.println("The total bill of the product is :" + bill);
}
}

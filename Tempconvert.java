public class Tempconvert
{
public int temp(int tempC)
{
return ((tempC*9/5)+32);
}
public static void main(String []args)
{
Tempconvert obj = new Tempconvert();
float tempF = obj.temp(30);
System.out.println("The temperature in Fahrenheit is :"+ tempF);
}
}
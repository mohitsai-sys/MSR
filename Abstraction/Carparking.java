import java.util.Scanner;
abstract class Vehicle {
protected String vehicleNumber;
static int totalVehicles = 0;
Vehicle(String vehicleNumber) {
this.vehicleNumber = vehicleNumber;
totalVehicles++;
}
abstract void calculateFee(int hours);
void showVehicle() {
System.out.println("Vehicle Number: " + vehicleNumber);
}
final void entryLog() {
System.out.println("Entry recorded successfully ");
}
}
class Car extends Vehicle {
private final int ratePerHour = 20; // final variable
Car(String vehicleNumber) {
super(vehicleNumber);
}
void calculateFee(int hours) {
int fee = hours * ratePerHour;
System.out.println("Parking Fee: ₹" + fee);
}
}
public class Carparking {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Vehicle Number: ");
String number = sc.nextLine();
System.out.print("Enter Parking Hours: ");
int hours = sc.nextInt();
Car car = new Car(number);
car.showVehicle();
car.entryLog();       // final method
car.calculateFee(hours);
System.out.println("Total Vehicles Parked: " + Vehicle.totalVehicles);
sc.close();
}
}
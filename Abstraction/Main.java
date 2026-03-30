interface Payment {
void pay(double amount);
default void generateReceipt(double amount) {
System.out.println("Receipt generated for amount: ₹" + amount);
}
static void paymentGateway() {
System.out.println("Using secure payment gateway...");
}
}
interface Security {
void authenticate();
default void otpVerification() {
System.out.println("OTP verified successfully.");
}
static void securityTips() {
System.out.println("Never share your OTP with anyone!");
}
}
class UPIPayment implements Payment, Security {
private String upiId;
UPIPayment(String upiId) {
this.upiId = upiId;
}
public void pay(double amount) {
System.out.println("Processing UPI payment of ₹" + amount + " from " + upiId);
}
public void authenticate() {
System.out.println("Authenticating UPI ID: " + upiId);
}
public void generateReceipt(double amount) {
System.out.println("UPI Receipt: ₹" + amount + " paid successfully!");
}
}
public class Main {
public static void main(String[] args) {
UPIPayment user = new UPIPayment("mohit@upi");
user.authenticate();
user.otpVerification();   
user.pay(500);             
user.generateReceipt(500); 
Payment.paymentGateway();
Security.securityTips();
}
}
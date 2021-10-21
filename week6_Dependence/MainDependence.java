package week6_Dependence;

public class MainDependence {
public static void main(String[] args) {
        Customer pelanggan1 = new Customer();
        Customer pelanggan2 = new Customer();
        pelanggan1.setCustomerId(1);
        pelanggan1.setCustomerName("paqih");
        pelanggan2.setCustomerId(2);
        pelanggan2.setCustomerName("Teguh");
        
        Order wira1 = new Order(pelanggan1);
        Order wira2 = new Order(pelanggan2);
    }
}

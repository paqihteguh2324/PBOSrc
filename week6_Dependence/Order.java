package week6_Dependence;

public class Order {
    public int OrderCustomerId;
    public String OrderName;

    public Order(Customer customer) {
        OrderCustomerId = customer.getCustomerId();
        OrderName = customer.getCustomerName();

        System.out.println(OrderName);
        System.out.println(OrderCustomerId);
    }
}
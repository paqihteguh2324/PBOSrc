package week6Aggregation;
import java.io.*;
import java.util.*;

public class Employee {  
int id;  
String name;  
Address address;  
  
public Employee(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.kota+" "+address.provinsi+" "+address.negara);  
}  
  

} 
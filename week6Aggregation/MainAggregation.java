package week6Aggregation;

public class MainAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Address address1=new Address("sumedang","jawa barat","indonesia");  
			Address address2=new Address("bandung","jawa barat","indonesia");  
			  
			Employee e=new Employee(1,"paqih",address1);  
			Employee e2=new Employee(2,"teguh",address2);  
			      
			e.display();  
			e2.display();  

	}

}

package penerapan_interface;


class Main {
 // Main driver method
 public static void main(String[] args)
 {
     Integer arr[] = { 3, 6, 2, 8, 6 };
     MyClass<Integer> obj1 = new MyClass<Integer>(arr);
     System.out.println("Minimum value: " + obj1.min());
 }
}
package penerapan_interface;


class MyClass<T extends Comparable<T> >
 implements MinMax<T> {

 T[] values;

 MyClass(T[] obj) { values = obj; }

	 public T min()
	 {
	     T o1 = values[0];
	
	     for (int i = 1; i < values.length; i++)
	         if (values[i].compareTo(o1) < 0)
	             o1 = values[i];
	
	     return o1;
	 }
}
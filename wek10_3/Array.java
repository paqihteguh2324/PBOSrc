package wek10_3;


//public class Array {
//    public static void main(String[] args) {
//        int a[] = new int[2];
//            a[2] = 6 ;
//    }
//}

public class Array {
    public static void main(String[] args) {
        int a[] = new int[2];
        try {
            a[2] = 6 ;
            System.out.println("Indeks array tidak melebihi batas");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array melebihi batas");
        }
    }
}

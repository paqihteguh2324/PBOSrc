package wek10_3;

import java.io.*;

//public class OperasiFile {
//    public static void main(String args[]) {
//            File file = new File("C://Users//paqih//Documents//file.txt");
//            FileReader fr = new FileReader(file);
//    }
//}

public class OperasiFile {
    public static void main(String args[]) {
        try {
            // Following file does not exist
            File file = new File("C://Users//paqih//Documents//file.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("File does not exist");
        }
    }
}

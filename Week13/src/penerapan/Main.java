package penerapan;

public class Main {
    public static void main(String[] args){
        //Membuat Instance dan Mendefinisikan Tipe Data String
        GenericClass<String> nama = new GenericClass<>();
        nama.setOrang("Paqih");
        System.out.println("Nama Saya: "+nama.getOrang());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Integer
        GenericClass<Integer> umur = new GenericClass<>();
        umur.setOrang(19);
        System.out.println("Usia Saya: "+umur.getOrang()+" Tahun");
        
        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
        GenericClass<Boolean> kondisi = new GenericClass<>();
        kondisi.setOrang(true);
        System.out.println("Saya Sedang Belajar : "+kondisi.getOrang());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Float
        GenericClass<Float> IPK = new GenericClass<>();
        IPK.setOrang(19.0f);
        System.out.println("Usia (Float) : "+IPK.getOrang());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Character
        GenericClass<Character> Karakter = new GenericClass<>();
        Karakter.setOrang('P');
        System.out.println("Huruf Awalan Nama Saya Adalah: "+Karakter.getOrang());
        
    }
}
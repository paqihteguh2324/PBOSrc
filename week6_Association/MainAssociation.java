package week6_Association;

public class MainAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School skl = new School("SMAN TANJUNGSARI");
		Student siswa= new Student("paqih");
		siswa.setNISN("201511056");
		System.out.println("Nama :" +siswa.getnamasiswa());
		System.out.println("NISN :" +siswa.getNISN()+"\nMerupakan siswa dari");
		System.out.println(skl.getNamaSekolah());
		
	}

}

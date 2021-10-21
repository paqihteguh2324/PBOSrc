package week6_Composition;
import java.util.*;

public class MainComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Siswa S1 = new Siswa("Paqih", "2015110561");
		Siswa S2 = new Siswa("Teguh", "2015110562");
		Siswa S3 = new Siswa("Maulana", "2015110563");
		Siswa S4 = new Siswa("Pt.Maulana", "2015110564");

		List<Siswa> s_siswa = new ArrayList<Siswa>();
		s_siswa.add(S1);
		s_siswa.add(S2);
		s_siswa.add(S3);
		s_siswa.add(S4);
		Kelas kelas = new Kelas(s_siswa);
		List<Siswa> s_swa = kelas.getTotalSiswaDiKelas();
		for(Siswa swa : s_swa){
		System.out.println("Nama : " + swa.nama + " dan "
		+" NISN : " + swa.NISN);
		}
	}

}

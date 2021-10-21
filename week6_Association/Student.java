package week6_Association;

public class Student {
	private String nama;
	private String NISN;
	
	Student(String nama) {
		this.nama = nama;
	}
	
	public void setNISN(String NISN) {
		this.NISN = NISN;
	}
	
	public String getnamasiswa() {
		return this.nama;
	}
	
	public String getNISN() {
		return this.NISN;
	}
}

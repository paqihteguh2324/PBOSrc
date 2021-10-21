package week6_Composition;

import java.util.*;

public class Kelas {
	private final List<Siswa> s_siswa;
		Kelas(List<Siswa> s_siswa)
	{
	this.s_siswa = s_siswa;
	}
	public List<Siswa> getTotalSiswaDiKelas(){
	return s_siswa;
	}

}

package week5;


public class Makanan {
	private String[] nama_makanan;
	private int[] harga_makanan;
	private int[] stok;

	Makanan() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new int[10];
		this.stok = new int[10];
	}

	public void setNamaMakanan(String nama, byte id) {
		this.nama_makanan[id] = nama;
	}

	public void setHargaMakanan(int harga,byte id) {
		this.harga_makanan[id] = harga;
	}

	public void setStok(int stok, byte id) {
		this.stok[id] += stok;
	}

	public String getNamaMakanan(int id) {
		return nama_makanan[id];
	}

	public int getHargaMakanan(int id) {
		return harga_makanan[id];
	}

	public int getStok(int id) {
		return stok[id];
	}
	
	public void removeStok(int id, int jumlah) {
		this.stok[id] -= jumlah;
	}
}
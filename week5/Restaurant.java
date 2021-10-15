package week5;

public class Restaurant {
	private Makanan menuMakanan;
	private static byte idMenu = 0;
	
	public Restaurant() {
		menuMakanan = new Makanan();
	}

	public void tambahMenuMakanan(String nama, int harga, int stok) {
		menuMakanan.setHargaMakanan(harga, idMenu);
		menuMakanan.setNamaMakanan(nama, idMenu);
		menuMakanan.setStok(stok, idMenu);
		idMenu++;
	}

	public void tampilMenuMakanan(){
		System.out.println("\n=============================");
		System.out.println("Jumlah stok makanan saat ini");
		for(byte i =0; i<=idMenu;i++){
			if(!isOutOfStock(i)){
				System.out.println(i+1+". "+menuMakanan.getNamaMakanan(i) +"["+ menuMakanan.getStok(i) +"]"+"\tRp. "+ menuMakanan.getHargaMakanan(i));
			}
		}
	}

	public boolean isOutOfStock(byte id){
		if(menuMakanan.getStok(id) == 0){
			return true;
		}else{
			return false;
		}
	}

	public void pesanMenuMakanan(int idMenu, int jumlah) {
		idMenu= idMenu-1;
		int id =idMenu;
		if(jumlah < 0)
			System.out.println("Input jumlah tidak boleh kurang dari 0");
		if((menuMakanan.getStok(id) - jumlah) < 0 )
			System.out.println("Mohon maaf stok tidak mencukupi");
		else {
			System.out.println(menuMakanan.getNamaMakanan(id) + " sebanyak " + jumlah);
			System.out.println("Total Harga adalah Rp." + menuMakanan.getHargaMakanan(id)*jumlah);
			menuMakanan.removeStok(id, jumlah);
			System.out.println("----------------------");
		}
	}
}


	
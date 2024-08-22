package _21100011010_;

//Metin Furkan Yaman 21100011010





import java.util.ArrayList;

public class Ogrenci {
	public int ogrId;
	public String ogrAdSoyad;
	public int ogrYas;
	public ArrayList <Ders> alinanDersler= new ArrayList<Ders>();
	

	
	public Ogrenci(ArrayList<Ders> alinanDersler) {
		super();
		this.alinanDersler = alinanDersler;
	}

	public Ogrenci() {
	}

	public Ogrenci(int ogrId, String ogrAdSoyad, int ogrYas, ArrayList<Ders> alinanDersler) {
		super();
		this.ogrId = ogrId;
		this.ogrAdSoyad = ogrAdSoyad;
		this.ogrYas = ogrYas;
		this.alinanDersler = alinanDersler;
	}
	
	
	public Ogrenci(int ogrId, String ogrAdSoyad, int ogrYas) {
		super();
		this.ogrId = ogrId;
		this.ogrAdSoyad = ogrAdSoyad;
		this.ogrYas = ogrYas;
	}

	public int getOgrId() {
		return ogrId;
	}
	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}
	public String getOgrAdSoyad() {
		return ogrAdSoyad;
	}
	public void setOgrAdSoyad(String ogrAdSoyad) {
		this.ogrAdSoyad = ogrAdSoyad;
	}
	public int getOgrYas() {
		return ogrYas;
	}
	public void setOgrYas(int ogrYas) {
		this.ogrYas = ogrYas;
	}
	public ArrayList<Ders> getAlinanDersler() {
		return alinanDersler;
	}
	public void setDers(Ders temp_ders) {
		alinanDersler.add(temp_ders);
	}
	
	
	

}

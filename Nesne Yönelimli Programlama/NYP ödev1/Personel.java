package odev_2;

public class Personel extends Departman {
	private int depNo;
	private String perAd;
	private String perSoyad;
	private int perYas;
	private int perID=0;
	private static int sayac=0;
	public Personel(int depNo, String depAd,String perAd, String perSoyad, int perYas) {
		super(depNo,depAd);
		this.depNo = depNo;
		this.perAd = perAd;
		this.perSoyad = perSoyad;
		this.perYas = perYas;
		sayac+=1;
		this.perID=sayac;
	}
	public int getPerID() {
		return perID;
	}
	public void setPerID(int perID) {
		this.perID = perID;
	}
	public String getPerAd() {
		return perAd;
	}
	public void setPerAd(String perAd) {
		this.perAd = perAd;
	}
	public String getPerSoyad() {
		return perSoyad;
	}
	public void setPerSoyad(String perSoyad) {
		this.perSoyad = perSoyad;
	}
	public int getPerYas() {
		return perYas;
	}
	public void setPerYas(int perYas) {
		this.perYas = perYas;
	}
	
	public void personel_yazdir()
	{
		System.out.println("Personel id="+this.perID);
		System.out.println("Personel adı="+this.perAd);
		System.out.println("Personel soyadı="+this.perSoyad);
		System.out.println("Personel yaşı="+this.perYas);
		System.out.println("--------------------------");
		
		
	}
	public String personel_adi()
	{
		return this.perAd;
	}
	public int personel_yasi()
	{
		return this.perYas;
	}
	
	

}

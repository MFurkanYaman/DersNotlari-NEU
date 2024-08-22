package odev_2;

public class Proje extends Departman {
	private int depNo;
	private String projeAd;
	private int projeSure;
	private int projeMaliyet;
	private static int sayac=0;
	private  int projeID=0;
	public Proje(int depNo, String depAd, String projeAd, int projeSure, int projeMaliyet) {
		super(depNo, depAd);
		
		this.projeAd = projeAd;
		this.projeSure = projeSure;
		this.projeMaliyet = projeMaliyet;
		sayac+=1;
		this.projeID=sayac;
	}
	public int getProjeID() {
		return projeID;
	}
	public void setProjeID(int projeID) {
		this.projeID = projeID;
	}
	public String getProjeAd() {
		return projeAd;
	}
	public void setProjeAd(String projeAd) {
		this.projeAd = projeAd;
	}
	public int getProjeSure() {
		return projeSure;
	}
	public void setProjeSure(int projeSure) {
		this.projeSure = projeSure;
	}
	public int getProjeMaliyet() {
		return projeMaliyet;
	}
	public void setProjeMaliyet(int projeMaliyet) {
		this.projeMaliyet = projeMaliyet;
	}
	public int getDepNo() {
		return depNo;
	}
	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
	public void proje_yazdir()
	{
		System.out.println("Proje id="+this.projeID);
		System.out.println("Proje ad="+this.projeAd);
		System.out.println("Proje maliyet="+this.projeMaliyet);
		System.out.println("Proje süresi="+this.projeSure);
		System.out.println("--------------------------");
	}
	
	public String proje_adi()
	{
		return this.projeAd;
	}
	public int proje_sure()
	{
		return this.projeSure;
	}
	public int proje_maliyet()
	{
		return this.projeMaliyet;
	}
	
	
	

}

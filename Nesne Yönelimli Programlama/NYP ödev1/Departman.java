package odev_2;

public class Departman {
	private int depNo;
	private String depAd;
	public Personel[] personel_;
	public Proje[] proje_;
	public Departman(int depNo, String depAd) {
		super();
		this.depNo = depNo;
		this.depAd = depAd;
	
	}
	public int getDepNo() {
		return depNo;
	}
	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
	public String getDepAd() {
		return depAd;
	}
	public void setDepAd(String depAd) {
		this.depAd = depAd;
	}
	public void departman_yazdir()
	{
		System.out.println("Departman numarası="+this.depNo);
		System.out.println("Departman adı="+this.depAd);
		System.out.println("--------------------------");
	}
	public String  departman_adi()
	{
		String esleme= this.depAd;
		return esleme;
	}
	
}

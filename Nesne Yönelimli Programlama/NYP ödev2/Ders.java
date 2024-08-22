package _21100011010_;

//Metin Furkan Yaman 21100011010





public class Ders {
	public int dersId;
	public String dersAd;
	public static int syc=1110;
	public Ders(String dersAd) {
		super();
		this.dersId=syc;
		syc+=10;
		this.dersAd = dersAd;
	}
	


	public Ders(int dersId, String dersAd) {
		super();
		this.dersId = dersId;
		this.dersAd = dersAd;
	}



	public int getDersId() {
		return dersId;
	}
	public void setDersId(int dersId) {
		this.dersId = dersId;
	}
	public String getDersAd() {
		return dersAd;
	}
	public void setDersAd(String dersAd) {
		this.dersAd = dersAd;
	}
	

}

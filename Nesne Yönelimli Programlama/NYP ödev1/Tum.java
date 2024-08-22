package odev_2;

public class Tum {
	

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
	package odev_2;

	import java.util.Scanner;


	public class Anasayfa {
		public static int personel_sayisi;
		public static int proje_sayisi;
		//blic static Personel[] personel_;
		public static void main(String[] args) {
			Scanner verial = new Scanner(System.in);
			System.out.println("DİKKAT GİRECEĞİNİZ METİNLERDE BOŞLUK YERİNE" +" _ "+"KULLANIN"+" Örneğin, departman adı:uzay_araştırmaları ");
			System.out.println("Kaç adet departman oluşturulacaktır?");
			int adet=verial.nextInt();
			Departman[] departman = new Departman[adet];
			int i,k,j;
			for(i=0;i<adet;i++)
			{
				
				System.out.println("Departman no giriniz:");
				int depNo=verial.nextInt();
				System.out.println("Departman adını giriniz:");
				String depAd=verial.next();
				departman[i]=new Departman(depNo,depAd);
				System.out.println("Personel sayisini giriniz");
				personel_sayisi=verial.nextInt();
				departman[i].personel_ = new Personel[personel_sayisi];
				for(k=0;k<personel_sayisi;k++)
				{
					System.out.println("Personel ad giriniz");
					String perAd=verial.next();
					System.out.println("Personel soyad giriniz");
					String perSoyad=verial.next();
					System.out.println("Personel yas giriniz:");
					int perYas=verial.nextInt();
					departman[i].personel_[k]=new Personel(depNo,depAd,perAd,perSoyad,perYas);	
				}
				System.out.println("Proje sayisini giriniz");
				proje_sayisi=verial.nextInt();
				departman[i].proje_=new Proje[proje_sayisi];
				for(k=0;k<proje_sayisi;k++)
				{
				System.out.println("Proje adini giriniz");
				String projeAd=verial.next();
				System.out.println("Proje süre giriniz");
				int projeSure=verial.nextInt();
				System.out.println("Proje maliyet giriniz");
				int projeMaliyet=verial.nextInt();
				departman[i].proje_[k] = new Proje(depNo,depAd,projeAd,projeSure,projeMaliyet);
				}
				System.out.println("------------------------------------------------------------------"); //!!!!!
				 
			}
			int x=1;
			while(x==1)
			{
				System.out.println("********************************************************");
				System.out.println("1- Tüm Departmanların Bilgilerini Listele");
				System.out.println("2- Departman Adına Göre Arama Yap");
				System.out.println("3- Personel Adına Göre Arama Yap");
				System.out.println("4- Proje Adına Göre Arama Yap");
				System.out.println("5- Yaş Bilgisine Göre Personelleri Bul");
				System.out.println("6- Yaş Bilgisine Göre Personelleri Analiz Et");
				System.out.println("7- Proje Süresine Göre Projeleri Bul");
				System.out.println("8- Proje Maliyetine Göre Projeleri Bul");
				System.out.println("9- Proje Maliyetine Göre Projeleri Analiz Et");
				System.out.println("10- Çıkış");
				System.out.println("********************************************************");
				int secim=verial.nextInt();
				switch(secim)
				{
				case 1:	
					for(i=0;i<adet;i++)
					{
						departman[i].departman_yazdir();
						
						for(j=0;j<personel_sayisi;j++)
						{
							departman[i].personel_[j].personel_yazdir();
						}
						for(k=0;k<proje_sayisi;k++)
						{
							departman[i].proje_[k].proje_yazdir();
						}
						
					}
					
					break;
				case 2:
					//String aranan_departman;
					int departman_ara_sayac=0;
					System.out.println("Aramak istediğiniz departmanı yazınız:");
					String aranan_departman=verial.next();
					for(i=0;i<adet;i++)
					{
						if( departman[i].departman_adi().equals(aranan_departman))
						{
							departman_ara_sayac=-1;
							departman[i].departman_yazdir();
							for(j=0;j<personel_sayisi;j++)
							{
								departman[i].personel_[j].personel_yazdir();
							}
							for(k=0;k<proje_sayisi;k++)
							{
								departman[i].proje_[k].proje_yazdir();
							}
						}
						departman_ara_sayac+=1;
						
					}
					
					if(departman_ara_sayac==adet)
					{
						System.out.println("Bu departman bulunamadı");
					}
					break;
				case 3: 
					System.out.println("Aramak istediğiniz personelin adını yazınız:");
					String aranan_personel=verial.next();
					int personel_ara_sayac=0;
					for(i=0;i<adet;i++)
					{
						for(j=0;j<personel_sayisi;j++)
						{
							if(departman[i].personel_[j].personel_adi().equals(aranan_personel))
							{
								personel_ara_sayac=-100;
								departman[i].departman_yazdir();
								departman[i].personel_[j].personel_yazdir();
							}
							personel_ara_sayac+=1;
							
							
							
						}
						if(personel_ara_sayac==personel_sayisi)
						{
							System.out.println("Kişi bulunamadı.");
						}
					}
					break;
				case 4:
					System.out.println("Aramak istediğiniz projenin adını yazınız:");
					String aranan_proje=verial.next();
					int proje_ara_sayac=0;
					for(i=0;i<adet;i++)
					{
						for(j=0;j<proje_sayisi;j++)
						{
							if(departman[i].proje_[j].proje_adi().equals(aranan_proje))
							{
								proje_ara_sayac=0;
								departman[i].departman_yazdir();
								departman[i].proje_[j].proje_yazdir();
							}
							proje_ara_sayac+=1;
							
							
						}
						if(proje_ara_sayac==proje_sayisi)
						{
							System.out.println("Proje bulunamadi");
						}
					}
					
					
					break;
				case 5:
					System.out.println("Hangi yaştakileri aramak istersiniz?");
					int aranan_yas=verial.nextInt();
					int yas_ara_sayac=0;
					for(i=0;i<adet;i++)
					{
						for(j=0;j<personel_sayisi;j++)
						{
							if(aranan_yas==departman[i].personel_[j].personel_yasi())
							{
								yas_ara_sayac=0;
								departman[i].departman_yazdir();
								departman[i].personel_[j].personel_yazdir();
							}
						}
						if(yas_ara_sayac==personel_sayisi)
						{
							System.out.println("Bu yaşta personel bulunamadı.");
						}
					}
					
					break;
				case 6:
					int sayac1=0;
					int sayac2=0;
					int sayac3=0;
					int sayac4=0;
					int toplam_yas=0;
					for(i=0;i<adet;i++)
					{
						for(j=0;j<personel_sayisi;j++)
						{
							if(20<=departman[i].personel_[j].personel_yasi()&& departman[i].personel_[j].personel_yasi()<=30)
							{
								toplam_yas+=departman[i].personel_[j].personel_yasi();
								sayac1+=1;
							}
							else if(31<=departman[i].personel_[j].personel_yasi() && departman[i].personel_[j].personel_yasi()<=40)
							{
								toplam_yas+=departman[i].personel_[j].personel_yasi();
								sayac2+=1;
							}
							else if(41<=departman[i].personel_[j].personel_yasi() && departman[i].personel_[j].personel_yasi()<=50)
							{
								toplam_yas+=departman[i].personel_[j].personel_yasi();
								sayac3+=1;
							}
							else
							{
								toplam_yas+=departman[i].personel_[j].personel_yasi();
								sayac4+=1;
							}
						}
					}
					System.out.println("20-30 arasında "+sayac1+" personel bulunmaktadır.");
					System.out.println("31-40 arasında "+sayac2+" personel bulunmaktadır.");
					System.out.println("41-50 arasında "+sayac3+" personel bulunmaktadır.");
					System.out.println("50 yaşın üzerinde "+sayac4+" personel bulunmaktadır.");
					System.out.println("Toplam yaş= "+toplam_yas);
					System.out.println("Ortalama yaş= "+toplam_yas/personel_sayisi);
					
					break;
				case 7:
					System.out.println("Aramak istediğiniz proje süresini giriniz=");
					int aranan_sure=verial.nextInt();
					int sure_ara_sayac=0;
					for(i=0;i<adet;i++)
					{
						for(j=0;j<proje_sayisi;j++)
						{
							if(aranan_sure==departman[i].proje_[j].proje_sure())
							{
								sure_ara_sayac=0;
								departman[i].departman_yazdir();
								departman[i].proje_[j].proje_yazdir();
							}
							sure_ara_sayac+=1;
						}
					}
					if(sure_ara_sayac==proje_sayisi)
					{
						System.out.println("Bu sürede yapılan bir proje bulunamadı");
					}
					
					break;
				case 8: 
					System.out.println("Aranacak proje maliyetini giriniz:");
					int aranacak_maliyet=verial.nextInt();
					int aranacak_maliyet_sayac=0;
					for(i=0;i<adet;i++)
					{
						for(j=0;j<proje_sayisi;j++)
						{
							if(aranacak_maliyet==departman[i].proje_[j].proje_maliyet())
							{
								departman[i].departman_yazdir();
								departman[i].proje_[j].proje_yazdir();
								aranacak_maliyet_sayac=0;
							}
							aranacak_maliyet_sayac+=1;
						}
					}
					if(aranacak_maliyet_sayac==proje_sayisi)
					{
						System.out.println("Bu maliyette proje bulunmamaktadır.");
					}
					
					
					
					break;
				case 9:
					int toplam_maliyet=0;
					int max=0;
					int min=10000000;
					if(proje_sayisi==0)
					{
						System.out.println("Proje bulunmamaktadır.");
						break;
					}
					
					for(i=0;i<adet;i++)
					{
						for(j=0;j<proje_sayisi;j++)
						{
							if(departman[i].proje_[j].proje_maliyet()>max)
							{
								max=departman[i].proje_[j].proje_maliyet();
								
							}
							if(departman[i].proje_[j].proje_maliyet()<min)
							{
								min=max=departman[i].proje_[j].proje_maliyet();
							}
							
							toplam_maliyet+=departman[i].proje_[j].proje_maliyet();
						}
						
					}
					for(i=0;i<adet;i++)
					{
						for(j=0;j<proje_sayisi;j++)
						{
							if(max==departman[i].proje_[j].proje_maliyet())
							{
								System.out.println("En Yüksek Maliyetli Proje:"+departman[i].proje_[j].proje_adi()+departman[i].proje_[j].proje_maliyet());
							}
							if(min==departman[i].proje_[j].proje_maliyet())
							{
								System.out.println("En Düşük Maliyetli Proje:"+departman[i].proje_[j].proje_adi()+departman[i].proje_[j].proje_maliyet());
							}
						}
					}
					System.out.println("Ortalama="+toplam_maliyet/proje_sayisi);
					break;
				case 10:
					x=0;
					break;
			}
			
					
		}

	}
	}



}

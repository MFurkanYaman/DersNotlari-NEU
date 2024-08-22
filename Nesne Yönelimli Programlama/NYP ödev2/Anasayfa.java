package _21100011010_;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;





//Metin Furkan Yaman 21100011010

public class Anasayfa {
	public static void main(String[] args) throws IOException {
		int kontrol=0;
		ArrayList<Ogrenci> Ogrenciler= new ArrayList<Ogrenci>();
		ArrayList<Ders> Dersler= new ArrayList<Ders>();
		ArrayList<Ders> alinanDersler= new ArrayList<Ders>();
		
		Ogrenci ogr;
		
		Scanner verial=new Scanner(System.in);
		String ders_parcala[];
		String ogr_parcala[];
		ArrayList<Ders> ogr_ders_parcala[];
		File ogr_Dosya=new File("ogrenci.txt");
		File ders_Dosya=new File("ders.txt");
		
		FileReader fr=new FileReader(ders_Dosya);
		BufferedReader br=new BufferedReader(fr);
		
		String okunan_dersad;
		
		while((okunan_dersad=br.readLine())!=null)
		{
			ders_parcala=okunan_dersad.split("%");
			
			Dersler.add(new Ders(Integer.parseInt(ders_parcala[0]),ders_parcala[1]));
			int son_id=Integer.parseInt(ders_parcala[0]);
				
		}
	
		FileReader fr2=new FileReader(ogr_Dosya);
		BufferedReader br2=new BufferedReader(fr2);
		
		String okunan_ogr;
		Ogrenci temp_ogr = new Ogrenci();
		while((okunan_ogr=br2.readLine())!=null)
		{
			
			ogr_parcala=okunan_ogr.split("%");
			if(ogr_parcala[0].substring(0,1).equals("+"))
			{
				temp_ogr = new Ogrenci();
				temp_ogr.setOgrId(Integer.parseInt(ogr_parcala[0]));
				temp_ogr.setOgrAdSoyad(ogr_parcala[1]);
				temp_ogr.setOgrYas(Integer.parseInt(ogr_parcala[2]));
				Ogrenciler.add(temp_ogr);
			}
			else
			{
				Ders t_ders = new Ders(Integer.parseInt(ogr_parcala[0].substring(1,4)), ogr_parcala[1]);
				temp_ogr.setDers(t_ders);
			}					
		}
		
		fr.close();
		br.close();
		//fr2.close();
		//br2.close();
		
		
		
		
		
		int son_id;
		
		while(kontrol==0)
		{
		
			System.out.println("1-Ders Ekle ");
			System.out.println("2-Ders Listele ");
			System.out.println("3-Ders Ara ");
			System.out.println("4-Ders Sil ");
			System.out.println("5-Öğrenci Ekle ");
			System.out.println("6-Öğrenci Ara ");
			System.out.println("7-Öğrenci Sil ");
			System.out.println("8-Öğrenci Listele ");
			System.out.println("9-Öğrencileri Ayrıntılı Listele ");
			System.out.println("10-Öğrencilerin Ödeyeceği Tutarı Hesapla ");
			System.out.println("11-Çıkış ");
			System.out.print("Seçiminizi Tuşlayınız: ");
		
			int secim=verial.nextInt();
			System.out.println("---------------------------------------------------------------------");
			switch(secim)
			{
			
			case 1:
			
				System.out.println("Eklenecek Dersin Adını Giriniz: ");
				String dersAd=verial.next();
				verial.nextLine();
				for(Ders ders_liste:Dersler)
				{
					int id=ders_liste.dersId;
				}
				
				
	
				Dersler.add(new Ders(dersAd));

				break;
			case 2:
				
				
				for(Ders ders_liste:Dersler)
				{
					System.out.println(ders_liste.dersId+" "+ders_liste.dersAd);
				}
				System.out.println("-------------------------------------------------------------");
				
				break;
			case 3:
				System.out.println("Aramak İstediğiniz Dersi Giriniz: ");
				String aranan_ders=verial.next();
				//verial.nextLine();
				int ders_sayac=0;
				for(Ders ders_liste:Dersler)
				{
					if((ders_liste.dersAd).equals(aranan_ders))
					{
						System.out.print(ders_liste.dersId+" "+ders_liste.dersAd+"\n");
						ders_sayac=1;
					}
				}
				if(ders_sayac==0)
				{
					System.out.println("Aranan Ders Bulunamadı.");
				}

				break;
			case 4:
				
				
				
				System.out.println("Silmek istediğiniz dersi yazınız:");
				String silinecek_ders=verial.next();
				verial.nextLine();
				int index_konum=0;
				for(Ders ders_liste:Dersler)
				{
					if((ders_liste.dersAd).equals(silinecek_ders))
					{
						break;
					}
					index_konum++;
				}
				Dersler.remove(index_konum);
				break;

				
			case 5:
				System.out.println("Eklemek istediğiniz öğrencinin ad-soyad giriniz: ");
				String ekle_ad=verial.next();
				verial.nextLine();
				System.out.println("Eklemek istediğiniz öğrencinin ID giriniz: ");
				int ekle_id=verial.nextInt();
				System.out.println("Eklemek istediğiniz öğrencinin yaşını giriniz: ");
				int  ekle_yas=verial.nextInt();
				System.out.println("Kaç adet ders eklenecek?");
				int ekle_sayi=verial.nextInt();
				//FileReader fr3=new FileReader(ogr_Dosya);
				//BufferedReader br3=new BufferedReader(fr3);
				
				
				for(Ogrenci i:Ogrenciler)
				{
					
					if(ekle_id==i.ogrId)
					{
						System.out.println("Bu ID başka öğrenciye aittir.");
						break;
					}
				}
				Ogrenci yeniOgrenci = new Ogrenci(ekle_id,ekle_ad,ekle_yas);
				Ogrenciler.add(yeniOgrenci);
				
				for(int i=0;i<ekle_sayi;i++)
				{
					okunan_ogr=br2.readLine();
					System.out.println("Eklenecek Dersin adını giriniz.");
					String ekle_ders=verial.next();
					verial.nextLine();
					
					 Ders ekle_d=new Ders(ekle_ders);
					 //temp_ogr.setDers(ekle_d); //HATALI KISIM
					 yeniOgrenci.alinanDersler.add(ekle_d);
				}
				
				break;
				
			case 6:
				System.out.println("Aranacak öğrencinin adını giriniz: ");
				verial.nextLine();
				String ara_ogr=	verial.nextLine();
			
				int ara_sayac=0;
				for(Ogrenci i:Ogrenciler)
				{
					
					if(ara_ogr.equals(i.ogrAdSoyad))
					{
						System.out.println("Aranan öğrencilerin bilgileri:");
						System.out.println(i.ogrId+" "+i.ogrAdSoyad+" "+i.ogrYas);
						ara_sayac=1;
					}
					
				}
				if(ara_sayac==0)
				{
					System.out.println("Bu isimde öğrenci bulunamadı.");
				}
				
				
				
				
				break;
			case 7:
				System.out.print("Silinecek Öğrencinin ID Giriniz:");
				int sil_ogr=verial.nextInt();
				int sil_sayac=0;
				
								
				for(Ogrenci i:Ogrenciler)
				{
					if(sil_ogr==i.ogrId)
					{
						break;
					}
					sil_sayac++;
				}
				Ogrenciler.remove(sil_sayac);
				break;
			case 8:
				for(Ogrenci i:Ogrenciler)
				{
					System.out.println(i.ogrId+" "+i.ogrAdSoyad+" "+i.ogrYas);
				}
				System.out.println("---------------------------------------------------------------------");
				
				break;
			case 9:
				for(Ogrenci i:Ogrenciler)
				{
					System.out.println(i.ogrId+" "+i.ogrAdSoyad+" "+i.ogrYas);
					for(Ders temp_ders : i.getAlinanDersler())
					{
						System.out.println(temp_ders.getDersAd());
					}
					System.out.println("---------------------------------------------------------------------");
				}
				break;
			case 10:
				int alinan_ders=0;
				int haftalik_ucret=400;
				float odenen_ucret=0;
				System.out.print("Öğrenci ID giriniz:");
				int aranan_id=verial.nextInt();
				for(Ogrenci i:Ogrenciler)
					{
						if(aranan_id==i.ogrId)
						{
							for(Ders temp_ders : i.getAlinanDersler())
							{
								alinan_ders++;
							}
						}
					}
				if(alinan_ders==2)
				{
					odenen_ucret=(float) (haftalik_ucret*4+haftalik_ucret*0.95*4);
					System.out.println("Alınan Ders Sayısı: "+alinan_ders);
					System.out.println(aranan_id+" ID'ye sahip öğrencinin ödeyeceği ücret: "+odenen_ucret+"TL'dir.");
					
					
				}
				else if(alinan_ders==3)
				{
					
					odenen_ucret=(float) (haftalik_ucret*4+haftalik_ucret*4+haftalik_ucret*0.85*4);
					System.out.println("Alınan Ders Sayısı: "+alinan_ders);
					System.out.println(aranan_id+" ID'ye sahip öğrencinin ödeyeceği ücret: "+odenen_ucret+"TL'dir.");
					
				}
				else if(alinan_ders==1)
				{
					
					odenen_ucret=haftalik_ucret*4;
					System.out.println("Alınan Ders Sayısı: "+alinan_ders);
					System.out.println(aranan_id+" ID'ye sahip öğrencinin ödeyeceği ücret: "+odenen_ucret+"TL'dir.");
				}
				else
				{
					odenen_ucret= (float) (haftalik_ucret*4*0.90);
					odenen_ucret=(float) Math.pow(haftalik_ucret, alinan_ders);
					System.out.println("Alınan Ders Sayısı: "+alinan_ders);
					System.out.println(aranan_id+" ID'ye sahip öğrencinin ödeyeceği ücret: "+odenen_ucret+"TL'dir.");
					
				}
				
				System.out.println("---------------------------------------------------------------------");
				
				break;
				
				
				
				
			case 11:
				FileWriter fw =new FileWriter(ders_Dosya);
				BufferedWriter bw= new BufferedWriter(fw);
				for(Ders ders_liste:Dersler)
				{
					bw.write(ders_liste.dersId+"%"+ders_liste.dersAd+"\n");
				}
				fw.flush();
				bw.flush();
				
				FileWriter fw2 =new FileWriter(ogr_Dosya);
				BufferedWriter bw2= new BufferedWriter(fw2);
				
				for(Ogrenci i:Ogrenciler)
				{
					bw2.write("+"+i.ogrId+"%"+i.ogrAdSoyad+"%"+i.ogrYas+"\n");
					for(Ders temp_ders : i.getAlinanDersler())
					{
						bw2.write("*"+temp_ders.dersId+"%"+temp_ders.dersAd+"\n");
					}
					
				}
				fw2.flush();
				bw2.flush();
				bw2.close();
				
				kontrol=1;
				break;
				
			}
					
			
		}
	}

}

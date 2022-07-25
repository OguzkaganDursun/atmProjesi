import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Degiskenler tanimlandi.
        String kullaniciAdi, sifre;
        int girisHakki = 3, bakiye = 2500, secim, yatirilacakPara, cekilecekPara;

        //Kullancidan veri alindi ve banka islemleri yaptirildi.
        Scanner scan = new Scanner(System.in);

        while (girisHakki > 0)
        {
            System.out.print("Kullanici Adinizi Giriniz : ");
            kullaniciAdi = scan.nextLine();

            System.out.print("Sifrenizi Giriniz : ");
            sifre = scan.nextLine();

            if (kullaniciAdi.equals("patika") && sifre.equals("kod123"))
            {
                System.out.println("---------------------------------\nBasariyla Giris Yaptiniz." +
                        "\nKodluyoruz Bankasina Hos Geldiniz!");

                do
                {
                System.out.print("---------------------------------\nLutfen Yapmak Istediginiz Islemi Seciniz : \n1. Para Yatirma " +
                        "\n2. Para Cekme " + "\n3. Bakiye Sorgulama \n4. Cikis Yap \nSeciminiz : ");
                secim = scan.nextInt();

                switch (secim)
                {
                    case 1 :
                        System.out.print("---------------------------------\nYatirmak Istediginiz Tutari Giriniz : ");
                        yatirilacakPara = scan.nextInt();
                        bakiye += yatirilacakPara;
                        break;

                    case 2 :
                        System.out.print("---------------------------------\nCekmek Istediginiz Tutari Giriniz : ");
                        cekilecekPara = scan.nextInt();
                        if (cekilecekPara > bakiye)
                        {
                            System.out.println("---------------------------------\nBakiyenizden Yuksek Para Cekemezsiniz!");
                        }
                        else
                        {
                            bakiye -= cekilecekPara;
                        }
                        break;

                    case 3 :
                        System.out.println("---------------------------------\nBakiyeniz : " + bakiye);
                        break;
                }

                }
                while (secim != 4);
                System.out.println("---------------------------------\nSistemden Cikis Yapiliyor. \nIyi Gunler Dileriz!");
                break;

            }
            else
            {
                girisHakki--;
                System.out.println("---------------------------------\nHatali Kullanici Adi Ya Da Sifre Girdiniz. " +
                        "\nLutfen Tekrar Deneyiniz.");

                if (girisHakki == 0)
                {
                    System.out.println("---------------------------------\nUst Uste 3 Defa Hatali Giris Yaptiniz." +
                            "\nHesabiniz Bloke Olmustur!\nLutfen Banka Ile Iletisime Geciniz.");
                }
                else
                {
                    System.out.println("---------------------------------\nKalan Hakkiniz : " + girisHakki);
                }

            }
        }
    }
}

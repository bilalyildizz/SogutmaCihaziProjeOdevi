import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu {
    IMerkeziSistem merkeziSistem;
    public AgArayuzu(){
        this.merkeziSistem = new MerkeziSistem();
    }
    @Override
    public void kullaniciSorgusu() {
        boolean sorguSonucu = false;
        Kullanici kullanici =new Kullanici.KullaniciBuilder().build();
        while (sorguSonucu ==false){
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı Adı: ");
            kullanici.setIsim(input.nextLine());
            System.out.print("Şifre: ");
            kullanici.setSifre(input.nextInt());
            sorguSonucu=merkeziSistem.kullaniciSorgula(kullanici);
        }

    }

    @Override
    public int menuSecimi() {
        System.out.println("1-)Sıcaklık Goruntule \n2-)Soğutucu Aç\n3-)Sogutucu Kapat \n4-)Çıkış \n");
        Scanner input =new Scanner(System.in);
        System.out.print("Seçim Sonucu: ");
        return input.nextInt();
    }

    @Override
    public void sicaklikGonder() {
         int sicaklik = merkeziSistem.sicaklikGonder();
         System.out.println("Sıcaklık Değeri: " +sicaklik);
         IObserver observer1 = new Observer1();
         ISubject publisher = new Publisher();
         publisher.attach(observer1);

         if(sicaklik>50){
            publisher.notify("Sıcaklık çok yüksek soğutucuyu açınız");
         }

    }

    public void sogutucuAc(){
       System.out.println(merkeziSistem.sogutucuAc());


    }
    public void sogutucuKapat(){
        System.out.println(merkeziSistem.sogutucuKapat());

    }

}

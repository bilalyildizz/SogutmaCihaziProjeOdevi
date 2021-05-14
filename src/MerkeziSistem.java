public class MerkeziSistem implements  IMerkeziSistem {
     IEyleyici eyleyici;
     ISicaklikAlgilayici sicaklikAlgilayici;
     public MerkeziSistem (){
         eyleyici = new Eyleyici();
         sicaklikAlgilayici = new SicaklikAlgilayici();
     }

    @Override
    public boolean kullaniciSorgula(Kullanici kullanici) {

        IBilgiSistemi bilgiSistemi = new BilgiSistemi(new PostgreSQLSurucu());
        Kullanici gelenKullanici = bilgiSistemi.kullaniciDogrula(kullanici);
        if(gelenKullanici !=null){
            System.out.println("Kullanıcı doğrulandı");
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public int sicaklikGonder() {
         return sicaklikAlgilayici.SicaklikOku();

    }
    public String sogutucuAc(){
         boolean sogutucuDurumu= eyleyici.sogutucuAc();
         if(sogutucuDurumu ==true){
             return "Soğutucu Açıldı";
         }
         else{
             return "Soğutucu Açılırken Hata Oluştu";
         }


    }
    public String sogutucuKapat(){
        boolean sogutucuDurumu= eyleyici.sogutucuKapat();
        if(sogutucuDurumu !=true){
            return "Soğutucu Kapatıldı";
        }
        else{
            return "Soğutucu Kapatılırken Hata Oluştu";
        }
    }
}

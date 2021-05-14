public class SogutucuCihazı {
    IAgArayuzu agArayuzu;

    public SogutucuCihazı(){
        this.agArayuzu = new AgArayuzu();
    }

 public  void basla(){
 // ağ arayüzünde kaldım
     agArayuzu.kullaniciSorgusu();
     boolean cikisYaptiMi=false;
     while(cikisYaptiMi!=true) {
        cikisYaptiMi= this.secimSonucu(agArayuzu.menuSecimi());
     }
 }

 public boolean secimSonucu(int sonuc){
     switch(sonuc) {
         case 1:
             agArayuzu.sicaklikGonder();
             return false;
         case 2:
             agArayuzu.sogutucuAc();
             return false;
         case 3:
             agArayuzu.sogutucuKapat();
             return false;
         case 4:
             return true;
         default:
             return false;

     }
 }

}

public class Kullanici {
    private String isim;
    private int sifre;


    private Kullanici(KullaniciBuilder kullaniciBuilder){
        this.isim =kullaniciBuilder.isim;
        this.sifre=kullaniciBuilder.sifre;


    }

    public String  getIsim(){return isim;}
    public int  getSifre(){return sifre;}
    public void setIsim(String isim){this.isim = isim;}
    public void setSifre(int sifre){this.sifre = sifre;}

    public static class KullaniciBuilder
    {
        private String isim;
        private int sifre;


        public KullaniciBuilder(){

        }

        public KullaniciBuilder isim(String isim){
            this.isim =isim;
            return this;
        }
        public KullaniciBuilder sifre(int sifre){
            this.sifre =sifre;
            return this;
        }
        public Kullanici build(){
            return new Kullanici(this);
        }
    }



}

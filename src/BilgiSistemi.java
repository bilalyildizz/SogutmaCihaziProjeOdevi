public class BilgiSistemi implements IBilgiSistemi{

    private IBilgiSistemi veritabani;
    public BilgiSistemi(IBilgiSistemi veritabani){
        this.veritabani=veritabani;
    }

    @Override
    public Kullanici kullaniciDogrula(Kullanici kullanici) {
        return veritabani.kullaniciDogrula(kullanici);
    }
}

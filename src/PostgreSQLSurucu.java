import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLSurucu implements IBilgiSistemi {

    public Kullanici kullaniciDogrula(Kullanici kullaniciKontrol) {
        Kullanici kullanici = null;

        System.out.println("banka bilgi sistemi kullanıcıyı doğruluyor...");
        Araclar.bekle(2000);
        System.out.println("veritabanına bağlandı (postgresql veritabanı yönetim sistemi) ve kullanıcıyı sorguluyor...");
        Araclar.bekle(2000);

        //veritabani.baglan(hesapNumarasi, sifre);

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sogutma",
                    "postgres", "fetih1453");
            if (conn != null){}

            else
                System.out.println("Bağlantı girişimi başarısız!");


            String sql = "SELECT *  FROM \"kullanici\" WHERE \"isim\"='"+ kullaniciKontrol.getIsim()+"' AND password='" +kullaniciKontrol.getSifre()+"'" ;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //***** Bağlantı sonlandırma *****
            conn.close();

            String kullaniciAdi;
            int sifre;

            while (rs.next()) {
                kullaniciAdi = rs.getString("isim");
                sifre = rs.getInt("password");


                /*System.out.print("Hesap No:"+ hesapNo);
                System.out.print(", Bakiye:" + bakiye);
                System.out.println("Adi:" + adi);
                System.out.println(", Soyadı:" + soyadi);*/

                kullanici = new Kullanici.KullaniciBuilder().isim(kullaniciAdi).sifre(sifre).build();
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kullanici;
    }
}
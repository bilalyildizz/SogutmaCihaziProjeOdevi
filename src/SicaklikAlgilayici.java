import java.util.Random;
public class SicaklikAlgilayici implements ISicaklikAlgilayici{
    int sicaklik;
    Random random;
    public SicaklikAlgilayici(){
        random=new Random();
        sicaklik=random.nextInt(100);
    }
    @Override
    public int SicaklikOku() {

        return sicaklik;

    }
}

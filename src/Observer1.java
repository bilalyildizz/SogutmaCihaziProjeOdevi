public class Observer1 implements  IObserver{


    @Override
    public void update(String mesaj) {
        System.out.println(mesaj);
    }
}

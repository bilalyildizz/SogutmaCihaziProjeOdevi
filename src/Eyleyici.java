public class Eyleyici implements IEyleyici{

     boolean sogutucuAcikMi;
     public Eyleyici(){
         this.sogutucuAcikMi=false;
     }


    public boolean sogutucuAc(){
         sogutucuAcikMi=true;
         return sogutucuAcikMi;



    }
    public boolean sogutucuKapat(){
         sogutucuAcikMi=false;
         return sogutucuAcikMi;


    }
}

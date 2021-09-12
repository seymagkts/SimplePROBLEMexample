import java.util.Scanner;
public class main {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);

        String secenek="Cıkıs icin q'ya basın\n"+
                       "1-Daire alanı hesaplama\n"+
                       "2-Ucgen cevresi hesaplama\n" +
                       "3-İc carpım hesaplama";

        System.out.println(secenek);

        while(true){
            System.out.println("--------------------------------");
            System.out.println("Bir islem seciniz: ");
            String islem=scanner.nextLine();

           if(islem.equals("q") ){
               System.out.println("Uygulama sonlanıyor...");
               break;
           }
            else if(islem.equals("1")){
               System.out.println("Yarıcap giriniz: ");
               int yaricap=scanner.nextInt();
               scanner.nextLine();

               problem.Matematik.daireAlan(yaricap);
            }
            else if(islem.equals("2")){
               System.out.print("kenar1 değeri giriniz: ");
               int a1=scanner.nextInt();
               System.out.print("kenar2 değeri giriniz: ");
               int b1=scanner.nextInt();
               System.out.print("kenar3 değeri giriniz: ");
               int c1=scanner.nextInt();
               scanner.nextLine();

               problem.Matematik.ucgenCevre(a1,b1,c1);

            }
            else if(islem.equals("3")){
               vec vec1=new vec("Vektor1");
               vec vec2=new vec("Vektor2");
               problem.Fizik.icCarpım(vec1,vec2);
           }
            else{
               System.out.println("Gecersiz islem");
           }
        }
    }
}

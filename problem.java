public class problem {
    public static class Matematik{
        public static void daireAlan(int yaricap){
            System.out.println("Dairenin alanı: "+ Math.PI*yaricap*yaricap) ;
        }
        public static void ucgenCevre(int kenar1,int kenar2,int kenar3){
            System.out.println("Ucgenin cevresi: "+(kenar1+kenar2+kenar3));
        }
    }
    public static class Fizik{
        public static void icCarpım(vec vec1,vec vec2){
            int icCarpımm= (vec1.getI()*vec2.getI()) + (vec1.getJ()*vec2.getJ()) + (vec1.getK()*vec2.getK());
            System.out.println(vec1.getIsim()+" ile "+ vec2.getIsim()+"'in iç çarpımı: "+ icCarpımm);
        }
    }
}
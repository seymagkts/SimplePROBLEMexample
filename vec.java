import java.util.Scanner;

public class vec {
    private String isim;
    private int i;
    private int j;
    private int k;

    public vec(String isim){
        this.setIsim(isim);

        Scanner scanner=new Scanner(System.in);
        System.out.println(isim+ " in i, j ve k degerlerini girin: ");
        System.out.print("i: ");
        this.setI(scanner.nextInt());
        System.out.print("j: ");
        this.setJ(scanner.nextInt());
        System.out.print("k: ");
        this.setK(scanner.nextInt());

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}

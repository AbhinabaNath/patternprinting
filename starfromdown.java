package patternprinting.java;

public class starfromdown {
    public static void main(String[] args) {
        int n=5;
        int nsp=0;
        int nst=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp++;
            nst--;

        }
    }
}

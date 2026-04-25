package patternprinting.java;

public class leftsiderightangletriangle {
    public static void main(String[] args) {
        int n=4;
        int nsp=3;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp--;
            nst++;
        }
    }
}

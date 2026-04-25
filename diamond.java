package patternprinting.java;

public class diamond {
    public static void main(String[] args) {
        int row=4, col=7;
        int nsp=row-1;
        int nst=1;
        for(int i=1;i<=row;i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }

        int rrow=3;
        int nssp=1;
        int nsst=5;

        for(int i=1;i<=rrow;i++) {
            for (int j = 1; j <= nssp; j++) {
                System.out.print(" ");
            }

            for(int j=1;j<=nsst;j++){
                System.out.print("*");
            }
            System.out.println();
            nssp++;
            nsst-=2;
        }




    }
}

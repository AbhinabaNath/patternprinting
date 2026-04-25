package patternprinting.java;

public class starplus {
    public static void main(String[] args) {
        int row=2;
        int col=5;
        int nsp=2;
        int nst=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }

        int ro=1;
        int co=5;
        for(int i=1;i<=ro;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        int rrow=2;
        int nssp=2;
        int nsst=1;

        for(int i=1;i<=rrow;i++){
            for(int j=1;j<=nssp;j++){
                System.out.print(" " +" ");
            }
            for(int j=1;j<=nsst;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }

    }
}

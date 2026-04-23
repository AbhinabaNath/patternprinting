package patternprinting.java;

public class numberbridge {

    public static void main(String[] args) {
        int row=4;
        int col=4;
        int spaces=2*(row-1);//2*(n-1)
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=spaces;k++){
                System.out.print("-");
            }

            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
            spaces-=2;

        }


    }
}

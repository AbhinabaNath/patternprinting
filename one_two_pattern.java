package patternprinting.java;

public class one_two_pattern {
    public static void main(String[] args) {
        int row=4,col=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){

                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

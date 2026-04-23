package patternprinting.java;

public class ultaStar {
    public static void main(String[] args) {
        int row=4,col=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col+1-i;j++){

                System.out.print ("*");
            }
            System.out.println();
        }
    }
}

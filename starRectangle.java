package patternprinting.java;

public class starRectangle {
    public static void main(String[] args) {
        int row=3,col=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

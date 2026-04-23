package patternprinting.java;

public class number_rectangle {
    public static void main(String[] args) {
        int row=4,col=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                int a=64+j;
                char c =(char)a;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

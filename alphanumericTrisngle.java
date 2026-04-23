package patternprinting.java;

public class alphanumericTrisngle {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print((char)(j+64) +" ");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

package patternprinting.java;

public class zero_one {
    public static void main(String[] args) {
        int n=4;
        int a=0;
        int b=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(a);

                }
                else{
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }
}

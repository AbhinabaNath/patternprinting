package patternprinting.java;

public class PROGRAMS {
    public static void main(String[] args) {
        int sum=0;
        int multiply=0;
        int n=153;
        while(n!=0){
            int digit=n%10;
            multiply=(int)Math.pow(digit,3);
            sum=multiply+sum;
            n=n/10;
        }
        System.out.println(sum);
        int dup=153;
        if(sum==dup){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not");
        }
    }

}

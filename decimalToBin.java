import java.util.ArrayList;

class decimalToBin{
    
    public static String wholeToBin(int num){
        String ans = "";
        do {
            ans += num % 2;
            num = (int)Math.floor(num / 2);
        }while(num != 0);
        return reverse(ans);
    }
    public static String decToBinUsingWhole(double num) {
        //change the decimal to string and check the size of decimal - 2 (gets rid of 0. before the number)
        String x = num + "";
        int whole = (int)(num * Math.pow(2, x.length()-2));
        return reverse(wholeToBin(whole));

    }
    public static String reverse(String x) {
        String end = "";
        for(int i = x.length()-1; i >= 0; i--){
            end += x.charAt(i);
        }
        return end;
    }

    public static void main(String[] args) {
        double startNum = 7.125;
        System.out.println("Starting number:" + startNum);
        //split the number into the whole number and its decimal
        int num = (int)Math.floor(startNum);
        double dec = startNum - Math.floor(startNum);
        
        System.out.print(wholeToBin(num) + ".");
        System.out.println(decToBinUsingWhole(dec));
    }

}
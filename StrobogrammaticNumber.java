import java.util.HashMap;
import java.util.Scanner;

public class StrobogrammaticNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.nextLine();
        if(isStrobogrammatic(num)){
            System.out.println(num+" is a strobogrammatic number");
        }else{
            System.out.println(num+" not a strobogrammatic number");
        }
    }public static boolean isStrobogrammatic(String num){
        HashMap<Character, Character> str = new HashMap<>();
        str.put('0','0');
        str.put('1','1');
        str.put('6','9');
        str.put('8','8');
        str.put('9','6');
        int n =num.length();
        for(int i=0,j=(n-1);i<=j;i++,j--){
            char digit_left = num.charAt(i);
            char digit_right = num.charAt(j);
            char mapping = str.getOrDefault(digit_left, '-');
            if(mapping == '-'){
                return false;
            }if(mapping!=digit_right){
                return false;
            }
        }return true;

    }
}

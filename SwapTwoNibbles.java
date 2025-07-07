

import java.util.*;
public class SwapTwoNibbles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int Swapnum = ((num&0x0F)<<4)|((num&0xF0)>>4);
        System.out.println(Swapnum);
    }
}

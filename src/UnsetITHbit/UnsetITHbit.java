package UnsetITHbit;

import java.util.Scanner;

public class UnsetITHbit {
	
	public static int unSetBit(int number, int index){
		
		  return ((number & (1<<index)) == 0) ? number : (int)(number - Math.pow(2,index));
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int index = scan.nextInt();
		System.out.println(unSetBit(number,index));
    }

}

import java.util.*;
public class lottopro {
    public static void main(String[] args) {

		int num = 6;
		int start = 1;
		int end = 45;

		int[] value = new int[num]; 
		boolean f = false; 
		int randvalue; 

		Random rand = new Random(); 

		for(int i=0; i<num; i++) {
			f = false;
			randvalue = rand.nextInt(end-start+1) + (start); 
			for(int j=0; j<i; j++) {
				if(randvalue == value[j]) {
					f = true;
					break; 
				}
				
			}
			if(f) {
				i--; 
			}
			else {
				value[i]=randvalue; 
			}
		}
		for (int i=0; i<num; i++) {
			System.out.print(value[i]);
			if(i != num-1) {
				System.out.print(", ");
			}
		}
		

        }
    }



import java.util.Random;
import java.util.Scanner;


public class dian21 {
	public static void main(String[] args) {
		System.out.println("Start Game !");
		Random r = new Random();
		int user_card = r.nextInt(13);
		if(user_card == 1) {
			System.out.println("A");
		}
		else if(user_card == 11) {
			System.out.println("J");
		}
		else if(user_card == 12) {
			System.out.println("Q");
		}
		else if(user_card == 13) {
			System.out.println("K");
		}

		for(;;) {
			int sum_user = 0, count = 0;
			System.out.println("Do you want another card? Y/N");
			Scanner sr = new Scanner(System.in);
			String ch = sr.nextLine();
			if (!ch.equals("Y") && !ch.equals("y")) {
				Random r_new = new Random();
				int new_user_card = r_new.nextInt(13);
				if(new_user_card== 1) {
					System.out.println("A");
				}
				else if(new_user_card== 11) {
					System.out.println("J");
				}
				else if(new_user_card == 12) {
					System.out.println("Q");
				}
				else if(new_user_card == 13) {
					System.out.println("K");
				}
				if (sum_user>=21){
					sum_user += user_card + new_user_card;
					count += 1;
					break;
				}
			}
			else if(!ch.equals("N") && !ch.equals("n")){
				break;
			}

		}

	}

}

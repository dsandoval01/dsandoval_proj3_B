/* CapGainApp class where the main menu is printed out and the user can 
 * buy or sell shares at x amount of price. Usage of pseudocode in project
 * instructions are used */
 
class CapGainApp{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		CapGain cg = new CapGain();
		String answer;
		do{
			cg.mainMenuPrompt(); //Creating a new CapGain object labeled cg
			System.out.println("Please select one option: ");
			answer = s.nextLine();
			if( answer.equals("1")){
				System.out.println("Please insert shares: ");
				String shares = s.nextLine();
				int giveShares = Integer.valueOf(shares);
				System.out.println("Please insert price: ");
				String givePrice = s.nextLine();
				double gPrice = Double.valueOf(givePrice);
				cg.buy(giveShares,gPrice);
				cg.sharesHeld.display();
			}
			else if(answer.equals("2")){
				System.out.println("Please insert shares: ");
				String shares = s.nextLine();
				int giveShares = Integer.valueOf(shares);
				System.out.println("Please insert price: ");
				String givePrice = s.nextLine();
				double gPrice = Double.valueOf(givePrice);
				cg.sell(giveShares,gPrice);
				cg.sharesHeld.display();
			}

			else if (answer.equals("3")){
				System.out.println("This is your total capital gain so far:");
				System.out.println(cg.getTotalCapGain());
			}

			else{ //Output farewell message
				System.out.println("Okay, Good Bye :)");
			}
		} while (answer.equals("1") || answer.equals("2") || answer.equals("3"));
	}
}
package Day2;

public class switchcase {

	public static void main(String[] args) {
		char Course='x';
		switch (Course) {
		case 'u':
			System.out.println("you are selected UFT tool");
			break;
		case 's':
			System.out.println("you are selected Selelenium tool");
			break;
		case 'l':
			System.out.println("you are selected loadrunner");
			break;
		default:
			System.out.println("Please opt a valid option");
			break;
		}

	}

}

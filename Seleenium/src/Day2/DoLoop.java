package Day2;

public class DoLoop {

	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println(i);
			if (i==5) {
				break;
			}
			i++;
		} while (i < 10);

	}

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("KM: ");
		double km = input.nextDouble();
		double tutar = 10+(km*2.20);

		double sonuc = (tutar <20) ? 20 : tutar;
		System.out.println(sonuc);
	}
}
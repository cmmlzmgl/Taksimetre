import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kmPrice = 2.20, totalPrice;
        int beginPrice = 10, kmInput;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Taksinin Aldığı Mesafeyi Giriniz: ");
        kmInput = input.nextInt();

        totalPrice = beginPrice + (kmPrice * kmInput);

        if ( totalPrice < 20)
        {
            System.out.print("Borcunuz 20 TL'dir.");
        } else
        {
            System.out.print("Borcunuz " + totalPrice + "TL'dir");
        }
    }
}

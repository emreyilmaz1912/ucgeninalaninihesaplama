import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Üçgenin Alanını Hesaplamak İçin Aşağıya Değerleri Girin...");
        /* Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

        double uc;                                           // uc = üçgenin çevresi,
        double a, b, c, ua;                                 // ua = üçgenin alanı

        Scanner input = new Scanner(System.in);
        System.out.print("A Kenarının Uzunluğunu Giriniz :");
        a = input.nextDouble();
        System.out.print("B Kenarının Uzunluğunu Giriniz :");
        b = input.nextDouble();
        System.out.print("C Kenarının Uzunluğunu Giriniz :");
        c = input.nextDouble();

        uc = (a + b + c);
        double ucy = uc / 2;                                //ucy = üçgenin çevresinin yarısı

        ua = Math.sqrt( ucy*(ucy - a)*(ucy - b)*(ucy - c));

        System.out.println("");                            //Araya boşluk eklemek için
        System.out.println("Üçgenin Çevresi : " + uc);
        System.out.println("Üçgenin Alanı   : " + ua);

    }
}
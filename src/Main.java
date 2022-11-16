import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,slct;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz: ");
        n1 = inp.nextInt();
        System.out.print("Ikıncı Sayiyi Giriniz: ");
        n2 = inp.nextInt();
        System.out.println("1. Topla\n2. Cikar\n3. Carp\n4. Bol ");
        slct = inp.nextInt();

        switch (slct) {
            case 1:
                System.out.println("Sonuç: " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç: " + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç: " + (n1*n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.print("Bir sayı 0'a bölünemez");
                        break;
                    default:
                        System.out.println("Sonuç: " + (n1/n2));
                break;
                }

            default:
                System.out.println("Yanlış Seçim yaptınız tekrar deneyiniz");


        }

    }
}
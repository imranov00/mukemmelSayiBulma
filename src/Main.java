import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        System.out.println("Girilen Sayıların Mükemmel Bir Sayı olup olmadığını bulma programı.");
        Scanner input= new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz:");
        int sayi= input.nextInt();

        int toplam =0 ;
        for (int i = 1; i <= sayi/2; i++){

            if (sayi % i == 0){
                toplam +=i;
            }
        }
        if (toplam == sayi){
            System.out.println(sayi + "  Mükemmel Bir Sayıdır. ");
        }else {
            System.out.println(sayi + "  Mükemmel Sayı Değildir.");
        }
    }
}
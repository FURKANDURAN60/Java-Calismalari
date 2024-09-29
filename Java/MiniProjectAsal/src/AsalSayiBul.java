import java.util.Scanner; 

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AsalSayiBul {
    public static void main(String[] args) {

        System.out.println("Lütfen Bir Sayı Giriniz : ");

        int number = new Scanner(System.in).nextInt() ;

        boolean isPrime = true ;

        if(number == 1) {
            System.out.println("1 Asal bir sayi değildir.");
            return;
        }
        else if(number <= 0){
            System.out.println("Geçersiz sayi girşi yaptınız.");
        }
        else{
            for(int i = 2 ; i < number  ; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Girilen "+number+" sayisi ASALdir.");
            }
            else{
                System.out.println("Girilen "+number+" sayisi ASAL degildir.");
            }
        }
    }
}
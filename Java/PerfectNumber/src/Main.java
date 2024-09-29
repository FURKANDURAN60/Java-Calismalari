import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        System.out.println("Lütfen bir sayi girişi yapınız : ");
        int number = new Scanner(System.in).nextInt();
        int isPerfect = 0 ;
        for(int i = 1 ; i < number ; i++){

            if(number%i == 0){
                isPerfect = isPerfect + i  ;
            }
        }

        if(number == isPerfect){
            System.out.println("Girilen "+number+" sayısı mükemmel bir sayidir.");
        }
        else{
            System.out.println("Girilen "+number+" sayısı mükemmel sayı değildir.");
        }

    }
}
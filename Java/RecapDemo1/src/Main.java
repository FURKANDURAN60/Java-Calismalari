//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        int enBuyuk = sayi1 ;

        if(enBuyuk<sayi2) {
            enBuyuk = sayi2 ;
        }
        if(enBuyuk<sayi3){
            enBuyuk = sayi3 ;
        }

        System.out.println("En Buyuk Sayı : "+enBuyuk);

    }
}
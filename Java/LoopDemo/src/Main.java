//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(int i = 1 ; i<=10 ; i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");

        int i = 1 ;
        while( i <=10){
            int kalan = 10 - i  ;

            System.out.println("Döngüden Çıkmak İçin Kalan Sayı : "+kalan);

            i = i + 1 ;

        }
        System.out.println("While Döngüsü Bitti.");

        int j = 100 ;
        do{
            System.out.println(j);
            j-=5 ;
        }while(j == 10) ;
        System.out.println("Do-While Döngüsü Bitti.");


    }
}
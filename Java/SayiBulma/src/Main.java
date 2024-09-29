import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {

        int sayilar[] = {15,12,17,6,99,9,7,20,1,11,14,10,8,23,47,60};

        System.out.println("Dizide aramak istediğiniz sayiyi giriniz : ");
        int aranacak = new Scanner(System.in).nextInt();

        boolean bulundumu = false ;
        int index = 0 ;
        for(int i = 0 ; i<sayilar.length ; i++){
            if(aranacak == sayilar[i]){
                bulundumu = true ;
                index = i  ;
             break;
            }
        }

        if(bulundumu == true){
            System.out.println("Aradığınız sayi dizide "+index+". indiste bulundu.");
        }else{
            System.out.println("Aradığınız sayi dizide bulunamadı.");
        }

    }
}
import java.util.Scanner ;


public class Main {
    public static void main(String[] args) {

        char[] sesli = {'A','a','E','e','I','ı','İ','i','O','o','Ö','ö','U','u','Ü','ü'} ;

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Lütfen bir cümle girişi yapınız : ");
        String cumle = scanner.nextLine();

        int sesliHarfSayisi = 0 ;

        for(char harf:cumle.toCharArray()){
            for( char sesliHarf : sesli){

                if(harf == sesliHarf){
                    sesliHarfSayisi++;
                    break;
                }
            }
        }
        System.out.println("Girilen cümledeki sesli harf sayisi : "+sesliHarfSayisi);

    }
}
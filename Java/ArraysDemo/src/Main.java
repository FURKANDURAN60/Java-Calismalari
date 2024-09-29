//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Furkan" ;
        String ogrenci2 = "Şevval" ;
        String ogrenci3 = "Salih" ;

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("--------------------------------------");

        String[] ogrenciler = new String[3] ; //Eleman Sayısı yazılır. new String[buraya] .
        ogrenciler[0] = "Furkan" ;
        ogrenciler[1] = "Şevval" ;
        ogrenciler[2] = "Salih"  ;
        //ogrenciler[3] = "Fatih" ; // OutofBounds HATA ALIRIZ . DİZİDE YER YOK.


        for(int i=0 ; i< ogrenciler.length ; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }


    }

}
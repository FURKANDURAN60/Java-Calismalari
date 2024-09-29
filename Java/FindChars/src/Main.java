import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir metin giriniz: ");
        String metin = input.nextLine();

        // Alfabenin büyük harflerini tutan bir dizi
        char[] alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        // Eşleşen harfleri tutacak string
        String eslesenHarfler = "";

        // Girilen metindeki her karakter için
        for (int i = 0; i < metin.length(); i++) {
            char mevcutKarakter = Character.toUpperCase(metin.charAt(i));  // Mevcut karakter

            // Alfabenin her harfi için
            for (char harf : alfabe) {
                // Eşleşen harfleri ekrana yazdır
                System.out.print(eslesenHarfler + harf + "\r");
                Thread.sleep(500);  // Her harf arasında 0.5 saniye bekle

                // Eğer eşleşme varsa
                if (harf == mevcutKarakter) {
                    eslesenHarfler += harf;  // Eşleşen harfi kaydet
                    Thread.sleep(1000);  // Eşleşme bulunduğunda 1 saniye bekle
                    break;
                }
            }
        }
        System.out.println(eslesenHarfler); // Tüm eşleşen harfleri yazdır
    }
}

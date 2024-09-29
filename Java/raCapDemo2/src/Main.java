//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] mylist = {1.2,1.3,1.4,1.5,1.6,7.0} ;

        double total = 0 ;
        double max = mylist[0];
        for(double number :mylist){
            if(max <number){
                max = number ;
            }
            System.out.println(number);

            total = total + number ;
        }

        System.out.println("Total : "+total);
        System.out.println("Max :"+max);
    }
}
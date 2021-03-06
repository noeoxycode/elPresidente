import java.util.Scanner;

public class endOfTheYear {
    public int endOfYear(){
        boolean result = false;
        int i = 0;
        int exit = 0;
        System.out.println("It's the end of the year! Choose one of these proposals:");
        while (result != true){
            System.out.println("1 is for Bribe\n2 is for Food Market\n3 is for Year-end review\n4 is for To leave");
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            switch(i){
                case 1:
                    //appeler Bride
                    break;
                case 2:
                    //appeler Food Market
                    break;
                case 3:
                    //appeler Year-end review
                    break;
                case 4:
                    System.out.println("See you next year");
                    result = true;
                default:
                    System.out.println("Error, please try again");
                    endOfYear();
                    break;
            }


        }
        return exit;
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //type in names of 10 presidents
        String[] presidents = new String[10];

        for(int i=0; i<presidents.length; i++){
            System.out.print("Enter a president's name: ");
            presidents[i] = sc.next();
        }

        //"history" to review list
        System.out.println("Type 'History' to review your list");
        String promptHistory = sc.next();

        //display the names from most recent
        if(promptHistory.equalsIgnoreCase("History")){
            for(int i=presidents.length; i>0; i--){
                System.out.print(presidents[i-1]+", ");
            }
        }

    }
}

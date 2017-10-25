import common.Months;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        for( Months m: Months.values() ) {
            System.out.println(m.getEnglishName());
        }

        System.out.println("Please choose a month:");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayList<String> months = new ArrayList<String>();

    }

}

import com.fasterxml.jackson.databind.ObjectMapper;
import common.Months;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Month;
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

        ArrayList<String> months = new ArrayList<String>(); switch(input) {
            case "January":
                months.add(Months.JANUARY.getEnglishName());
            case "February":
                months.add(Months.FEBRUARY.getEnglishName());
            case "March":
                months.add(Months.MARCH.getEnglishName());
            case "April":
                months.add(Months.APRIL.getEnglishName());
            case "May":
                months.add(Months.MAY.getEnglishName());
            case "June":
                months.add(Months.JUNE.getEnglishName());
            case "July":
                months.add(Months.JULY.getEnglishName());
            case "August":
                months.add(Months.AUGUST.getEnglishName());
            case "September":
                months.add(Months.SEPTEMBER.getEnglishName());
            case "October":
                months.add(Months.OCTOBER.getEnglishName());
            case "November":
                months.add(Months.NOVEMBER.getEnglishName());
            case "December":
                months.add(Months.DECEMBER.getEnglishName());
                break;
            default:
                months.add("No matching month!");
        }
        System.out.println(months);

        File newFile = new File("may.json");

        try {
            FileWriter fileWriter = new FileWriter(newFile);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(Month.JUNE);
            fileWriter.write(json);
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }


    }

}

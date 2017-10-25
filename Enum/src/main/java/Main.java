import common.Months;

public class Main {

    public static void main(String[] args){

        for( Months m: Months.values() ) {
            System.out.println(m.getEnglishName());
        }

    }

}

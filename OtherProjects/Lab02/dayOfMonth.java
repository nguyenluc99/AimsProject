import java.util.Arrays;
import java.lang.Integer;
import java.util.Scanner;
public class dayOfMonth{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int index = -1, year = -1;
        String yearStr, monthStr;
        String[] monthn1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] monthn2 = {"01", "02", "03", "04", "05", "06", "07", "08", "09"};
        String[] month3 = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        String[] month4 = {"jan.", "feb.", "mar.", "apr.", "may.", "jun.", "jul.", "aug.", "sep.", "oct.", "nov.", "dec."};
        String[] monthf = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Input year: ");
        while(year <= 0){
            yearStr = keyboard.nextLine();
            try {
                year = Integer.parseInt(yearStr);
            } 
            catch(Exception e) {
                System.out.println("Invalid year, input again, year =  ");
                year = -1;
            }
        } 
        System.out.print("Input month: ");
        if ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
            day[1]++;
        }
        while(index < 0){
            monthStr = keyboard.nextLine().toLowerCase();
            index = Arrays.asList(monthn1).indexOf(monthStr) + Arrays.asList(monthn2).indexOf(monthStr) + Arrays.asList(month3).indexOf(monthStr) + Arrays.asList(month4).indexOf(monthStr) + Arrays.asList(monthf).indexOf(monthStr) + 4;
            if (index == -1) {
                System.out.println("Invalid month, input again, month =  ");
            }
        } 
        System.out.println("There are " + day[index] + " days in " + monthf[index] + ", " + year);
        System.exit(0);
    }
}
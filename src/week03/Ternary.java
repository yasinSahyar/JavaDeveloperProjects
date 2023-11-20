package week03;

public class Ternary {
    public static void main(String[] args) {
        int n = 12;
        String month = "";
        if (n >= 1 && n <= 12) {
            if (n == 1) {
                month = "January";
            } else if (n == 2) {
                month = "February";
            } else if (n == 3) {
                month = "March";
            } else if (n == 4) {
                month = "April";
            } else if (n == 5) {
                month = "May";
            } else if (n == 6) {
                month = "June";
            } else if (n == 7) {
                month = "July";
            } else if (n == 8) {
                month = "August";
            } else if (n == 9) {
                month = "September";
            } else if (n == 10) {
                month = "October";
            } else if (n == 11) {
                month = "November";
            } else if (n == 12) {
                month = "December";
            } else {
                month = "Invalid Month";
            }
            System.out.println(month);

        }

        System.out.println("---------------------------------------------------");

        //Ternary:  // : ---> else ? ---> if

        int nT = 11;

        String monthT = "";

        monthT = (nT >= 1 && nT <= 12) ?

                monthT = (nT == 1) ? "January" : (nT == 2)? "February":(nT == 3) ? "March" : (nT == 4) ? "April"
                        : (nT == 5) ? "May" : (nT == 6) ? "June" : (nT == 7) ? "July" : (nT == 8) ? "August" : (nT == 9) ? "September"
                        : (nT == 10) ? "October" : (nT == 11) ? "November" : "December"
                :"No such a month";

        System.out.println("monthT = " + monthT);


    }
}

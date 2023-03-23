package Task2;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {

        //FIRST CHANGE (the instantiation of String [][] seats must happen before the double array is filled
        // with values:

        //this.seats[0][0] = "X";
        //this.seats = new String[rows][seats];

        this.seats = new String[rows][seats];


        // SECOND CHANGE (this.seats wasn't filled with any values anywhere in the code besides at this.seats[0][0])
        for (int i = 0; i <this.seats.length; i++) {

            for (int j = 0; j < this.seats[i].length; j++ ) {


                this.seats[i][j] = "O";

            }

        }

        this.seats[0][0] = "X";


    }

    public int getRows() {
        // THIRD CHANGE (seats.length is 20, so it returns 20, but there is no row 20 because the index of
        // an array and double array starts at 0 - so when a seat in row 20 is booked, the program returns an Exception)

        // return seats.length;
        return seats.length-1;
    }

    public int getSeats() {
        // THIRD CHANGE (seats[0].length is 10, so it returns 10, but there is no collumn 10 because the index of
        // an array and double array starts at 0 - so when a seat in collumn 10 is booked, the program returns an Exception)

        //return seats[0].length;
        return seats[0].length-1;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {

/*
        // MIN TILPASNING, SÅ RÆKKE 1 ER FØRSTE RÆKKE I UDPRINTNINGEN
        if (row > 0) {
            row -= 1;

        }

        if (seat > 0) {
            seat -= 1;

        }

 */


        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
/*
        // MIN TILPASNING
        if (row > 0) {
            row -= 1;

        }

        if (seat > 0) {
            seat -= 1;

        }

 */

        // FOURTH CHANGE (the program is case sensitive here)
        //if (seats[row][seat].equals("x")) {
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {

        // FIFTH CHANGE (in the first iteration through i, the result = null, so when it says "result += "|" "
        // this result becomes "null|", and so this will be displayed in the outprint in the cinema)

        // String result = null;
        String result = "";

        for (int i = 0; i < seats.length; i++) {

            result += "|";

            for (int j = 0; j < seats[i].length; j++) {

                result += seats[i][j] + "|";
            }

            result += "\n";
        }

        return result;
    }
}
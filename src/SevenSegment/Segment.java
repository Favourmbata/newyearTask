package SevenSegment;



public class Segment {
    public static class SevenSegment {

        public static void display(String numbers) {
            String[][] myClass = new String[][]{
                    {"#", "#", "#", "#"},
                    {"#", " ", " ", "#"},
                    {"#", "#", "#", "#"},
                    {"#", " ", " ", "#"},
                    {"#", "#", "#", "#"}};

            for (int row = 0; row < myClass.length; row++) {
                for (int column = 0; column < myClass[row].length; column++) {
                    char numChar = numbers.charAt(row * 3 + column); // Extract the character corresponding to this position
                    if (numChar == '0' || numChar == '2' || numChar == '3' || numChar == '5' || numChar == '6' || numChar == '7' || numChar == '8' || numChar == '9') {
                        // Set the appropriate segments for the number
                        if (row == 0) {
                            myClass[row][column] = "#";
                        } else if (row == 1 && (column == 0 || column == 3)) {
                            myClass[row][column] = "#";
                        } else if (row == 2) {
                            myClass[row][column] = "#";
                        } else if (row == 3 && (column == 0 || column == 3)) {
                            myClass[row][column] = "#";
                        } else if (row == 4) {
                            myClass[row][column] = "#";
                        }
                    } else {
                        // Clear the segments for the number
                        if (row == 0) {
                            myClass[row][column] = " ";
                        } else if (row == 1 && (column == 0 || column == 3)) {
                            myClass[row][column] = " ";
                        } else if (row == 2) {
                            myClass[row][column] = " ";
                        } else if (row == 3 && (column == 0 || column == 3)) {
                            myClass[row][column] = " ";
                        } else if (row == 4) {
                            myClass[row][column] = " ";
                        }
                    }
                    System.out.print(myClass[row][column] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            display("111111"); // Display number 8
        }
    }
}

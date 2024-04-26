package SevenSegment;

public class Switches {

        private static String[][] segment = {
                {"#","#","#","#","#"},
                {"#"," "," "," ","#"},
                {"#"," "," "," ","#"},
                {"#","#","#","#","#"},
                {"#"," "," "," ","#"},
                {"#"," "," "," ","#"},
                {"#","#","#","#","#"}
        };

        public static void main(String[] args) {
            sevenSegment("11111011");
        }

        public static void sevenSegment(String light) {
            if (validateLength(light)) {
                if (validateCharacter(light)) {
                    if(light.charAt(7) == '1'){
                        setSegment(light);
                        displaySegment();
                    }
                }
            }


        }

        private static void displaySegment() {
            for (int row = 0; row < segment.length; row++) {
                for (int column = 0; column < segment[row].length; column++) {
                    System.out.print(segment[row][column]);
                }
                System.out.println();
            }
        }

        private static void setSegment(String light) {
            setIndexZero(light.charAt(0));
            setIndexOne(light.charAt(1));
            setIndexTwo(light.charAt(2));
            setIndexThree(light.charAt(3));
            setIndexFour(light.charAt(4));
            setIndexFive(light.charAt(5));
            setIndexSix(light.charAt(6));
        }

        private static void setIndexSix(char c) {
            segment [6][1] = " ";
            segment [6][2] = " ";
        }

        private static void setIndexFive(char c) {
            if (c == '0'){
                segment [2][0] = " ";
                segment [3][0] = " ";
            }
        }

        private static void setIndexFour(char c) {
            if (c == '0'){
                segment[4][0] = " ";
                segment[5][0] = " ";

            }
        }

        private static void setIndexThree(char c) {
            if (c == '0'){
                segment [3][0] = " ";
                segment [3][1] = " ";
                segment [3][2] = " ";
                segment [3][3] = " ";
                segment [3][4] = " ";
            }
        }

        private static void setIndexTwo(char c) {
            if (c == '0'){
                segment[4][4] = " ";
                segment[5][4] = " ";
            }

        }

        private static void setIndexOne(char c) {
            if (c == '0'){
                segment[1][4] = " ";
                segment[2][4] = " ";
            }
        }

        private static void setIndexZero(char c) {
            if (c == '0'){
                segment[0][0] = " ";
                segment[0][1] = " ";
                segment[0][2] = " ";
                segment[0][3] = " ";
                segment[0][4] = " ";
            }else {
                segment[0][0] = "#";
                segment[0][1] = "#";
                segment[0][2] = "#";
                segment[0][3] = "#";
                segment[0][4] = "#";
            }
        }

        private static boolean validateCharacter(String light) {
            for (int index = 0; index < light.length(); index++) {
                if (!(light.charAt(index) == '0' || light.charAt(index) == '1')) return false;
            }

            return true;
        }


        private static boolean validateLength(String light) {
            return light.length() == 8;
        }


    }



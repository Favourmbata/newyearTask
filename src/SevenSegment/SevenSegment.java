package SevenSegment;

public class SevenSegment {
    public static void display(String numbers){
        String [][] myClass = new String[][]{
                {"#","#","#","#"},
                {"#", " "," ","#"},
                {"#","#","#","#"},
                {"#"," "," ","#"},
                {"#","#","#","#"}};

        for (int row = 0; row < myClass.length; row++) {
            for (int column = 0; column < myClass[row].length; column++) {

                if(numbers.charAt(7)==1){
                    if (numbers.charAt(0)== '0'){
                        myClass[0][1] = " ";
                        myClass [1][2] = " ";
                        if (numbers.charAt(1)== '0'){
                            myClass[1][0] = " ";
                            if (numbers.charAt(2) == '0'){
                                myClass[3][3] = " ";
                                 if (numbers.charAt(3) == 0){
                                    myClass[4][0] = " ";
                                    myClass[4][1] = " ";
                                    myClass [4][2] = " ";
                                    if (numbers.charAt(4) == '0'){
                                        myClass[3][0] = " ";
                                        if (numbers.charAt(5)== '0'){
                                            myClass[1][0]= " ";
                                            if (numbers.charAt(6) == '0'){
                                                myClass[2][0] = " ";
                                                myClass[2][1] = " ";
                                                myClass[2][2] = " ";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.print(myClass[row][column]  +" ");
            }
            System.out.println();
        }



    }


    public static void main(String[] args) {
        display("11111110");
    }

}





package binarysearchAlgorithm;

public class CheeseBoard {
    public static void main(String[] args) {
        int size = 8;
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.print((i + j)% 2 == 0 ? "#" : " ");
            }
            System.out.println();
        }
    }
}

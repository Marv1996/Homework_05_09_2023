public class Main {
    public static void main(String[] args) {

        int[][] array = {{4, 5, 9, 7, 8, 4, 5}, {7, 8, 3, 6, 2, 4, 5}, {3, 1, 8, 7, 4, 4 , 5}, {5, 8, 9, 2, 5, 4, 5}, {3, 5, 4, 9, 7, 4, 5}, {3, 5, 4, 9, 7, 4, 5}, {3, 5, 4, 9, 7, 4, 5}};

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array[i].length - i; j++) {
                if (i <= j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//              2
//            8 7 4
//          8 3 6 2 4
//        4 5 9 7 8 4 5

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - i; j++) {
                if (i <= j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        4 5 9 7 8 4 5
//          8 3 6 2 4
//            8 7 4
//              2

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= j && i + j > 3) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//            8
//          6 2
//        8 7 4
//          2 5
//            7

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - i; j++) {
                if (i >= j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        4
//        7 8
//        3 1 8
//        5 8 9 2
//        3 5 4
//        3 5
//        3
    }
}
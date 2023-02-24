public class multipleloop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <=3; j++)//i is the row and j is the column
//            {
//
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }

        for (int i = 0; i < 5;i++ ) {
            for (int j = 0; j <=i; j++)//i is the row and j is the column
            {


                System.out.print("*");

            }
            System.out.println();
        }
    }}
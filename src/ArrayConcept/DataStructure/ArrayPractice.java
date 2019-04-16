package ArrayConcept.DataStructure;

public class ArrayPractice {

    public static void main(String [] args) {

        int empid [] = {100,200,300};

        int identification [] = new int [2];
        identification [0] = 100;
        identification [1] = 200;

        try {
            identification [2] = 300;
        }

        catch(ArrayIndexOutOfBoundsException e) {
            // e.printStackTrace();
            System.out.println("Exception Caught");

        }
        System.out.println(identification [1]);

        String multiDimentionalArray [] [] = new String [3] [3];

        for(int i=0;i<multiDimentionalArray.length;i++) {

            for(int j=0;j< multiDimentionalArray.length;j++) {

                multiDimentionalArray [0] [0] = "Selenium";

            }
        }
        System.out.println(multiDimentionalArray[0][0]);
    }

}

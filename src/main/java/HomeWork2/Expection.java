package HomeWork2;

public class Expection {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] myArray2 = {
                {"5","5","4","2"},
                {"3","u","4","1"},
                {"5","4","9","7"},
                {"6","6","n","2"}
        };
        arrayExc(myArray2);
        System.out.println("unun");

    }

    public static void arrayExc(String[][] inputArray) throws MyArrayException, MyArrayDataException {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray.length !=4 || inputArray[i].length !=4) {
                throw new MyArrayException();

            }
        }
        int totalSum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
            try {
                totalSum += Integer.parseInt(inputArray[i][j]);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException(i, j);
            }
        }

    }
        System.out.println(totalSum);
}

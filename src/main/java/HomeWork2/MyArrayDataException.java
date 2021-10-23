package HomeWork2;

public class MyArrayDataException extends NumberFormatException {
    public MyArraySizeException (int i, int j) {
        super("Problem in element["+ i+" ]["+ j +"]");

    }
}

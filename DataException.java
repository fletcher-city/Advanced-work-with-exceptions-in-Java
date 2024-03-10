package javaErrorException.HomeWork_003;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Данные введены в неверном формате: %s", i);
        System.out.println();
    }
}

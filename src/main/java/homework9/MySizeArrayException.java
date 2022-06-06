package homework9;

public class MySizeArrayException extends RuntimeException{
    public MySizeArrayException(String message) {
        super("Неверный размер массива.\n" + message);
    }
}

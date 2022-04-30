package twosum.exceptions;

public class NoNumberException extends Exception{
    public NoNumberException(){
        super("No numbers were found that adds to the target number.");
    }
}

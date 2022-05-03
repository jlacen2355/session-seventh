package day24;

public class AgeRestrictionException extends RuntimeException{

    private  String message;

    public AgeRestrictionException(){
        super();
    }

    public AgeRestrictionException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

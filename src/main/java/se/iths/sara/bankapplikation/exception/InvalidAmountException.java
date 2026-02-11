package se.iths.sara.bankapplikation.exception;

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException() {
        super("Beloppet måste vara större än 0.");
    }

    public InvalidAmountException(String message) {
        super(message);
    }
}


package exception_03_throw_exam;

// 잔고 부족 예외
public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException(String message) {
		super(message);
	}

}

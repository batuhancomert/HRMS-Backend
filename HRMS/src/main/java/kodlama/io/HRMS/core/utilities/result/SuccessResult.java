package kodlama.io.HRMS.core.utilities.result;

public class SuccessResult extends Result {

	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String message) {
		super(message,true);
		
	}

}

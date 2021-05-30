package kodlama.io.HRMS.core.utilities.result;

public class Result {

	private String message;
	private boolean success;
	
	public Result(boolean success) {
	
		this.success = success;
	}

	public Result(String message, boolean success) {
		this(success);
		this.message = message;
		
	}

	public boolean isSuccess() {
		return this.success;
	}

	public String getMessage() {
		return message;
	}
}

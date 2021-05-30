package kodlama.io.HRMS.core.utilities.result;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, String message) {
		super(data,message, false);
		
	}
	public ErrorDataResult(T data) {
		super(data,false);
	}
	public ErrorDataResult(String message) {
		super(null,message,false);
	}
	public ErrorDataResult() {
		super(null,false);
	}

}

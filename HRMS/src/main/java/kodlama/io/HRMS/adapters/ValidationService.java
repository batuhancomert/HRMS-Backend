package kodlama.io.HRMS.adapters;

public interface ValidationService<T> {

	boolean checkIfRealPerson(T data);
}

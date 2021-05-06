public class EmailAlreadyExistsException extends Exception{
    Jobseeker jobseeker_error;
    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        jobseeker_error = jobseeker_input;
    }
    public String getMessage() {
        return super.getMessage() + jobseeker_error + "Not Found";
    }
}
import java.util.ArrayList;

public class DatabaseJobseeker {

    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        Jobseeker x = null;
        try{for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()) {
                x = jobseeker;
            }
        }}
        catch (Exception e){
            throw new JobSeekerNotFoundException(id);}
        return x;
    }

    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker js : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail() == js.getEmail()) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;

    }

    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException{
        boolean status = false;
        for (Jobseeker element : JOBSEEKER_DATABASE) {
            if (element.getId() == id) {
                JOBSEEKER_DATABASE.remove(element);
                status = true;
                break;
            }
        }
        if (!status){
            throw new JobSeekerNotFoundException(id);
        }

        return status;
    }

}
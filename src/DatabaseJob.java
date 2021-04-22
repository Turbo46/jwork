import java.util.ArrayList;

public class DatabaseJob
{
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase()
    {
        return JOB_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Job getJobById(int id){
        Job tempVar = null;
        for (Job job: JOB_DATABASE) {
            if (id == job.getId()){
                tempVar = job;
            }
            else{
                tempVar =  null;
            }
        }
        return tempVar;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId)
    {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                temp.add(job);
            } else {
                return null;
            }
        }
        return temp;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category)
    {
        ArrayList<Job> x = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (category == job.getCategory()) {
                x.add(job);
            } else {
                return null;
            }
        }
        return x;
    }

    public static boolean addJob(Job job)
    {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    public static boolean removeJob (int id)
    {
        for (Job job : JOB_DATABASE) {
            if (job.getId() == job.getId()) {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        return false;
    }
}
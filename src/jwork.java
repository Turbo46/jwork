import java.util.GregorianCalendar;

//Class ini digunakan sebagai main function dari program
public abstract class jwork
{
    public static void main (String[] args) //menggunakan define object dari location,recruiter,jon,jobseeker,dan invoice agar bisa berjalan
    {
     Location location1 = new Location("Banten", "Tangerang Selatan", "Tempat Tinggal");
     DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Gilbert", "gilbertsiagian1@gmail.com", "085212511332", location1));
     DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert", "gilbert@ui.ac.id", "Gimi123", 2021, 04, 23));
     DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert", "gilbert@ui.ac.id", "Gimi123", 2021, 04, 24));
     DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Titus", "Titus@ui.ac.id", "Titus123", 2021, 04, 22));

     System.out.println("\n=====================Jobseeker Database====================\n");
     System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
     DatabaseJob.addJob(new Job(1, "Backend Engineer GoJek", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.BackEnd));
     DatabaseJob.addJob(new Job(1, "Data Analyst Grab", DatabaseRecruiter.getRecruiterById(1), 200000, JobCategory.DataAnalyst));
     DatabaseJob.addJob(new Job(1, "Data Scientist Alibaba", DatabaseRecruiter.getRecruiterById(1), 40000, JobCategory.DataScientist));

     System.out.println("\n=====================Job Database By Category====================\n");
     System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));
    }
}
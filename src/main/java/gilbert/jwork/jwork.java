package gilbert.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;

@SpringBootApplication
public class jwork {
        public static void main(String[] args) throws RecruiterNotFoundException, JobSeekerNotFoundException, JobNotFoundException, OngoingInvoiceAlreadyExistsException, EmailAlreadyExistsException {

            Location location1 = new Location("Banten", "Tangerang Selatan", "Rawabuntu");
            Location location2 = new Location("Jakarta", "Jakarta Selatan", "Asrama");

            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Back End Tokopedia", DatabaseRecruiter.getRecruiterById(DatabaseRecruiter.getLastId()), 500000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Front End Shopee", DatabaseRecruiter.getRecruiterById(DatabaseRecruiter.getLastId()), 150000, JobCategory.FrontEnd));

            //DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1, "Gilbert", "gilbertgibu@gmail.com", "Gibu456", 2021, 5, 22));
            //DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1, "Titus", "titus@gmail.com", "Titus123"));

            ArrayList<Job> job1 = new ArrayList<Job>();
            job1.add(DatabaseJob.getJobById(1));
            job1.add(DatabaseJob.getJobById(2));

            //DatabaseInvoice.addInvoice(new EwalletPayment(DatabaseInvoice.getLastId()+1, job1, DatabaseJobseeker.getJobseekerById(1), DatabaseBonus.getBonusByReferralCode("UIDGS2")));
            //DatabaseInvoice.addInvoice(new EwalletPayment(DatabaseInvoice.getLastId()+1, job1, DatabaseJobseeker.getJobseekerById(2), DatabaseBonus.getBonusByReferralCode("UIDGS2")));


            SpringApplication.run(jwork.class, args);
    }
}
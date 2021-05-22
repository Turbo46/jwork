package gilbert.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import static jdk.javadoc.internal.doclets.formats.html.markup.Head.calendar;

@SpringBootApplication
public class jwork {
        public static void main(String[] args) throws RecruiterNotFoundException, JobSeekerNotFoundException, JobNotFoundException, OngoingInvoiceAlreadyExistsException, EmailAlreadyExistsException {

            Location location1 = new Location("Banten", "Tangerang Selatan", "Rawabuntu");
            Location location2 = new Location("Jakarta", "Jakarta Selatan", "Asrama");

            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Back End Tokopedia", DatabaseRecruiter.getRecruiterById(DatabaseRecruiter.getLastId()), 500000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Front End Shopee", DatabaseRecruiter.getRecruiterById(DatabaseRecruiter.getLastId()), 150000, JobCategory.FrontEnd));

            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1, "Gilbert Siagian", "gilbertsiagian@gmail.com", "Gibu123", calendar));
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1, "Gilbert", "gilbertgibu@gmail.com", "Gibu456", 2019, 3, 26));
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId()+1, "Titus", "titus@gmail.com", "Titus123"));
            SpringApplication.run(jwork.class, args);
    }
}
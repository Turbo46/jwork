package gilbert.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class jwork {

    public static void main(String[] args) throws RecruiterNotFoundException {

        Location location1 = new Location("Banten", "Tangerang Selatan", "Rawabuntu");
        Location location2 = new Location("Jakarta", "Jakarta Selatan", "Asrama");
        Location location3 = new Location("Jawa Barat", "Depok", "Kampus UI");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Gilbert Siagian", "gilbertsiagian@gmail.com", "085212511332", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Gibu", "gibu@gmail.com", "085212411422", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Gilbert", "gilbert@gmail.com", "085213321445", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Titus", "titus@gmail.com", "081217321223", location3));

        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Front End Gojek", DatabaseRecruiter.getRecruiterById(DatabaseRecruiter.getLastId()), 241000, JobCategory.FrontEnd));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Back End Tokopedia", DatabaseRecruiter.getRecruiterById(DatabaseRecruiter.getLastId()), 1000, JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "UI Designer Shopee", DatabaseRecruiter.getRecruiterById(DatabaseRecruiter.getLastId()), 1500, JobCategory.UI));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Data Analyst Shopee", DatabaseRecruiter.getRecruiterById(DatabaseRecruiter.getLastId()), 15000, JobCategory.DataAnalyst));

        SpringApplication.run(jwork.class, args);
    }
}
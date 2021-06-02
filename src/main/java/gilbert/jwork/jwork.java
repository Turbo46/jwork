package gilbert.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class jwork {

    public static void main(String[] args) {
        Location location1 = new Location("DKI Jakarta", "Jakarta Selatan", "Asrama");
        Location location2 = new Location("Banten", "Tangerang Selatan", "Rawabuntu");
        Location location3 = new Location("Sulawesi Tengah", "Palu", "Sekolah");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Gilbert", "gilbert@gmail.com", "177013", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Gibu", "gibu@gmail.com", "304321", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Titus", "titus@gmail.com", "765321", location3));
        try {
            DatabaseJob.addJob(new Job(1, "Back End Engineer Tokopedia", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "Front End Engineer Lazada", DatabaseRecruiter.getRecruiterById(2), 30000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(3, "UX Researcher Shopee", DatabaseRecruiter.getRecruiterById(3), 20000, JobCategory.UX));
            DatabaseJob.addJob(new Job(4, "UI Designer Bukalapak", DatabaseRecruiter.getRecruiterById(3), 50000, JobCategory.UI));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }
        SpringApplication.run(jwork.class, args);
    }

}
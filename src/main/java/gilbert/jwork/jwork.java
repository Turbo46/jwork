package gilbert.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
@SpringBootApplication
public class jwork {
        public static void main(String[] args) throws RecruiterNotFoundException, JobSeekerNotFoundException, JobNotFoundException, OngoingInvoiceAlreadyExistsException, EmailAlreadyExistsException {

            Location location1 = new Location("Banten", "Tangerang Selatan", "Rawabuntu");
            Location location2 = new Location("Jakarta", "Jakarta Selatan", "Asrama");
    }
}
import java.util.ArrayList;
import java.util.GregorianCalendar;
//Class ini digunakan sebagai main function dari program
public abstract class jwork {

    public static void main(String[] args) //menggunakan define object dari location,recruiter,jon,jobseeker,dan invoice agar bisa berjalan
    {
        ArrayList<Job> myJob = new ArrayList<Job>();
        ArrayList<Job> myJob1 = new ArrayList<Job>();
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert Siagian",
                    "gilbertsiagian@ui.ac.id", "Gibu16", 2021, 05, 06));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert",
                    "gilbert@ui.ac.id", "Gibu23", 2021, 05, 06));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Titus",
                    "Titus@ui.ac.id", "TitusZarek123", 2021, 05, 06));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gibu",
                    "Gibu@ui.ac.id", "gibs23", 2021, 05, 06));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(101, "IMScudetto", 200000, 500000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(101, "IMScudetto", 200000, 500000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=========Database JobSeeker============");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());

        System.out.println("=========Database Bonus===============");
        System.out.println(DatabaseBonus.getBonusDatabase());
        try {
            DatabaseJobseeker.removeJobseeker(24);
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseRecruiter.removeRecruiter(23);
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJob.getJobById(20);
        } catch (JobNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.getBonusById(21);
        } catch (BonusNotFoundException bonusNotFound) {
            System.out.println(bonusNotFound.getMessage());
        }
        try {
            myJob.add(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 1000, JobCategory.BackEnd));
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            myJob1.add(new Job(2, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(1), 1000, JobCategory.FrontEnd));
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(1, myJob, DatabaseJobseeker.getJobseekerById(1)));
        } catch (JobSeekerNotFoundException e) {
            e.printStackTrace();
        }
        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(2, myJob1, DatabaseJobseeker.getJobseekerById(2)));
        } catch (JobSeekerNotFoundException e) {
            e.printStackTrace();
        }
        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()) {
            new Thread(new FeeCalculator(invoice)).start();
        }
    }
}
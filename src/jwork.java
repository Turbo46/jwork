import java.util.ArrayList;
import java.util.GregorianCalendar;
//Class ini digunakan sebagai main function dari program
public abstract class jwork {

    public static void main(String[] args) //menggunakan define object dari location,recruiter,jon,jobseeker,dan invoice agar bisa berjalan
    {
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
        ArrayList<Job> jobs = new ArrayList<Job>();
        ArrayList<Job> jobs1 = new ArrayList<Job>();

        try {
            jobs.add(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 1000, JobCategory.BackEnd));
        }
        catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            jobs1.add(new Job(2, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(1), 1000, JobCategory.FrontEnd));
        }
        catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(1, jobs, DatabaseJobseeker.getJobseekerById(1)));
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(2, jobs1, DatabaseJobseeker.getJobseekerById(2)));
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n ========== Invoice ==========");
        System.out.println(DatabaseInvoice.getInvoiceDatabase());

        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new FeeCalculator(invoice)).start();
        }
    }
}
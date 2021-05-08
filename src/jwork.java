import javax.xml.crypto.Data;
import java.sql.Ref;
import java.util.*;

public class jwork
{
    public static void main(String [] args){

        Location location1 = new Location("Banten", "Tangerang Selatan", "Serpong");
        Recruiter recruiter1 = new Recruiter(1, "Gilbert", "gibu69@gmail.com", "085212511332", location1);

        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert Parluhutan Siagian", "gibu99@.gmail.com", "Gibu123", new GregorianCalendar(2021, 5, 8)));
        } catch(EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Gilbert Parluhutan Siagian", "gibu90@.gmail.com", "Gibu69", new GregorianCalendar(2021, 5, 8)));
        } catch(EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Titus Zarek", "titus23@.ui.ac.id", "Zareksky23", new GregorianCalendar(2021, 5, 8)));
        } catch(EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Michael Angelo", "michagelo@gmail.com", "Sonic96", new GregorianCalendar(2021, 5, 8)));
        } catch(EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "IMScudetto", 10000, 20000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "Citizen", 5000, 50000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "TheBlues", 1000, 50000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "YellowSubmarine", 5000, 20000, true));
        } catch(ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.addInvoice(new BankPayment(1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(1)));
            DatabaseInvoice.addInvoice(new BankPayment(2, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(2)));
            DatabaseInvoice.addInvoice(new BankPayment(3, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(2)));
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }

        try {
            Recruiter r1 = DatabaseRecruiter.getRecruiterById(99);
        } catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Jobseeker js1 = DatabaseJobseeker.getJobseekerById(99);
        } catch(JobSeekerNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Job j1 = DatabaseJob.getJobById(99);
        } catch(JobNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Bonus b1 = DatabaseBonus.getBonusById(99);
        } catch(BonusNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Invoice i1 = DatabaseInvoice.getInvoiceById(99);
        } catch(InvoiceNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.removeInvoice(99);
        } catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());
        }

        ArrayList<Jobseeker> jobseeker = DatabaseJobseeker.getDatabaseJobseeker();
        for (Jobseeker js : jobseeker)
            System.out.println(js.toString());

        ArrayList<Bonus> bonus = DatabaseBonus.getBonusDatabase();
        for (Bonus b: bonus)
            System.out.println(b.toString());

        ArrayList<Invoice> invoice = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice i: invoice)
            System.out.println(i.toString());

        //Multithreading
        System.out.println("=========Multi Threading=========");
        for (Invoice inv : DatabaseInvoice.getInvoiceDatabase()) {
            new Thread(new FeeCalculator(inv)).start();
        }
    }
}
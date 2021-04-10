import java.util.GregorianCalendar;

//Class ini digunakan sebagai main function dari program
public abstract class jwork
{
    public static void main (String[] args) //menggunakan define object dari location,recruiter,jon,jobseeker,dan invoice agar bisa berjalan
    {
     JobCategory category1 = JobCategory.WebDeveloper;
     JobCategory category2 = JobCategory.FrontEnd;
     JobCategory category3 = JobCategory.BackEnd;
     JobCategory category4 = JobCategory.UI;
     JobCategory category5 = JobCategory.UX;
     JobCategory category6 = JobCategory.Devops;
     JobCategory category7 = JobCategory.DataScientist;
     JobCategory category8 = JobCategory.DataAnalyst;
     InvoiceStatus status1 = InvoiceStatus.OnGoing;
     InvoiceStatus status2 = InvoiceStatus.Finished;
     InvoiceStatus status3 = InvoiceStatus.Cancelled;
     Location location1 = new Location ("Bali", "Singaraja","Buleleng"); //menggunakan parameter sesuai object yang ada pada location
     Recruiter recruiter1 = new Recruiter(1, "Gibu", "gibu@mail.com", "087322170", location1); //menggunakan parameter sesuai object yang ada pada recruiter
     Job job1 = new Job(1, "Gilbert Parluhutan Siagian", recruiter1, 4000000, category1);//menggunakan parameter sesuai object yang ada pada job

    
     Bonus bonus1 = new Bonus (1, "ABCD", 10000, 10000000, true);
     Bonus bonus2 = new Bonus (1, "DEFG", 1000000, 1, true);
     Jobseeker jobseeker1 = new Jobseeker(1, "Gilbert", "..gilbert.siagian@ui.ac.id", "gilbert", new GregorianCalendar(1999, 7, 16));
     Jobseeker jobseeker2 = new Jobseeker(2, "Gilbert", "gilbert.siagian@ui.ac.id", "Gibu090719", 2021, 04, 8);
     Jobseeker jobseeker3 = new Jobseeker(3, "Gilbert", "gilbert.siagian@ui.ac.id", "Gibu090719");
     System.out.println(jobseeker1);
     System.out.println(jobseeker2);
     System.out.println(jobseeker3);
     jobseeker1.setEmail("gilbert.siagian@ui.ac.id");
     jobseeker1.setPassword("Gibu090719"); 
     System.out.println("\n");
     System.out.println(jobseeker1);
     EwalletPayment invoice1 = new EwalletPayment(10, job1, jobseeker1, InvoiceStatus.OnGoing);
     EwalletPayment invoice2 = new EwalletPayment(10, job1, jobseeker2, InvoiceStatus.OnGoing, bonus1);
     EwalletPayment invoice3 = new EwalletPayment(10, job1, jobseeker3, InvoiceStatus.OnGoing, bonus2);
     BankPayment invoice4 = new BankPayment(10, job1, jobseeker1, InvoiceStatus.Finished);
     BankPayment invoice5 = new BankPayment(10, job1, jobseeker1, InvoiceStatus.Finished, 500000);
     invoice1.setTotalFee();
     invoice2.setTotalFee();
     invoice3.setTotalFee();
     invoice4.setTotalFee();
     invoice5.setTotalFee();
     System.out.println(invoice1.toString());
     System.out.println(invoice2.toString());
     System.out.println(invoice3.toString());
     System.out.println(invoice4.toString());
     System.out.println(invoice5.toString());
     
     PaymentType type1 = PaymentType.BankPayment;
     PaymentType type2 = PaymentType.EwalletPayment;
     System.out.println(type1);
     System.out.println(type2);
     System.out.println(status1);
     System.out.println(status2);
     System.out.println(status3);
     System.out.println("\n");
    }
}
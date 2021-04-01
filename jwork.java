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
     Jobseeker jobseeker1 = new Jobseeker(1, "Gilbert Parluhutan Siagian", "gilbertsiagian1@mail.com", "gibu090719", "20 Maret 2021"); //menggunakan parameter sesuai object yang ada pada jobseeker

     System.out.println(recruiter1.getName());
     recruiter1.setName("Titus");
     System.out.println(recruiter1.getName());
     job1.printData(); 
     Bonus bonus1 = new Bonus (1, "ABCD", 10000, 10000000, true);
     Bonus bonus2 = new Bonus (1, "DEFG", 1000000, 1, true);
        
     EwalletPayment payment1 = new EwalletPayment(1, job1, "3 December 2021", jobseeker1, InvoiceStatus.OnGoing);
     EwalletPayment payment2 = new EwalletPayment(2, job1, "3 December 2021", jobseeker1, InvoiceStatus.OnGoing, bonus1);
     EwalletPayment payment3 = new EwalletPayment(3, job1, "3 December 2021", jobseeker1, InvoiceStatus.OnGoing, bonus2);
 

    }
}
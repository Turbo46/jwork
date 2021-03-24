//Class ini digunakan sebagai main function dari program
public abstract class jwork
{
    public static void main (String[] args) //menggunakan define object dari location,recruiter,jon,jobseeker,dan invoice agar bisa berjalan
    {
     Location location1 = new Location ("Bali", "Singaraja","Buleleng"); //menggunakan parameter sesuai object yang ada pada location
     Location location2 = new Location ("Banten","Tangerang Selatan","Rawabuntu");
     Recruiter recruiter1 = new Recruiter(1, "Gibu", "gibu@mail.com", "087322170", location1); //menggunakan parameter sesuai object yang ada pada recruiter
     Recruiter recruiter2 = new Recruiter(2, "Gibs", "gibs@mail.com", "087322123", location2);
     Job job1 = new Job(1, "Gilbert Parluhutan Siagian", recruiter1, 4000000, "worker");//menggunakan parameter sesuai object yang ada pada job
     Job job2 = new Job(2, "Michelle Devina Pasaribu", recruiter2, 5000000, "secretary");
     Jobseeker jobseeker1 = new Jobseeker(1, "Gilbert Parluhutan Siagian", "gilbertsiagian1@gmail.com", "gibu090719", "20 Maret 2021"); //menggunakan parameter sesuai object yang ada pada jobseeker
     Jobseeker jobseeker2 = new Jobseeker(2, "Michelle Devina Pasaribu", "michelledevina@gmail.com", "misey090719", "24 Maret 2021");
     Invoice invoice1 = new Invoice(1, 1, "20 Maret 2021", 4000000, jobseeker1); //menggunakan parameter sesuai object yang ada pada invoice
     Invoice invoice2 = new Invoice(2, 2, "24 Maret 2021", 5000000, jobseeker2);
     
     System.out.println(recruiter2.getName());
     recruiter2.setName("Titus");
     System.out.println(recruiter2.getName());
     job1.printData(); 
    }
}

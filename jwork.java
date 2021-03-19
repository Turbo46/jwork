//Class ini digunakan sebagai main function dari program
public abstract class jwork
{
    public void main (String[] args) //menggunakan define object dari location,recruiter,jon,jobseeker,dan invoice agar bisa berjalan
    {
     Location location1 = new Location ("Banten", "Tangerang Selatan","Rawabuntu"); //menggunakan parameter sesuai object yang ada pada location
     Recruiter recruiter1 = new Recruiter(1, "Gilbert", "gilbert@mail.com", "1234", location1); //menggunakan parameter sesuai object yang ada pada recruiter
     Job job1 = new Job(1, "Siagian", recruiter1, 12345, "worker"); //menggunakan parameter sesuai object yang ada pada job
     Jobseeker jobseeker1 = new Jobseeker(1, "Parluhutan", "gibu@mail.com", "123", "Januari Maret 2021"); //menggunakan parameter sesuai object yang ada pada jobseeker
     Invoice invoice1 = new Invoice(1, 2, "Januari", 2, jobseeker1); //menggunakan parameter sesuai object yang ada pada invoice
    }
}

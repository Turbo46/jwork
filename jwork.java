//Class ini digunakan sebagai main function dari program
public abstract class jwork
{
    public void main (String[] args) //menggunakan define object dari location,recruiter,jon,jobseeker,dan invoice agar bisa berjalan
    {
     Location location1 = new Location ("Bali", "Singaraja","Buleleng"); //menggunakan parameter sesuai object yang ada pada location
     Recruiter recruiter1 = new Recruiter(1, "Titus Zarek Sriyanto", "titus@mail.com", "08732217029", location1); //menggunakan parameter sesuai object yang ada pada recruiter
     Job job1 = new Job(1, "Gilbert Parluhutan Siagian", recruiter1, 4000000, "worker"); //menggunakan parameter sesuai object yang ada pada job
     Jobseeker jobseeker1 = new Jobseeker(1, "Gilbert Parluhutan Siagian", "gilbertsiagian1@gmail.com", "gibu090719", "20 Maret 2021"); //menggunakan parameter sesuai object yang ada pada jobseeker
     Invoice invoice1 = new Invoice(1, 1, "20 Maret 2021", 4000000, jobseeker1); //menggunakan parameter sesuai object yang ada pada invoice
    }
}

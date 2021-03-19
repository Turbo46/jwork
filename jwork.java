public abstract class jwork
{
    public void main (String[] args)
    {
     Location location1 = new Location ("Banten", "Tangerang Selatan","Rawabuntu");
     Recruiter recruiter1 = new Recruiter(1, "Gilbert", "gilbert@mail.com", "1234", location1);
     Job job1 = new Job(1, "Siagian", recruiter1, 12345, "worker");
     Jobseeker jobseeker1 = new Jobseeker(1, "Parluhutan", "gibu@mail.com", "123", "Januari Maret 2021");
     Invoice invoice1 = new Invoice(1, 2, "Januari", 2, jobseeker1);
    }
}

public class Invoice
{
    //Membuat instance variable invoice
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    public Invoice(int id,int idJob,String date,int totalFee,Jobseeker jobseeker)
    { //membuat return dan object yang akan dijalankan sesuai dengan instance yang telah dibuat
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker= jobseeker;
    }
    public int getId() //untuk menedapatkan data id
    {
        return this.id;
    }
    public int getIdJob() //untuk mendapatkan data id job
    {
        return this.idJob;
    }
    
    public String getdate() //untuk mendapatkan data dari date
    {
        return this.date;
    }
    public int getTotalFee() //untuk mendapatkan data total fee
    {
        return this.totalFee;
    }
    public Jobseeker getJobseeker() //untuk mendapatkan data jobseeker
    {
        return this.jobseeker;
    }
    public void setId(int id) //untuk menetapkan isi dari instance id
    {
        this.id = id;
    }
    public void setIdJobs(int idJobs) //untuk menetapkan isi dari id jobs
    {
        this.idJob = idJob;
    }
    public void setDate(String date) //untuk menetapkan tanggal
    {
        this.date = date;
    }
    public void setTotalFee(int totalFee) //untuk menetapkan total fee
    {
        this.totalFee = totalFee;
    }
    public void setJobseeker(Jobseeker jobseeker) //untuk menetapkan data jobseeker
    {
        this.jobseeker = jobseeker;
    }
    public void printData() //menampilkan data yang telah didapatkan
    {
    }
}

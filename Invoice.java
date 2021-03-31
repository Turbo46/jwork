public class Invoice
{
    //Membuat instance variable invoice
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private  InvoiceStatus invoiceStatus;
    public Invoice(int id,int idJob,String date,int totalFee,Jobseeker jobseeker,int totalPrice,  InvoiceStatus invoiceStatus)
    { //membuat return dan object yang akan dijalankan sesuai dengan instance yang telah dibuat
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.invoiceStatus = invoiceStatus;
    }
    public int getId() //untuk menedapatkan data id
    {
        return id;
    }
    public int getIdJob() //untuk mendapatkan data id job
    {
        return idJob;
    }
    
    public String getDate() //untuk mendapatkan data dari date
    {
        return date;
    }
    public int getTotalFee() //untuk mendapatkan data total fee
    {
        return totalFee;
    }
    public Jobseeker getJobseeker() //untuk mendapatkan data jobseeker
    {
        return jobseeker;
    }
    public PaymentType getPaymentType()
    {
        return paymentType;
    }
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
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
    public void setPaymentType(PaymentType paymentType)
    {
        this.paymentType = paymentType;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.invoiceStatus = invoiceStatus;
    }
    public void printData() //menampilkan data yang telah didapatkan
    {
        System.out.println("=========Invoice==========");
        System.out.println("ID: \n" + getId());
        System.out.println("ID JOB: \n" + getIdJob());
        System.out.println("DATE: \n" + getDate());
        System.out.println("STATUS: \n" + getInvoiceStatus());
        System.out.println("TOTAL FEE: \n" + getTotalFee());
        System.out.println("JOB SEEKER: \n"+ getJobseeker());
    }
}

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public abstract class Invoice
{
    // Deklarasi beberapa instance variables yang akan digunakan.
    // Access Modifier variable di set private.
    private int id;
    private Job job;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;
    private PaymentType paymentType;
    
    public Invoice(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.job = job;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
    }
    public int getId(){
        return id;
    }
    public Job getJob(){
        return job;
    }
    public Calendar getDate(){
        return date;
    }
    public int getTotalFee(){
        return totalFee;
    }
    public Jobseeker getJobseeker(){
        return jobseeker;
    }
    public abstract PaymentType getPaymentType();
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    public void setId(int id){
        this.id = id;  //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    public void setJob(Job job){
        this.job = job; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    public void setDate(Calendar date){
        this.date = date; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    public abstract void setTotalFee();
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    public void setPaymentType (PaymentType paymentType){
        this.paymentType = paymentType; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    public void setInvoiceStatus (InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    @Override
    public String toString(){
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = formattedDate.format(getDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName()  + "\nPassword = " + getPassword() + "\nDate = " + date;
}
}
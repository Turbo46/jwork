package gilbert.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class Invoice
{
    private int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
        this.date = Calendar.getInstance();
    }

    public int getId(){
        return id;
    }

    public ArrayList<Job> getJobs(){
        return jobs;
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

    public void setJobs(ArrayList<Job> jobs){
        this.jobs = jobs; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }

    public void setDate(Calendar date){
        this.date = date; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }

    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month -1, dayOfMonth);
    }

    public abstract void setTotalFee();

    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    public void setInvoiceStatus (InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus; //Digunakan lagi keyword 'this', karena nama parameter pada method sama dengan nama pada instance variable class.
    }
    public abstract String toString();
}
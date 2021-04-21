import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class BankPayment extends Invoice
{
    // instance variables
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        //Keyword Super dibawah digunakan untuk memanggil variable yang ada pada Superclassnya.
        super(id, job, jobseeker, invoiceStatus);
    }

    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee){
        //Keyword Super dibawah digunakan untuk memanggil variable yang ada pada Superclassnya.
        super(id, job, jobseeker, invoiceStatus);
        this.setAdminFee(adminFee);
    }
    
    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public int getAdminFee(){
        return adminFee;
    }
    
    public void setAdminFee(int adminFee){
        this.adminFee=adminFee;
    }
    
    @Override
    public void setTotalFee(){
        if(adminFee!=0){
            super.totalFee = getJob().getFee() - getAdminFee();
        }
        
        else{
            super.totalFee = getJob().getFee();
        }
    }
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());

        if (adminFee != 0){
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }else{
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName()+ "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }
    }
}
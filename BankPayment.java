public class BankPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;
    
    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
      super(id, job, date, jobseeker, invoiceStatus);
    }
    public int BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee)
    {
      super(id, job, date, jobseeker, invoiceStatus);
      this.adminFee = adminFee;
    }
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    public int getAdminFee()
    {
        return adminFee;
    }
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }
    @Override
    public void setTotalFee(){
        if(adminFee!=null&&(adminFee.getActive()==true)&&(getJob().getFee() > adminFee.getMinTotalFee())){
            super.totalFee = getJob().getFee() + adminFee.getExtraFee();
        }
        else{
            super.totalFee = getJob().getFee();
        }
    }
    @Override
    public void printData(){
        System.out.println("===================== INVOICE =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + getDate());
        System.out.println("Job Seeker: " + getJobseeker().getName());
        if (adminFee != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()) {
            System.out.println("Referral Code: " + bonus.getReferralCode());
        }
        setTotalFee();
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + PAYMENT_TYPE);
    }
}
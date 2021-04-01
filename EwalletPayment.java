public class EwalletPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;
    public EwalletPayment(int id, Job job, String date, int totalFee, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, totalFee, jobseeker, invoiceStatus);
    }
    
      public EwalletPayment(int id, Job job, String date, int totalFee, Jobseeker jobseeker, InvoiceStatus invoiceStatus, Bonus bonus){
        super(id, job, date, totalFee, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }
    
    @Override
    public PaymentType getPaymentType()
    {
        // put your code here
        return PAYMENT_TYPE;
    }
    
    public Bonus getBonus(){
        return bonus;
    }
    
    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }
    
    @Override
    public void setTotalFee(){
        if (bonus != null && (bonus.getActive() == true) && (totalFee>bonus.getMinTotalFee())){
            super.totalFee = getJob().getFee() + bonus.getExtraFee();
        } 
        else{
            super.totalFee = getJob().getFee();
        }
    }
    
    @Override
    public void printData(){
        if (bonus != null && (bonus.getActive() == true) && (totalFee>bonus.getMinTotalFee())){
            setTotalFee();
            System.out.println(super.totalFee);
            System.out.println(bonus.getReferralCode());
        } 
        
        else{
        
        }
    }
    
}
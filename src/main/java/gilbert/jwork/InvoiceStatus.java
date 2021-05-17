package gilbert.jwork;
public enum InvoiceStatus
{
    OnGoing("On Going"),
    Finished("Finished:"),
    Cancelled("Cancelled");
    
    private final String status;
    private InvoiceStatus(String status){
     this.status = status;   
    }
    
    @Override
    public String toString(){
      return status;   
    }
}
public class Job
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int fee;
    private String category;
    private Recruiter recruiter;
    public Job(int id,String name,Recruiter recruiter, int fee, String category)
    {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    public int getId()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    public int getFee()
    {
        return this.fee;
    }
    public String getCategory()
    {
        return this.category;
    }
    public Recruiter getRecruiter()
    {
        return this.recruiter;
    }
    public void setId(int id)
    {
         this.id = id;      
    }
    public void setName(String name)
    {
         this.name = name;  
    }
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter;
    }
    public void setFee(int fee)
    {
         this.fee = fee;  
    }
    
    public void setCategory(String category)
    {
        this.category = category;
    }
    public void printData()
    {
        System.out.println(getName());
    }
}
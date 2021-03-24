public class Job
{
    //Membuat variable instance dari job
    private int id;
    private String name;
    private int fee;
    private String category;
    private Recruiter recruiter;
    public Job(int id,String name,Recruiter recruiter, int fee, String category)
    { //melakukan define object serta return object untuk masing-masing function
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    public int getId() //getter id
    {
        return id;
    }
    
    public String getName() //getter name
    {
        return name;
    }
    public int getFee() //getter fee
    {
        return fee;
    }
    public String getCategory() //getter category
    {
        return category;
    }
    public Recruiter getRecruiter() //getter recruiter
    {
        return recruiter;
    }
    public void setId(int id) //setter id
    {
         this.id = id;      
    }
    public void setName(String name) //setter name
    {
         this.name = name;  
    }
    public void setRecruiter(Recruiter recruiter) //setter recruiter
    {
        this.recruiter = recruiter;
    }
    public void setFee(int fee) //setter fee
    {
         this.fee = fee;  
    }
    public void setCategory(String category) //setter category
    {
        this.category = category;
    }
    public void printData() //untuk melakukan print/memunculkan hasil dari data yang didapat
    {
        System.out.println("ID: \n"+ getId());
        System.out.println("NAME: \n" + getName());
        System.out.println("RECRUITER: \n" + getRecruiter());
        System.out.println("FEE: \n" + getFee());
        System.out.println("RECRUITER: \n" + getCategory());
    }
}
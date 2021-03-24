public class Jobseeker
{
    //membuat instance variable untuk class jobseeker
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;
    
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    { //melakukan define object serta return object untuk masing-masing function
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

      public int getId() //getter id
    {
        return id;
    }
    public String getName() //getter name
    {
        return name;
    }
    public String getEmail() //getter email
    {
        return email;
    }
    public String getPassword() //getter password
    {
        return password;
    }
     public String getJoinDate() //getter join date
    {
        return joinDate;
    }
    public void setId(int id) //setter id
    {
        this.id = id;
    }
    public void setName(String name) //setter name
    {
        this.name = name;
    }
    public void setEmail(String email) //setter email
    {
        this.email = email;
    }
    public void setPassword(String password) //setter password
    {
        this.password = password;
    }
    public void setJoinDate(String joinDate) //setter join date
    {
        this.joinDate = joinDate;
    }
    public void printData() //melakukan print untuk data yang didapatkan
    {
        System.out.println("NAME: \n" + getId());
        System.out.println("ID: \n" + getName());
        System.out.println("EMAIL: \n" + getEmail());
        System.out.println("PASSWORD: \n" + getPassword());
        System.out.println("JOIN DATE: \n" + getJoinDate());
    }
}
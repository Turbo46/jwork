package gilbert.jwork;
public class Recruiter
{
    //membuat instance variable untuk class recruiter
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    public Recruiter(int id, String name,String email, String phoneNumber,Location location)
    { //melakukan define object serta return object untuk masing-masing function
        this.id = id;
        this.name = name;
        this.phoneNumber = email;
        this.location = location;
    }
    public int getId() //melakukan define function untuk getter sebuah id
    {
        return id;
    }
        public String getName() //define function getter name
    {
        return name;
    }
    public String getEmail() //define function getter email
    {
        return email;
    }
     public String getPhoneNumber() //define function getter phone number
    {
        return phoneNumber;
    }
    public Location getLocation() //gtter location
    {
        return location;
    }
    public void setid(int id) //setter id
    {
        this.id = id;
    }
    public void setEmail(String Email) //setter email
    {
        this.email = email;
    }
    public void setName(String Name) //setter name
    {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) //setter phone number
    {
        this.phoneNumber = phoneNumber;
    }
    public void setLocation(Location location) //setter location
    {
        this.location = location;
    }
    public String toString(){
              return "ID= "+id+"\nNama= "+name+"\nEmail= "+email+"\nPhoneNum= "+phoneNumber+"\nLocation= "+location+"\n";
    }
}
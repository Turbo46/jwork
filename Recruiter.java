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
        this.name = "Titus";
    }
    public void setPhoneNumber(String phoneNumber) //setter phone number
    {
        this.phoneNumber = phoneNumber;
    }
    public void setLocation(Location location) //setter location
    {
        this.location = location;
    }
    public void printData() //melakukan print data yang didapatkan
    {//return untuk melakukan print
        System.out.println("NAME: \n" + getId());
        System.out.println("ID: \n" + getName());
        System.out.println("EMAIL: \n" + getEmail());
        System.out.println("PHONE NUM: \n" + getPhoneNumber());
        System.out.println("LOCATION: \n" + getLocation());
    }
}
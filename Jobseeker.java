import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.*;

public class Jobseeker
{
    //membuat instance variable untuk class jobseeker
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id; 
        this.name = name; 
        this.email = email;
        this.password = password; 
        this.joinDate = joinDate; 
    }
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.password = password; 
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.password = password; 
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
     public Calendar getJoinDate() //getter join date
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
    public void setEmail(String email, String Regex){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        matcher.matches();
        if (matcher.matches() == false)
            email = null;
        else
            this.email = email;
    }
    public void setPassword(String password){
        String regexP = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(.{6}$";
        Pattern pattern = Pattern.compile(regexP);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches() == false)
            email = null;
        else
            this.password = password;
    }
    public void setJoinDate(Calendar joinDate) //setter join date
    {
        this.joinDate = joinDate;
    }
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
     this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
      public String toString(){
              return "ID= "+id+"\nNama= "+name+"\nEmail= "+email+"\nPassword= "+password+"\nJoin Date= "+joinDate+"\n";
    }
}
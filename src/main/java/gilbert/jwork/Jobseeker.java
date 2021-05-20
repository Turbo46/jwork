package gilbert.jwork;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
     public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
     public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
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
    public void setEmail(String email){
        String regex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches())
        {
            this.email = email;
        }
        else
        {
                this.email = "";
        }
    }
     public void setPassword(String password)
    {
        String regexP = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regexP);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            this.password = password;
        else
            this.password = "";
    }
    public void setJoinDate(Calendar joinDate) //setter join date
    {
        this.joinDate = joinDate;
    }
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
         this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

      @Override
    public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = " + getPassword();
        } 
        else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = " + getPassword() + "\nJoin Date = " + date;
        }
    }
}
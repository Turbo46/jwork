public class Location
{
    //Membuat instance variable location
    private String province;
    private String city;
    private String description;    
    public Location(String province,String city,String description)
    { //membuat return dan object yang akan dijalankan sesuai dengan instance yang telah dibuat
        this.province = province;
        this.city = city;
        this.description = description;
    }
    public String getProvince() //getter province
    {
        return province;
    }
    public String getCity() //getter city
    {
        return city;
    }
    public String getDescription() //getter description
    {
        return description;
    }
    public void setProvince(String province) //setter province
    {
        this.province = province;
    }
    public void setCity(String city) //setter city
    {
        this.city = city;
    }
    public void setDescription(String description) //setter description
    {
        this.description = description;
    }
    public String toString(){
              return "Province= "+province+"\nCity= "+city+"\nDescription= "+description+"\n";
    }
}
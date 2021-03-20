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
        return this.province;
    }
    public String getCity() //getter city
    {
        return this.city;
    }
    public String getDescription() //getter description
    {
        return this.description;
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
    public void printData() //untuk memunculkan hasil dari data yang didapat
    {
        System.out.println(getProvince());
        System.out.println(getCity());
        System.out.println(getDescription());
    }
}
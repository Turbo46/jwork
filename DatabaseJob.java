public class DatabaseJob
{
    // melakukan define instance class database job
    private static String[] listJob;
    public DatabaseJob() //membuat function database job
    {
    }
    public static boolean addJob(Job job) //untuk melakukan function boolean dari add job
    {
        return false; //return false untuk mengembalikan functionnya jika dalam keadaan parameter boolean
    }
    
    public static boolean removeJob(Job job) //function boolean remove job
    {
        return false;
    }
    
    public static Job getJob() //getter dengan parameter untuk memanggil object class Job
    {
        return null; //return null karena masih belum terpakai
    }
    
    public static String [] getListJob () //melakukan sert instance String [] pada getlistjob
    {
        return listJob; //return list job
    }
}
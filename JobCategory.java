public enum JobCategory
{
    WebDeveloper("Web Developer"),
    FrontEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst");
    
    private final String jobString;
    
    JobCategory(String jobString)
    {
        this.jobString = jobString;
    }
    
    @Override
    public String toString()
    {
        return jobString;
    }
    
}


package designbattern;


public class memberFactory
{
    public Staff getstaff (String staffName)
    {
        String s = staffName.toLowerCase();
        switch(s)
        {
            case"TeachingAssistant":
                return new TeachingAssistant();
            case "Doctor":
                return new Doctor();
                default:
                 return null;
        
        }
    }
}

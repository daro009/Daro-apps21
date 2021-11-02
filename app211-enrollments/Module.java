
/**
 * This Class Module represents the code, title and credit value
 * of a given module.
 *
 * @author Daro Shawqi
 * @version 2/11/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code ;
    private String title;
    private int credit;
    
    

    /**
     * Module constructor assigns the code and title for a module
     * It also initialises the credit value to 0
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code =code;
        this.title = title;
        this.credit = 0;
    }

    /**
     
     * This method returns the code for the module 
     
     * @return code represents the module code  
     */
    public String getCode()
    {
        // put your code here
       return code;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getCredit()
    {
        return credit;
    }
    
    public void setCredit(int credit)
    {
        this.credit =credit;
    }
    
    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
       
        
        System.out.println(" Module Code: " + code + ": " + code + ": "
        + title + "Credit " + credit);
        
        System.out.println();
    }
    
   
}

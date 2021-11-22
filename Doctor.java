
package designbattern;


public  class Doctor implements Staff 
{
   private double yearsofwork;
   private double sallary;
    
  public void setsallary(double x)
          
  {
    sallary = x;
  }
  
  public double getsallary()
  {
      return sallary;
  }
  
   public void setyearsofwork(double y)
          
  {
    yearsofwork = y;
  }
  
  public double getyearsofword()
  {
      return yearsofwork;
  }
  
}

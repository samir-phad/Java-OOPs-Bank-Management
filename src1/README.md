BANK MANAGEMENT SYSTEM PROJECT: - 
Base on only OOP's Concept 
- use Array to store Account details.
- Apply all operation to perticular Account using Account Number.
  (as like ATM, enter pin and access Account)

package com.braindata.bankmanagement.model; 
public class Account {  
    private int accNo;  
    private String name;  
    private String mobNo;  
    private String adharNo;  
    private String gender;  
    private int age;  
    private double balance;  
    //setter/getter 
}


package com.braindata.bankmanagement.service; 
public interface Rbi {  
    public void createAccount();  

    public void displayAllDetails();  

    public void depositeMoney(); 

    public void withdrawal();  

    public void balanceCheck(); 

}


package com.braindata.bankmanagement.serviceImpl; 
public class Sbi  implements Rbi {  
    //implements all methods here  
    public void createAccount()  {   
        System.out.println("createAccount");  
    }  
    
    public void displayAllDetails()  {

    }  
    
    public void depositeMoney()  {  

    }  
    
    public void withdrawal()  {  

    }  
    
    public void balanceCheck()  {  

    } 
    
}


package com.braindata.bankmanagement.client; 

public class Test{  
    public static void main(String[] args)  {   
        
        Rbi bank=new Sbi();   
        
        //Display proper msg for calling methods.   
        
        //As per user choice perform bank operation using switch case   
        
        switch(...)   {    
            //only call Sbi methods here   
        } 

    }

}
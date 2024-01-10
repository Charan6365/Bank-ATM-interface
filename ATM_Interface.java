import java.util.*;
public class ATM_Interface{
    static int balance=10000000;
    static int newbalance=balance;
    public static void showBalance (int balance){
                System.out.println("Available Balance: "+newbalance);
                System.out.println();
                
            }
            
            public static int withdraw(int balance, int withdrawAmt){
               
                System.out.println("The withdrawing amount is:"+withdrawAmt);
                if(balance>= withdrawAmt){
                    balance=newbalance-withdrawAmt;
                    System.out.println("Kindly collect your cash and remove the card");
                     newbalance=balance;
                    showBalance(balance);
                    
                }
                else{
                    System.out.println("Sorry! The balance is insufficient!");
                    System.out.println();
                }
                    return balance;
            }
            public static int deposit(int balance, int depositAmt){
                System.out.println("the depositing amount is:"+depositAmt);
                
               balance=newbalance+depositAmt;
                System.out.println("The amount is successfully deposited");
                 newbalance=balance;
                showBalance(balance);
               
                return balance;
            }
            
    public static void main(String[] args)
    {
             
            int withdraw,deposit, ATMPin=321;
            Scanner sc= new Scanner(System.in);
            int pin_count=0;
            do{
            while(true){
                
                System.out.println("Hello and Welcome to ATM!");
                System.out.println("Choose 1 to Withdraw");
                System.out.println("Choose 2 to Deposit");
                System.out.println("Choose 3 to Check your Balance amount");
                System.out.println("Choose 4 to EXIT");
                System.out.println("Choose an option to perform the respective operation");
                int ch= sc.nextInt();
                switch (ch) {
                    case 1:
                    System.out.println("Enter ATM Pin:");
                    int pin=sc.nextInt();
                    if(ATMPin==pin){
                         System.out.println("Enter the amount to be withdrawn:");
                        withdraw=sc.nextInt();
                        withdraw(balance,withdraw);
                       
                    }
                    else
                    System.out.println("Incorrect ATM Pin entered!");
                    //  pin_count++;
                        break;
                    case 2: 
                    System.out.println("Enter ATM Pin:");
                    pin=sc.nextInt();
                    if(ATMPin==pin){
                    System.out.println("Enter the amount to be deposited:");
                        deposit=sc.nextInt();
                        deposit(balance,deposit);
                      
                    }
                    else
                    System.out.println("Incorrect ATM Pin entered!");
                      //pin_count++;
                        break;
                    case 3:
                    System.out.println("Enter ATM Pin:");
                     pin=sc.nextInt();
                     if(ATMPin==pin)
                     {
                    showBalance(balance);
                    System.out.println(" ");
                   
                     }
                     else
                    System.out.println("Incorrect ATM Pin entered!");
                    // pin_count++;
                    break;
                    case 4: 
                    System.exit(0);
                    
                    }
                }
            }while(pin_count<3);
          
        }            
    }
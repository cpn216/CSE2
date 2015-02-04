//
//Cuong Nguyen
//
//Arithmetic Homework Assignment
//
//Assignment is to practice manipulating data stored in variables

//Calculate
//a. Total cost of each kind of item; sales tax for that total cost
//b. Total cost of purchases (before tax)
//c. Total actually paid for this transaction, including sales tax.

//define class
    public class Arithmetic{
    
//add main method
    public static void main(String[] args) {
        
//input variables
//Number of socks
    int nSocks=3;
//Cost per pair of socks
//('$' is part of the variable name)
    double sockCost$=2.58;

//Number of drinking glasses
    int nGlasses=6;
//Cost per glass
    double glassCost$=2.29;
//Number of boxes of envelopes
    int nEnvelopes=1;
//cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
    
//declaring variable before use
    double totalSockCost$;  //total cost of socks
    double totalGlassCost$; //total cost of glasses
    double totalEnvelopeCost$;  //total cost of envelopes
    
    double taxSockCost$;   //Sales tax of Socks
    double taxGlassCost$;   //Sales tax of Glass
    double taxEnvelopeCost$;    //Sales tax of Envelopes
    
    double totalAllBeforeTax$;  //Total of all items before tax
    double totalTax$;           //Total of tax for all items
    double totalAfterTax$;      //Total of all items and including tax
    
//Print out Item being bought
//Print out how many of the given item is being bought
//Print out the cost per item

        System.out.println("Socks being bought");
        System.out.println("Quantity of socks : "+(nSocks)+"");
        System.out.println("Cost per sock : $"+(sockCost$)+"");
        
        System.out.println("");
        
        System.out.println("Glasses being bought");
        System.out.println("Quantity of glasses : "+(nGlasses)+"");
        System.out.println("Cost per glass : $"+(glassCost$)+"");
        
        System.out.println("");
        
        System.out.println("Envelopes being bought");
        System.out.println("Quantity of envelopes : "+(nEnvelopes)+"");
        System.out.println("Cost of per envelope : $"+(envelopeCost$)+"");
        
        System.out.println("");
        

//Compute and display total cost of purchases (before tax)
//Conversion of number to integer (in order to get 2 decimal points to the right of #)
//Compute and display total sales tax

    totalSockCost$=sockCost$*nSocks;
    totalGlassCost$=glassCost$*nGlasses;
    totalEnvelopeCost$=envelopeCost$*nEnvelopes;
    
    taxSockCost$=totalSockCost$*taxPercent;
    taxGlassCost$=totalGlassCost$*taxPercent;
    taxEnvelopeCost$=totalEnvelopeCost$*taxPercent;
    
//Reason for (int)(taxItem$*100)/100.00); to get two decimal places 
    
    System.out.println("Total cost of Socks (w/o tax) : $"+(totalSockCost$)+"");
        System.out.println("Tax of Socks : $"+(int)(taxSockCost$*100)/100.00);
            System.out.println("");
            
    System.out.println("Total cost of glasses (w/o tax) : $"+(totalGlassCost$)+"");
        System.out.println("Tax of glasses : $"+(int)(taxGlassCost$*100)/100.00);
            System.out.println("");
            
    System.out.println("Total cost of envelopes (w/o tax) : $"+(totalEnvelopeCost$)+"");
        System.out.println("Tax of envelopes : $"+(int)(taxEnvelopeCost$*100)/100.00);
            System.out.println("");
            
//Compute and display total cost of purchases (including sales tax)

    totalAllBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
    totalTax$=taxSockCost$+taxEnvelopeCost$+taxGlassCost$;
    totalAfterTax$=totalAllBeforeTax$+totalTax$;
    
    System.out.println("Total of all items (w/o) tax : $"+(int)(totalAllBeforeTax$*100)/100.00);
    System.out.println("Total tax of all items : $"+(int)(totalTax$*100)/100.00);
    System.out.println("Total of All Including Tax : $"+(int)(totalAfterTax$*100)/100.00);

    
    
    }

}
public class simple_interest {
    public static double simple_interest_func(double principal,double rate,int years) {
        if(years==0){
            return principal;
        } 
        else{
            return simple_interest_func(principal,rate,years-1)+(principal*rate);
        }
    }

    public static void main(String[] args) {
        double principal=10000;  
        double rate=0.05;        
        int years=5;

        double amount=simple_interest_func(principal, rate,years);
        System.out.printf("Amount (Simple Interest) after %d years: %.2f",years,amount);
    }
}

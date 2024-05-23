public class Deposit {
    long principal;
    int time;
    double rate;
    double totalAmt;
    Deposit(){
        principal = 1000;
        time = 2;
        rate = 10;
    }   
    Deposit(long principal, int time, double rate){
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }
    Deposit(long principal, int time){
        this.principal = principal;
        this.time = time;
        rate = 10;
    }
    Deposit(long principal,double rate){
        this.principal = principal;
        this.rate = rate;
        time = 2;
    }
    void calcAmt(){
        totalAmt = (principal*rate*time)/100.0;
    }
    void display(){
        System.out.print(principal+"\t");
        System.out.print(rate+"\t");
        System.out.print(time+"\t");
        System.out.print(totalAmt+"\t");
        System.out.println();
    
    }
    public static void main(String[] args) {
        Deposit ob1 = new Deposit();
        Deposit ob2 = new Deposit(1001,2, 11);
        Deposit ob3 = new Deposit(1200,1);
        Deposit ob4 = new Deposit(1300,10.1);
System.out.println("Principal \t Rate \t Time\t Total Amount");
        ob1.calcAmt();
        ob1.display();
        ob2.calcAmt();
        ob2.display();
        ob3.calcAmt();
        ob3.display();
        ob4.calcAmt();
        ob4.display();
    }
}

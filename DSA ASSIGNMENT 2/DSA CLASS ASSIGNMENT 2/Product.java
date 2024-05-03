import java.util.Scanner;

public class Product {
    long prodId;
    double price;
    int quantity;
    static double totalPrice;
    Product(long prodId, double price,int quantity){
           this.prodId = prodId;
           this.price = price;
           this.quantity = quantity;
           totalPrice+=price*quantity;
    }
    void display(){
        System.out.print(prodId+"\t");
        System.out.print(price+"\t");
        System.out.print(quantity+"\t");
        System.out.println();
    }
    public static void main(String[] args) {
        Product[] ar = new Product[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            ar[i]= new Product(sc.nextLong(),sc.nextDouble(),sc.nextInt());           
        }
        for(int i=0;i<5;i++){
            ar[i].display();
        }
        sc.close();       
    }
}

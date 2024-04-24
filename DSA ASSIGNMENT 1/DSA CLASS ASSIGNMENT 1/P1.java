/* Question-1:
Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
Sample Run:
The positive integer greater than 2 from command line argument 
is 67.
The number of times one must repeatedly divide this number by 2 
before getting a value less than 2 is 5.*/ 
class P1{
    public static void main(String[] args) {
            int num = Integer.parseInt(args[0]);//input from command line
            System.out.println("The positive integer greater than 2 from command line argument is "+num+" .");
            int count = 0;
            while(num<2){
                num=num/2;
                count++;
            }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count+".");
    }
}
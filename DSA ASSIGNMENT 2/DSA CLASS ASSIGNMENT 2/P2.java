/*Define a class called Complex with instance variables real, imag and instance methods
 void setData(),
 void display(),
 public Complex add(Complex, Complex)
Write the main method in a separate class to implement the addition of two complex
number with the given method signature as above.*/
class Complex{
    int real;
    int imag;
    void setData(int r , int i){
        real = r;
        imag = i;
    }
    void display(){
          System.out.println(real);
          System.out.println(imag);
    }
    public Complex add(Complex a,Complex b){
          Complex temp = new Complex();
          temp.real = a.real+b.real;
          temp.imag = a.imag+b.imag;
          return temp;
    }
 }
 class P2 {
   public static void main(String[] args) {
       Complex ob1 = new Complex();
       ob1.setData(10, 15);
       Complex ob2 = new Complex();
       ob2.setData(10,15);
       Complex ob3 = ob1.add(ob1,ob2);
       ob3.display();
   }    
}

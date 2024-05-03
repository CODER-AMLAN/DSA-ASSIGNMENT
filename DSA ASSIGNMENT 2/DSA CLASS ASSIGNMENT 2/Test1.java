abstract class  Marks{
     int markICP;
     int markDSA;
     double percentage;
     abstract void getPercentage();
     Marks(int markICP,int markDSA){
        this.markICP = markICP;
        this.markDSA = markDSA;
     }
}
class CSE extends Marks{
    int algodesign;
    CSE(int markICP,int markDSA,int algodesign){
        super(markICP, markDSA);
        this.algodesign = algodesign;
    }
    void getPercentage(){
        percentage = (markDSA+markICP+algodesign)/300.0*100;
        System.out.println(percentage);
    }
}
class NonCSE extends Marks{
    int enggMechanics;
    NonCSE(int markICP,int markDSA,int enggMechanics){
        super(markICP, markDSA);
        this.enggMechanics = enggMechanics;
    }
    void getPercentage(){
        percentage = (markDSA+markICP+enggMechanics)/300.0*100;
        System.out.println(percentage);
    }
}
public class Test1 {
    public static void main(String[] args) {
        Marks ob = new CSE(80, 100, 90);
        ob.getPercentage();
        ob = new NonCSE(100, 100, 100);
        ob.getPercentage();
    }
}

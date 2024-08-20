//import stuff here?

//Your code here
public class Program5 {
    public static void main(String [] args){
        System.out.println("Mushroom Cap Prix Racer Average Miles/Per Gallon: ");
        
        int Royale1 = 286;
        int Royale2 = 9;
        double realRoyale1 = Royale1;
        double realRoyale2 = Royale2;
        double avg1 = (realRoyale1/realRoyale2) * 100;
        avg1 = (int) (avg1+5)/10;
        avg1 = (double) (avg1/10);
        System.out.print("Royale averaged "+ avg1);
        System.out.println(" m/g");
        
        int KoopaKing1 = 412;
        int KoopaKing2 = 40;
        double realKoopaKing1 = KoopaKing1;
        double realKoopaKing2 = KoopaKing2;
        double avg2 = realKoopaKing1/realKoopaKing2;
        System.out.print("Koopa King averaged "+avg2);
        System.out.println(" m/g");
        
        int PipeFrame1 = 361;
        int PipeFrame2 = 18;
        double realPipeFrame1 = PipeFrame1;
        double realPipeFrame2 = PipeFrame2;
        double avg3 = (realPipeFrame1/realPipeFrame2) * 100;
        avg3 = (int) (avg3+5)/10;
        avg3 = (double) (avg3/10);
        System.out.println("Pipe Frame averaged "+ avg3);
        
        int Badwagon1 = 161;
        int Badwagon2 = 11;
        double realBadwagon1 = Badwagon1;
        double realBadwagon2 = Badwagon2;
        double avg4 = (realBadwagon1/realBadwagon2) * 100;
        avg4 = (int) (avg4+5)/10;
        avg4 = (double) (avg4/10);
        System.out.print("Badwagon averaged "+ avg4);
        System.out.println(" m/g");
    }
}

//Paste console output below:
/*
Mushroom Cap Prix Racer Average Miles/Per Gallon: 
Royale averaged 31.8 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1
Badwagon averaged 14.6 m/g
*/

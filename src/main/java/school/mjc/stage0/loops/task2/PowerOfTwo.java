package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count=0;
        int P=1;
        while(count!=power){
         P=P*(int)(Math.pow(2,count));
          System.out.println(P);
            count++;
        }
    }
}

package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
         int s=0;
         int i=0;
        while(multiplyByAndToInclusive!=i){
            System.out.println(s);
            s=s+multiplyByAndToInclusive;
            if(multiplyByAndToInclusive>0)
                i++;
            else
                i--;
         }
    } 
}

package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
         int s=0,i=0;
        while(multilyByAndToInclusive!=i){
            System.out.println(s);
            s+=multilyByAndToInclusive;
            if(multilyByAndToInclusive>0)
                i++;
            else
                i--;
         }
    } 
}

package school.mjc.stage0.loops.task2;

public class Multiplication {
    int s=1;
    public void printMultiplied(int multiplyByAndToInclusive) {
        while(multilyByAndToInclusive!=0){
            s=s*multilyByAndToInclusive;
            multilyByAndToInclusive--;
         }
        System.out.println(s);
}

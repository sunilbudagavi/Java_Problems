public class Average {
    public static void main(String[] args) {
        int[] Scores = {89,90,45,76,23,56,87,52,91,23,60,11};
        int total = 0;
        for(int i=0;i<Scores.length;i++){
            total += Scores[i];
        }
        double AverageScore = total / Scores.length;
        System.out.println(AverageScore);
        // System.out.println(boolean total %Scores.length);

    }
}

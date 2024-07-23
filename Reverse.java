public class Reverse {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Sunil";
        names[1] = "Anil";
        names[2] = "kevin";
        names[3] = "luthik";
        names[4] = "prateek";
        // names[5] = "Sunil";
        for(int i=names.length-1;i>0;i--){
            System.out.print(names[i]+", ");
        }
        System.out.println();
        

    }
    
}

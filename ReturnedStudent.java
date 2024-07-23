public class ReturnedStudent {
    public static void main(String[] args) {
        String[] Names = {"Alic","Justin","The Weeknd","tentaxion","Mashmellow"};
        String[] Returned = {"The Weeknd","Alic","tentaxion","Mashmellow"};

        // call to missing stundet
        String MissingStudent = MissingBackpack (Names,Returned);

        if (MissingStudent != null){
            System.out.println(MissingStudent + " Ane Athanu Bag Marichipoyadu");
        }
        else{
            System.out.println("Evvaru BagPack Marichi Poledhu");
        }
    }

    public static String MissingBackpack(String[] Names,String[] Returned) {
        for(String student:Names){
            boolean T=false;
            for (String ret : Returned) {
                if (student.equals(ret)){
                    T =true;
                    break;
                }
            }
            if(!T){
                return student;
            }
        }
        return null;
        }
    }
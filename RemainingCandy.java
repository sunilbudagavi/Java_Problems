public class RemainingCandy {
    public static void main(String[] args) {
        String[] Candy = {"Gummy Bears","Hershey Chocolate Bars","Kit Kats","M&M's","Reese's Peanut Butter Cups","Skittles","Snickers", "Sour Patch Kids"};
        String[] Missing_Candy = {"Gummy Bears","Hershey Chocolate Bars","Kit Kats","M&M's","Reese's Peanut Butter Cups","Snickers", "Sour Patch Kids"};

        String SerachCandy  = MissingCandyinMyBag(Candy,Missing_Candy);

        if(SerachCandy!=null){
            System.out.println(SerachCandy + " ikkade undhi Candy Evaru thisukupoledhu");
        }
        else{
            System.out.println("Dhorakadam ledhu");
        }    
    }
    public static String MissingCandyinMyBag(String[]Candy, String[] Missing_Candy){
        for(String Candeies:Candy){
            boolean T = false;
            for(String Remain:Missing_Candy){
                if(Candeies.equals(Remain)){
                T =true;
                break;
            }
        }
        if(!T){
            return Candeies;
        }
    }
    return null;
}
}

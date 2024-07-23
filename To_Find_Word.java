public class To_Find_Word {
    public static void main(String[] args) {
        String[] Vegetables = {"Mirchi","Tomato","Lady finger","Onioin","Bringel","cabbage","Capsicum"};

        String To_find = "jmk";

        boolean T = false;

        for(int i=0;i<Vegetables.length-1;i++){
            if(Vegetables[i].equals(To_find)){
                T = true;
                break;
            }
        }

    if(T){
        System.out.println("Its a part of the vegetable in given list");
    }
    else {
        System.out.println("Its a not part of the vegetable list" );
    }
}
}

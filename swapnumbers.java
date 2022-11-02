public class swapnumbers {
    public static void main(String args[]){
        float first=12.4f;float second=33.5f;
        System.out.println("Before swap:");
        System.out.println("first"+first);
        System.out.println("second"+second);
       float temporary= first;
        first=  second;
        second =  temporary;
       System.out.println("after swap:");
       System.out.println("first"+first);
       System.out.println("second"+second);

    }
}

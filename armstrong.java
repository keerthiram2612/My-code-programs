public class armstrong {
    public static void main(String args[]){
        int number= 153,originalnumber,remainder,result=0;
        originalnumber=number;
        while(originalnumber!=0){
            remainder=originalnumber%10;
            result+=Math.pow(remainder,3);
            originalnumber/=10;

        }
        if(result==number)
            System.out.println(number+" is an armstrong number.");
        else
        System.out.println(number+"is not an armstrong number");
        
    }

    }

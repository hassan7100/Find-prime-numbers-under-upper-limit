import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the Upper limit:");
        Scanner s=new Scanner(System.in);
        int upper=s.nextInt();
        float x=0,y=0,count=0;
        for(x=2;x<upper;x++){
            for(y=2;y<(x/2)+2;y++){
                if(x%y==0)
                    break;
            }
            if(y==Math.round((x/2.0)+1.0)|y==Math.round((x/2.0)+2.0)) {
                if(count<10){
                    System.out.print((int)x + "\t");
                    count++;
            }
                else{
                    count=0;
                    System.out.print("\n"+(int)x+"\t");

                }
            }
        }
    }
}
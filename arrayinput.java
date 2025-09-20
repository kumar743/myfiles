import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        // fot taking the size of array
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the value of n  : ");
        int n = sc.nextInt();
        int marks[]=new int[n];
        // for input
        System.out.print(" enter the marks for n : ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();

        }
        // for searching a number in array
        System.out.print(" enter the value you want to search : ");
        int x=sc.nextInt();
        //for output
        for( int i=0;i<n;i++){
            System.out.print(marks[i] +" ");
            if (marks[i]==x) {
                System.out.println("x found at index : " +i);
                
            }
        }
        sc.close();
    }
    
}

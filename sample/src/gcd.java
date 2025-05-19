public class gcd {
    public static void main(String[] args){
        int n1=12;
        int n2=24;
        int gr=0;
        int gcd=0;
        if(n1<n2){
            gr=n1;
        }
        else{
            gr=n2;
        }
        for(int i=1; i<=gr; i++){
            if(n1 % i == 0 && n2 % i ==0){
               gcd=i;
            }
        }
        System.out.println(gcd);
    }
}

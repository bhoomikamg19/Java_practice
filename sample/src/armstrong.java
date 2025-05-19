public class armstrong {
    public static void main(String[] args) {
        int digit=371;
        int temp=digit;
        int fig=temp;
        int count=0;
        while(digit>0){
            int num= digit % 10;
            count++;
            digit = digit / 10;

        }
        int sum=0;
        while(temp>0){
            int mod= temp%10;
            sum += Math.pow(mod,count);
            temp = temp/10;
        }
        if(fig == sum){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}

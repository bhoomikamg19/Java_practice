public class palindrome {
    public static void main(String[] args){
        int num=1221;
        int org=num;
        System.out.println(num);
        int sum=0;
        while(num>0){
            int temp= num %10;
            sum = (sum * 10) + temp;
            num = num / 10;
        }
        System.out.println(sum);
        if(org == sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}

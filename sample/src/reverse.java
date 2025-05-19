public class reverse {
    public static void main(String[] args){
        int num=123;
        System.out.println(num);
        int sum=0;
        while(num > 0){
             int temp= num % 10;
             sum = (sum * 10) + temp;
             num=num/10;
        }
        System.out.println(sum);
    }
}

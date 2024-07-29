public class Main {

    public static void primeFactors(int num) {
        
        int i=2;
        if(num<=1)
            return num;
        while(num%i !=0){
            i++;
        }
        System.out.println(i+" ");
        primeFactors(num/i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Prime factors of " + number+" ");
        primeFactors(number);
    }
}
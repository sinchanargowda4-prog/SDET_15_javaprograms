class palindrome {
    public static void main(String[] args) {
        int num= 456;
        int org_num = num;
        int rev =0;
        while(num!=0){
            rev = rev*10 + num % 10;
            num=num/10;
        }
        System.out.println(rev);
        if(org_num == rev){
        System.out.println("palindrom");
        }
        else
        {
        System.out.println("not a palindrome");
        }
    }
}
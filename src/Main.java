//public class Main {
//    static void main(String[] args)

void main() {
    //Task 1
System.out.println("Task 1 : Result : " + makeBricks(3, 1, 8));
    //Task 2
    System.out.println("Task 2 : Result : " + noTeenSum(2, 1, 14));
    //Task 3
    System.out.println("Task 3 : Result : " + blackJack(19, 22));
    //Task 4
    System.out.println("Task 4 : Result : " + loneSum(1, 2, 3));

}

//Task 1 Method
 public static boolean makeBricks (int small, int big, int goal) {
     if (goal > (small) + (big * 5)) return false;
     if (goal % 5 == small) return false;
     return true;
 }

//Task 2 Method
public static int noTeenSum(int a, int b, int c) {

    return fixTeen(a) + fixTeen(b) + fixTeen(c);}
    public static int  fixTeen ( int n){
        if (n >= 13 && n <= 19) {
            if (n == 15 || n == 16) return n;
            return 0;
        }
        return n;
    }
    // Task 3 Method
    public static int blackJack ( int a, int b) {
    if ( a > 21 && b > 21) return 0;
    if ( a < 21 || b < 21) {
        if (a > 21) return a;
        if (b > 21) return b;
    }
   return Math.max( a , b);

    }
    // Task 4 Method :
public static int loneSum ( int a, int b, int c) {
     int sum = a + b + c;
    if ( a == b && a == c) return 0;
    if ( a == b || a == c) return sum+=a;
    return sum;
}

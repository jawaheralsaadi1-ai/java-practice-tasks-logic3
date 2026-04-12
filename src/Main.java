//public class Main {
//    static void main(String[] args)

void main() {
    //Task 1

System.out.println("Task 1 : Result : " + makeBricks(3, 1, 8));
    //Task 2

    //Task 3

    //Task 4

}

//Task 1 Method
 public static boolean makeBricks (int small, int big, int goal) {
     if (goal > (small) + (big * 5)) return false;
     if (goal % 5 == small) return false;
     return true;
 }


//Task 17 method
//public static boolean isEverywhere(int[] nums, int val) {



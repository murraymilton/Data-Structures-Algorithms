import java.util.Scanner;

public class Main {
//    public void log(int [] numbers, String[] names){
//        // O(n) Our run time would increase linear
//        for (int number : numbers) // 0(n)
//            System.out.println(number);
//
//
//        for(String name : names) // 0(m)
//            System.out.println(names);
//
//
//    }

    // Simple program for changing a song repeat option
    public static void main(String[] args){
        boolean isOnRepeat = true;
        Scanner input = new Scanner(System.in);
        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Would you like to take current song off repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}

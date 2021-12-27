public class Main {
    public void log(int [] numbers, String[] names){
        // O(n) Our run time would increase linear
        for (int number : numbers) // 0(n)
            System.out.println(number);


        for(String name : names) // 0(m)
            System.out.println(names);
    }
}

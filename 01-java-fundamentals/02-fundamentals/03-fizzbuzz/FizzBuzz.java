public class FizzBuzz {
    public String fizzBuzz(int number) {
        if(number %15 == 0) {
            return "FizzBuzz";  // // FizzBuzz if the number is divisible by 3 and 5 (Output for 15:)
        } 
        if(number %3 == 0) {
            return "Fizz";  // Fizz if the number is divisible by 3 (Output for 3:)
        } 
        if(number%5 == 0) {
            return "Buzz";  // Buzz if the number is divisible by 5 (Output for 5:)
        } 
        return String.valueOf(number);  // the number itself for all other cases (Output for 2:)
       }
}
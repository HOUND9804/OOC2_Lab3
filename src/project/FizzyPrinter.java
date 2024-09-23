package project;

public class FizzyPrinter {
    public boolean isUpperCase;

    public FizzyPrinter(boolean isUpperCase) {
        this.isUpperCase=isUpperCase;
    }

    public String printFizzy(int n) {
        if(n%3==0&&n%5!=0&&n%7!=0){
            if(isUpperCase){
                return "FIZZ";
            }
            return "Fizz";
        }
        else if(n%5==0&&n%3!=0&&n%7!=0){
            if(isUpperCase){
                return "BUZZ";
            }
            return "Buzz";
        }
        else if(n%7==0&&n%3!=0&&n%5!=0){
            if(isUpperCase){
                return "BANG";
            }
            return "Bang";
        }
        else if(n%3==0&&n%5==0&&n%7!=0){
            if(isUpperCase){
                return "FIZZBUZZ";
            }
            return "Fizzbuzz";
        }
        else if(n%3==0&&n%5==0&&n%7==0){
            if(isUpperCase){
                return "FIZZBUZBANG";
            }
            return "Fizzbuzzbang";
        }
        else{
            if(isUpperCase){
                return "BOOM";
            }
            return "Boom";
        }
    }
}

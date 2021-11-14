public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(22, 53));
    }


    public static boolean hasSharedDigit(int number, int anotherNumber) {

        if (number >= 10 && number <= 99 && anotherNumber >= 10 &&
                anotherNumber <= 99) {
            int numberSecondNumber = number % 10;
            int numberFirstNumber = number / 10;
            int anotherNumberSec = anotherNumber % 10;
            int anotherNumberFirst = anotherNumber / 10;
            if (numberFirstNumber == anotherNumberFirst ||
                    numberSecondNumber == anotherNumberSec ||
                    numberFirstNumber == anotherNumberSec ||
                    numberSecondNumber == anotherNumberFirst)
                return true;
        }
        return false;
    }
}
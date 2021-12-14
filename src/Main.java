public class Main {

    static boolean isPalindrom(int number) {
        int reverseNumber = 0, lastNumber, temp;
        temp = number;
        while (temp != 0) {

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
        if (number == reverseNumber) {
            System.out.println(number + " Polindrom sayıdır");
            return true;
        } else
            System.out.println(number + " Polindrom sayı değildir");
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(1221));

    }


}

// Design a class named MyInteger.
class MyInteger {

    // An int data field named value that stores the int value represented by this object.
    private int value = 0;
  
    // A constructor that creates a MyInteger object for the specified int value.
    public MyInteger(int value) { // Alternative: value2
        this.value = value; // Alternative: value = value2;
    }
  
    // A non-static getter method that returns the int value.
    public int getValue() {
        return value;
    }
  
    // The non-static methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.
    public boolean isEven() {
        return value % 2 == 0;
    }
  
    public boolean isOdd() {
        return value % 2 != 0;
    }
  
    public boolean isPrime() {
        // Find prime numbers, ignore 1 or less. Enter loop to search for values greater then 1, if divisable, its not prime.
        if (value <= 1) return false; 
        for (int i = 2; i < value; i++) { 
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
  
    // The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
    public static boolean isEven(int v) {
        return v % 2 == 0;
    }

    public static boolean isOdd(int v) {
        return v % 2 != 0;
    }
  
    public static boolean isPrime(int v) {
        if (v <= 1) return false; 
        for (int i = 2; i < v; i++) { 
            if (v % i == 0) {
                return false;
            }
        }
        return true;
    }
  
    // The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }
  
    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }
  
    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }
  
    // The non-static methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.
    public boolean equals(int v) {
        return this.value == v;
    }
  
    public boolean equals(MyInteger v) {
        return this.value == v.getValue();
    }
  
    // A static method parseInt(char[]) that converts an array of numeric characters to an int value.

    // Explantion of method
    // c - '0': Converts the character c ('3') to its numeric equivalent (3). 
    // The subtraction works because in ASCII, the character '0' has a value of 48, so subtracting '0' from any digit character gives the corresponding integer value.
    // result * 10: Multiplies the current result by 10 to shift the digits left, making room for the new digit.
    // + (c - '0'): Adds the numeric value of the current character to result.

    public static int parseInt(char[] array) {
        int result = 0;
        for (char c : array) {
            result = result * 10 + (c- '0');
        }
        return result;
    }
  
    // A static method parseInt(String) that converts a string into an int value.
    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}

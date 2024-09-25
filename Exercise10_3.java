public class Exercise10_3 {
    public static void main(String[] args) {
        
    // Create the MyInteger object class. 
    // Write a client program that tests all methods in the class.
    // This step creates an object called myInt using the MyInteger Class
    MyInteger myInt = new MyInteger(13);
    
    // Display: Value (object.method)
    System.out.println("Value: " + myInt.getValue());

    // Display: non-static methods isEven(), isOdd(), and isPrime()
    // object.method
    System.out.println("Is Value Even? " + myInt.isEven());
    System.out.println("Is Value Odd? " + myInt.isOdd());
    System.out.println("Is Value Prime? " + myInt.isPrime());

    // Display: static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively. - 25
    // class.method(input)
    System.out.println("Is 25 Even? " + MyInteger.isEven(25));
    System.out.println("Is 25 Odd? " + MyInteger.isOdd(25));
    System.out.println("Is 25 Prime? " + MyInteger.isPrime(25));

    // Display: static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
    // class.method(object)
    System.out.println("Is myInt Even? " + MyInteger.isEven(myInt));
    System.out.println("Is myInt Odd? " + MyInteger.isOdd(myInt));
    System.out.println("Is myInt Prime? " + MyInteger.isPrime(myInt));

    // Display: non-static methods equals(int) and equals(MyInteger)
    System.out.println("myInt equals 17? " + myInt.equals(17));
    System.out.println("myInt equals new MyInteger(17)? " + myInt.equals(new MyInteger(17)));

    // Display: A static method parseInt(char[]) that converts an array of numeric characters to an int value.
    char[] charArray = {'1', '2', '3'};
    System.out.println("parseInt(char[] array): " + MyInteger.parseInt(charArray));

    // Display: A static method parseInt(String) that converts a string into an int value.
    String convertStrToIntmp = "456";
    System.out.println("parseInt(String): " + MyInteger.parseInt(convertStrToIntmp));
    }
}

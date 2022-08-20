package solidprinciple;

/**
 * The principle states that the larger interfaces split into smaller ones.
 * Because the implementation classes use only the methods that are required.
 * We should not force the client to use the methods that they do not want to use.
 */

public class InterfaceSegregation {
 public static void main(String... args) {
 }
}

/**
 * The below interface violates the Interface segregation principle
 */

interface Conversion {
 public void intToDouble();

 public void intToChar();

 public void charToString();
}

/**
 * In the below example i have implemented this principle
 */

interface ConvertIntToDouble {
 public void intToDouble();
}

interface ConvertIntToChar {
 public void intToChar();
}

interface ConvertCharToString {
 public void charToString();
}

class DataTypeConversion implements ConvertIntToDouble, ConvertCharToString {
 public void intToDouble() {
  //conversion logic
 }

 public void charToString() {
  //conversion logic
 }
}



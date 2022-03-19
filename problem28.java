import java.util.Scanner;
class problem28 {
  public static void main(String[] args) {
   int result;
    Scanner kb = new Scanner(System.in);
    int number1 = kb.nextInt();
    char operator = kb.next().charAt(0);
    int number2 = kb.nextInt();
    switch (operator) {
      case '+':
        result = number1 + number2;
        System.out.println(result);
        break;
      case '-':
        result = number1 - number2;
        System.out.println(result);
        break;
      case '*':
      result = number1 * number2;
      System.out.println(result);
      break;
    case '/':
      result = number1 / number2;
      System.out.println(result);
      break;
    case '%':
      result = number1 % number2;
      System.out.println(result);
      break;
    default:
      System.out.println("Invalid operator!");
      break;
  }
  kb.close();
}
}
//3. Реализовать простой калькулятор

import java.util.Scanner;
public class task_3 {

    public static void main(String[] args) {

        System.out.println("Простой калькулятор действий с парой цифр,");
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите первое число ");
        float a = reader.nextFloat();                                           // float  если введет не целое число
        System.out.println("Введите знак операции +, -, *, / ");
        char operand = reader.next().charAt(0);
        System.out.println("Введите второе  число ");
        float b = reader.nextFloat();
        reader.close();
        float result;

        switch(operand) {
            case '+': result = a + b;
               break;
            case '-': result = a - b;
               break;
            case '*': result = a * b;
               break;
            case '/': result = a / b;
               break;
            default:  System.out.printf("Некоректный оператор");
               return;
         }
            
        System.out.printf(a + " " + operand + " " + b + " = " + result);       


        















      
        // if ("+" == operand){
        //     int sum = a+b;
        //     System.out.println(operand);
        //     System.out.println(a+"+"+b+"="+sum);
        //  }
        //  else if (operand == "-"){
        //      int difference = a-b;
        //      System.out.println(operand);
        //      System.out.println(a+"-"+b+"="+difference);}
        //  else if (operand == "*"){
        //      int multip = a*b;
        //      System.out.println(operand);
        //      System.out.println(a+"*"+b+"="+multip);}
        // else if (operand == "/"){
        //      int delen= a/b;
        //      System.out.println(operand);
        //      System.out.println(a+"/"+b+"="+delen);}    

    
            
                
                }
                

        
}

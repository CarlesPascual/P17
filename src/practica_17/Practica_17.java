/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practica_17 {

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.000");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int option = -1;

        keyboard.useDelimiter("\n");
        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println("How many euros??");
                    int numberE = keyboard.nextInt();
                    float result = conversor1(numberE);

                    System.out.println("Result= " + result);

                    break;

                case 2:

                    System.out.println("How many euros??");
                    int numberE2 = keyboard.nextInt();
                    double result2 = conversor2(numberE2);

                    System.out.println("Result= " + result2);

                    break;

                case 3:

                    System.out.println("How many euros??");
                    int numberE3 = keyboard.nextInt();
                    String dolar = conversor3(numberE3);
                    System.out.println("Result= " + dolar);

                    break;

                case 4:

                    System.out.println("How many euros??");
                    String numberE4 = keyboard.next();
                    int dolarS = Conversor4(numberE4);
                    System.out.println("Result= " + dolarS);

                    break;

                case 5:

                    System.out.println("How many euros??");
                    float numberE5 = keyboard.nextFloat();
                    int dolarF = conversor5(numberE5);
                    System.out.println("Result= " + dolarF);

                    break;
                case 6:

                    System.out.println("How many euros??");
                    String numberE6 = keyboard.next();
                    Float dolarString = conversor6(numberE6);
                    System.out.println("Result= " + dolarString);

                    break;

                case 7:

                    System.out.println("letter pls?");
                    char letter = (keyboard.next()).charAt(0);
                    letters(letter);

                    break;
                case 8:

                    System.out.println("A name pls");
                    String name = keyboard.next();
                    String resulte = namechar(name);
                    System.out.println("Result = " + resulte);

                    break;
                case 9:

                    int numberChar;
                    do {
                        System.out.print("Give a number pls into 0 and 255: ");
                        numberChar = keyboard.nextInt();
                    } while (numberChar > 255 || numberChar < 0);

                    String numconv = charint(numberChar);
                    System.out.println(numconv);

                    break;

                case 10:
                  
                    System.out.println("asci table");
                    lastone();

                    break;
                case 0:
                    p0();
                    break;
                default:
                    System.out.println("Option not avaible");
            }//end of switch
            //System.out.print("press any kay to continue: ");
            //key = keyboard.next();
        } while (option != 0);

    }

    private static void userMenu() {

        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
        System.out.println("Option 4");
        System.out.println("Option 5");
        System.out.println("Option 6");
        System.out.println("Option 7");
        System.out.println("Option 8");
        System.out.println("Option 9");
        System.out.println("Option 10");
        System.out.println("Option0- EXIT");
        System.out.print("\nSelect an option ");

    }

    //variable+salida  //valores entrada
    private static float conversor1(int euro) {

        float result;
        result = Float.valueOf(euro) / 0.91f;// cast
        return result;
    }

    private static double conversor2(int euro) {

        double result2;
        result2 = (double) euro / 0.91;// cast
        return result2;
    }

    private static String conversor3(int euro) {

        DecimalFormat df = new DecimalFormat("0.000");
        String dolar;
        int dolart;

        dolart = (int) (euro / 0.91);

        dolar = String.valueOf(dolart);
        return dolar;

    }

    private static int Conversor4(String euro) {

        int dolarS;
        int euroInt;

        euroInt = Integer.parseInt(euro);

        dolarS = (int) (euroInt / 0.91);

        return dolarS;
    }

    private static int conversor5(float euro) {

        int dolarF;
        dolarF = (int) (euro / 0.91f);// cast
        return dolarF;

    }

    private static float conversor6(String euro) {

        float dolarString = 0;

        dolarString = (float) (Float.parseFloat(euro) / 0.91);

        return dolarString;
    }

    private static void letters(char let) {

        System.out.println((int) let);
        String binstr = Integer.toBinaryString(let);
        System.out.println(binstr);

    }

    private static String namechar(String name) {

        String result = "";
        char ch = ' ';

        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            result += Integer.toBinaryString(ch) + " ";
        }

        return result;
    }

    private static String charint(int numberintchar) {

        String aChar = new Character((char) numberintchar).toString();

        return aChar;

    }
    
    private static void lastone(){

        System.out.println("que es");
        for (int i = 0 ; i<255; i++){
            System.out.println(i +"\t"+Integer.toString(i,16)+"=" + (char)i);
            
        }

}

    private static void p0() {

        System.out.println("EXIT");
    }

    /*  


   
        
        double preu = 100;double tax= 21;

        double res = matematic(preu, tax);//LLamar funcion
        methodAitor(preu, tax, res);//Llamar al procedimiento methodAitor
        
        System.out.println("return = "+ res);
    }
    //funciones
    private static double  matematic (double price, double iva ){

    double dev;
        
    dev = (price + (price*iva/100));
    
    return dev;
    }
    
    private static final String green="\033[32m";
    private static final String cyan="\033[36m";
    private static final String yellow="\033[33m";
    
    public static void methodAitor(double price, double iva, double dev){
        
    System.out.println(green+"Precio: "+ price + cyan+ " \tIVA: "+iva+yellow+"\tPVP: "+dev);*/
}

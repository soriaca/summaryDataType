/**
 * class name: Variables.java
 * author: Carla Soriano
 * date:May 26, 2022
 * version:1.0
 * description: This program will display summary of primitive data types.
 * source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * direction: 1) read the source material
 *            2) summary of primitive data types: byte, short, int, long, float,
 *            double, boolean, char (2 lines per each type)
 *
 */
public class Variables
{
    public static void main(String[] args)
    {
        
        System.out.println("byte: The byte type is an 8-bit signed two's complement integer.");
        System.out.println("Can be useful in saving memory in large arrays, where the memory savings actually matters.");
        System.out.println("short: data type is 16-bit signed two's compliment integer.");
        System.out.println("It has a minimum value of -32,768 and a maximum value of 32,767(inclusive)");
        System.out.println("int: int data type is a 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^31-1.");
        System.out.println("Use the Integer class to use int data type as an unsigned integer.");
        System.out.println("long: data type is a 64-bit two's complement integer");
        System.out.println("Use this data type when you need a range of values wider thank those provided by int");
        System.out.println("float: single precision 32-bit IEEE 754 floating point");
        System.out.println("Use float instead of double if you need to save memory in large arrays of floating point numbers.");
        System.out.println("double: for decimal values, generallly the default choice.");
        System.out.println("Should never be used for precise values, such as currency.");
        System.out.println("boolean: only two possible values: true and false");
        System.out.println("For simple flags that track true/false conditions, size not precisely defined");
        System.out.println("char: is a single 16-bit Unicode character");
        System.out.println("minimum value of '\u0000'(or 0) and maximum of '\uffff'(or 65,535 inclusive).");
        
    }

}

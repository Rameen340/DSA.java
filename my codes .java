Rameen soomro (2k24/CSE/118)

Data structures and algorithms 
Assignment:
Q:01 write a program to reverse an array using stack data structures 

import java utill.stack;
public class Main {
public static void reverseArray(int[] array){
stack<Integer>stack= newStack<>();
for (int value : array){
stack.push(value);
}
for(int i=0;i <array.length; i++){
array[i]= stack.pop();
}
   }
Public static void printArray(int[] array){
for(int value :array){
System.out.println( value + “   “);
}
System.out.println( );
Public static void main (String[] args ){
Int[] original array = { 10,20,30,40,50};
System.out.println( “original Array”);
printArray (original Array);
reverse Array( original Array);
System.out.println(“reversed Array”);
printArray (original array);
}
       }

Output:
Original Array
10,20,30,40,50
Reversed Array
50,40,30,20,10

Q:02 write a program to match the parentheses stored in a string using stack data structure

Import java .utill.stack;
Public class Main{
Public static boolean  are parentheses balanced ( String expr){
Stack<character>stack= new stack<>();
for (char:ch expr to char Array( ) ){
if(ch= ‘(‘ ch= ‘{‘  || ch = ‘[‘ ){
Stack.push(ch);
}
Else if (ch = ‘)’ ||ch = ‘}’ || ch = ‘]’) {
if ( stack.isEmpty( ) ){
return false ;
}
Char top = stack.pop( );
If(! Is matching pair ( top,ch) ){ 
return false ;
}
}
}
 Return stack.isEmpty( );
Private static boolean is Matching pair ( char open,char close)
Return ( open= ‘(‘ && close = ‘)’  ) ||
                ( open= ‘{‘ && close = ‘}’)  ||
                ( open = ‘[‘ && close = ‘]’ ) ;
Public static void main ( String [] args ) {
String input = {[( )]};   // Example input 
If (are parentheses balanced ( input)  ) {
System.out.println(   “the parentheses are balanced “);
}else{
System.out.println (“ the parentheses are not balanced :”);
}
    }
       }
Output 
The parentheses are balanced 

Q: 03 write a program to calculate the sum of all integer elements in an integer array by implimenting a recursive sum method/ function 

public class Main {
public static int recursiveSum ( int []arr ,int index ){
if ( index = arr .length) {
return 0;
}
return arr [index + recursive sum (are,index +1);
}
Public static void main (String []args ){
int numbers ={ 5,10,15,20,25};
int sum = recursive sum ( numbers,0);
System.out.println(“sum of array elements :”+ sum);
}
 }
Output
Sum of array elements: 75





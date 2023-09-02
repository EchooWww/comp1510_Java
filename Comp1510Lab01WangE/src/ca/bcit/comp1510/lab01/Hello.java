package ca.bcit.comp1510.lab01;

/** Prints a Hello World message    .
 * @author echo
 * @version 2022
 */
public class Hello {

    /**
    * Prints the greeting.
    *
    * @param args
    *       unused
    */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/**
 * a.Error: Could not find or load main class ca.bcit.comp1510.lab01.Hello in module Comp1510Lab01WangY
 * b.No error message because there's no Java syntax error. The program cannot detect what we meant to do as long as the syntax is correct.
 *   The printed message was changed to "Helo World"
 * c.Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 *       String literal is not properly closed by a double-quote
 * d.Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
         Syntax error on token(s), misplaced construct(s)
         Syntax error on token "!", ; expected
         String literal is not properly closed by a double-quote
 * e.Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
         Syntax error, insert ";" to complete BlockStatements
 */
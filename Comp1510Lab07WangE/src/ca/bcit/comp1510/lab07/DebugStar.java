package ca.bcit.comp1510.lab07;

/**
 * DebugStar: a program to test debugging.
 * @author echo
 * @version 1.0
 */
public class DebugStar {
        
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int a = 6;
        final int b = 7;
        run("+", a, b);
        run("-", a, b);
        run(a);
    }
    
    private static Operation getOperation(final String key) {
        final Operation operation;
        if (key.equals("+")) {
            operation = new Add();
        } else {
            operation = new Subtract();
        }
        return (operation);
    }
    
    private static void run(final String key, final int a, final int b) {
        final Operation operation;
        final int result;
        operation = getOperation(key);
        result = operation.perform(a, b);
        System.out.println("result = " + result);
    }
    
    private static void run(final int n) {
        final Factorial factorial;
        final int result;
        factorial = new Factorial();
        result = factorial.perform(n);
        System.out.println("result = " + result);
    }
}

interface Operation {
    int perform(int a, int b);
}
    
class Add implements Operation {
    public int perform(final int a, final int b) {
        return (a + b);
    }
}

class Subtract implements Operation {
    public int perform(final int a, final int b) {
        return (a - b);
    }
}

class Factorial {
    int perform(final int n) {
        int ret;
        ret = 1;
        for (int i = 1; i < n; i++) {
            ret *= i;
        }
        return (ret);
    }
}

package TP2;

public class entier {
	static int val=0;
    public static int facto(int n){
        int a=1;
        for (int i=1; i<=n;i++){
            a = a * i;
        }
        return a;
    }
    
    public static int absolu(int n){
        if (n>=0){
        	return n;
        }
        else {
        	return -n;
        }
    }
    
    public static void comparer(int a, int b) {
        if (a>b){
            System.out.println(a + " est superieur  a" + b);
        } 
        else if (a<b) {
            System.out.println(a + " est inferieur a " + b);
        } 
        else {
            System.out.println(a + " est egal a " + b);
        }
    }
    
    public static void premier(int n) {
        boolean test = true;
        if (n<=1) {
            test = false;
        } 
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    test = false;
                }
            }
        }
        if(test) {
        	System.out.println(n + "est un nombre premier");
        }
        else {
        	System.out.println(n + "est un nombre non premier");
        }
    }
}


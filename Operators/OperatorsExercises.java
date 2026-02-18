package Operators;
public class OperatorsExercises {
    public static void main(String[] args) {

        //Aritmeticas
        int a = 5;
        int b = 6;
        int suma = a+b;
        int resta = a-b;
        int product = a*b;
        int division = a/b;
        int mod = a%b;

        //Asignacion
        suma += 6;
        resta -= 6;
        product *= 6;
        division /= 6;
        mod %= 6;

        //Comparacion
        boolean igualdad = a==b;
        boolean diferencia = a!=b;
        boolean mayor = a>b;
        boolean mayorigual= a>=b;
        boolean menor = a<b;
        boolean menorigual = a<=b;

        // Logicos
        boolean falso = igualdad && menor; 
        boolean verdad = menorigual && diferencia;
        boolean nose = (menorigual && diferencia)|| menorigual;

        int var1 = 56;
        var1++;
        System.err.println(var1);
        System.out.println(var1--);
        System.out.println(var1);

        
    }
    
}

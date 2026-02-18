package Operators;
public class Operators {
    public static void main(String[] args) {
        // Operadores

        // Aritmeticos

        var a = 5;
        var b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Asignacion

        a = b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        a += 1;
        System.out.println(a);

        // Comparacion (Relacionales)

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a < b);

        // Logicos

        System.out.println(true && false);

        System.out.println(false || true);

        System.out.println(!true);

        System.out.println(!(3>2)||5==2);

        // Unarios
        System.out.println(-b);
        System.out.println(+b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);

        b++;
        System.out.println(b);
        
    }



    
}

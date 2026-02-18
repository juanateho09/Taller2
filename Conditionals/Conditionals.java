package Conditionals;
public class Conditionals {
    public static void main(String[] args) {

        // Condicionales

        int age = 18;   // Validar condiciones
        if (age > 18) {
            System.out.println("Es mayor de edad");
        } else if (age == 18 ){
            System.out.println("Acaba de cumplir 18");
        } else {
            System.out.println("Es menor de edad");
        }

        // Switch
        var day = 5;
        switch (day) {    // Inspeccionar casos
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No es lunes, martes o miercoles");

        }


    }
}

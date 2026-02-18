package Conditionals;

public class ConditionalsExercises {
    public static void main(String[] args) {
        int age = 18;
        if (age>=18){
            System.out.println("Puede votar");
        }else{
            System.out.println("No puede votar");
        }
        int num1 = 10;
        int num2 = 1;
        if (num1>num2){
            System.out.println(num1+" es mayor que "+num2);
        }else if(num2>num1){
            System.out.println(num2+" es mayor que "+num1);     
        }else{
            System.out.println("Son iguales");
        } 
        if (num1>0){
            System.out.println("El numero es positivo");
        }else if(num1<0){
            System.out.println("El numero es negativo"
            );     
        }else{
            System.out.println("El numero es 0");
        }
        if (num1%2 == 0) {
            System.out.println("El numero es par");           
        }else{
            System.out.println("El numero es impar");
        }
        if (num1>0 && num1<101) {
            System.out.println("El numero esta entre 1 y 100");
        }
        int dia = 8;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
                System.out.println("Esta fuera del rango");
                break;
        }
        char var1 = 'A';
        if (Character.toUpperCase(var1) == var1){
            System.out.println("Es mayuscula");
        }else{
            System.out.println("Es minuscula");
        }

    }

    
}

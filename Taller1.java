public class Taller1 {

//Problema 1
    public static void main(String[] args) {
        // Pruebas de los ejemplos:
        System.out.println(isValidUsername2("3Carlos_"));  
        System.out.println(isValidUsername2("jhapontem_2"));

        System.out.println(checkPassword2("abc#1234"));
        System.err.println(checkPassword2("abc1234"));

        int[] perfects = listPerfectNumbers2(500);
        System.out.print("Perfects up to 500: [ ");
        for (int i = 0; i < perfects.length; i++) {
            System.out.print(perfects[i] + (i < perfects.length - 1 ? ", " : " "));
        }
        System.out.println("]");

    }
    public static boolean isValidUsername2(String username) {
    // 1. Validación básica de nulidad
    if (username == null) return false;

    // 2. Condición de Longitud: Mayor que 5 y menor que 13
    // (Es decir, de 6 a 12 caracteres)
    int len = username.length();
    if (len <= 5 || len >= 13) return false;

    // 3. Condición de Inicio: El primer carácter debe ser una letra
    char first = username.charAt(0);
    if (!((first >= 'a' && first <= 'z') || (first >= 'A' && first <= 'Z'))) {
        return false;
    }

    // 4. Condición de Contenido: Recorremos todo para ver caracteres válidos
    for (int i = 0; i < len; i++) {
        char c = username.charAt(i);
        // Si NO es letra, NI número, NI guion bajo, retornamos falso inmediatamente
        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || 
              (c >= '0' && c <= '9') || (c == '_'))) {
            return false;
        }
    }

    // Si pasó todas las pruebas anteriores, es válido
    return true;
}

    // Condicion 3
    public static boolean beginning(String username) {
    

        char first = username.charAt(0);
    return (first >= 'a' && first <= 'z') || (first >= 'A' && first <= 'Z');
}


// Problema 2
    
    public static boolean checkPassword2(String password){

        if (password == null || password.isEmpty()) {
        return false;
    }
        return length2(password) && spaces(password) && mix(password);
    }
    // Condicion 1
    public static boolean length2(String password){
        if (password.length()<8){return false;}
        else{return true;}
    }
    // Condicion 2
    public static boolean spaces(String password){
        if (password.contains(" ")){return false;}
        else{return true;}
    }
    // Condicion 3
    public static boolean mix(String password){

    boolean hasUpper = false;
    boolean hasLower = false;
    boolean hasDigit = false;
    boolean hasSymbol = false;

    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);

        if (Character.isUpperCase(c)) {
            hasUpper = true;
        } else if (Character.isLowerCase(c)) {
            hasLower = true;
        } else if (Character.isDigit(c)) {
            hasDigit = true;
        } else {
            hasSymbol = true;
        }
    }
    int categoryCount = 0;
    if (hasUpper) categoryCount++;
    if (hasLower) categoryCount++;
    if (hasDigit) categoryCount++;
    if (hasSymbol) categoryCount++;

    return categoryCount >= 3;
    
    }

// Problema 3
    public static int[] listPerfectNumbers2(int n) {
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                count++;
            }
        }

        
        int[] result = new int[count];
        int index = 0;

        
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
    // Comprobueba si es perfecto
    public static boolean isPerfect(int number) {
        if (number < 2) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

    



        


        
    



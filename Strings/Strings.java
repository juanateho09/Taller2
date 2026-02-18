package Strings;
public class Strings {
    public static void main(String[] args) {
        
        String name = "Juan Jose Atehortua";
        String surname = "Juanjo";
        int age = 12;

        // Concatenacio
        System.out.println(name +" "+surname);

        // Longitud
        System.out.println(name.length()); 

        // Obtener caracter
        System.out.println(name.charAt(2));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,10)); //Excluye el ultimo

        //Mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Comprobar si contiene algo
        System.out.println("Hola, Java".contains("Ja"));

        // Comparacion
        System.out.println(name.equals("Juan Jose atehortua"));
        System.out.println(name.equalsIgnoreCase("JUAN JOSE ATEHORTUA")); // Ignora mayusculas y minusculas

        // Trim
        System.out.println(" Hola, me llamo Juan ");
        System.out.println(" Hola, me llamo Juan ".trim()); // Quita espacios al inicio y al final

        // Replace
        System.out.println("Hola me llamo Juan".replace("Juan", "Camila"));

        // Format
        System.out.println(String.format("Hola, %s, Tengo %d.", name, age));


    }
    
}

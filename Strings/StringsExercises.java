package Strings;
public class StringsExercises {
    public static void main(String[] args) {
        String var1 = "Juan";
        String var2 = "Jose";
        String var3 = " Cuando yo era chiquito no queria ser chiquito pero paila ";
        System.out.println(var1+" "+var2);
        System.out.println(var1.length());
        System.out.println(var1.charAt(0)+" "+var1.charAt(var1.length()-1));
        System.out.println(var2.toUpperCase());
        System.out.println(var2.toLowerCase());
        System.out.println(var3.contains("chiquito"));
        int var4 = 56;
        System.out.println(String.format("Soy Juan Jose y tengo %d tortas de chocolate",var4));
        System.out.println(var3.trim());
        System.out.println(var3.replaceAll(" ", ""));
        System.out.println(var1.equals(var2));
        System.out.println(var1.length() == var2.length());

        }
}

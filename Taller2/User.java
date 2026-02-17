package Taller2;

public class User {

    private String id;
    private String name;
    private String paymentType;

    public User(String id, String name, String paymentType) {
        setId(id);
        setName(name);
        setPaymentType(paymentType);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setId(String id) {

        if (id != null && !id.isEmpty()) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Error: el id no puede estar vacío");
        }
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Error: El nombre no puede ser nulo.");
        }

        if (name.trim().length() < 3) {
            throw new IllegalArgumentException("Error: El nombre es muy corto. Debe tener mínimo 3 letras.");
        }
        if (!name.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            throw new IllegalArgumentException("Error: El nombre tiene caracteres que no son letras");
        }
        this.name = name;
    }

    public void setPaymentType(String paymentType) {

        if (paymentType == null) {
            throw new IllegalArgumentException("Error: El tipo de pago no puede ser nulo");
        }

        if (paymentType.equals("Tarjeta") || paymentType.equals("Efectivo")) {
            this.paymentType = paymentType;
        } else {
            throw new IllegalArgumentException("Error: El tipo de pago no es valido (Use 'Tarjeta' o 'Efectivo')");
        }
    }

}


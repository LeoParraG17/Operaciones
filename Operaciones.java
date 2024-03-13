import javax.swing.JOptionPane;

public class Operaciones1 {

    public static void main(String[] args) {
        double numero1, numero2;
        String operacion;
        String resultado;

        // Solicitar al usuario que ingrese los números
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, ingrese el primer número:"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, ingrese el segundo número:"));
        operacion = JOptionPane.showInputDialog("Por favor, ingrese el número correspondiente a la operación que desea realizar:\n1 - Suma\n2 - Resta\n3 - Multiplicación\n4 - División");

        // Realizar la operación seleccionada por el usuario
        switch (operacion) {
            case "1":   // Suma
                resultado = "El resultado de la suma es: " + (numero1 + numero2);
                break;
            case "2":   // Resta
                resultado = "El resultado de la resta es: " + (numero1 - numero2);
                break;
            case "3":   // Multiplicación
                resultado = "El resultado de la multiplicación es: " + (numero1 * numero2);
                break;
            case "4":   // División
                // Verificar si el segundo número es cero (división por cero)
                if (numero2 == 0) {
                    resultado = "No es posible dividir entre cero.";
                } else {
                    resultado = "El resultado de la división es: " + (numero1 / numero2);
                }
                break;
            default:
                resultado = "La opción ingresada no es válida.";
                break;
        }
        // Mostrar el resultado al usuario
        JOptionPane.showMessageDialog(null, resultado);
    }
}


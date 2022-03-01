import javax.swing.JOptionPane; //Necesario importar para el joptionpane

public class joptionpane {

    public static void main(String[] args) {
        String cadena;
        int numEntero;
        char letra;
        double numDoble;
        cadena = JOptionPane.showInputDialog("Digite una cadena: "); //Para sacar ventana emergente, guarda cadenas
        numEntero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: ")); //Para convertir la cadena a un int
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0); //Agarrar solo la 1ra letra y convertirla a char
        numDoble = Double.parseDouble(JOptionPane.showInputDialog("Digite un double: "));
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + numEntero);
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
        JOptionPane.showMessageDialog(null, "El double es: " + numDoble);
    }
}

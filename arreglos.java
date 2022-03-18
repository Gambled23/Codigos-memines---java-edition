import javax.swing.JOptionPane;

public class arreglos {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + (i + 1)));
        }
        int i = 0;
        while (i < 4) {
            JOptionPane.showMessageDialog(null, "Numero " + (i + 1) + ": " + numeros[i]);
            i++;
        }
    }
}

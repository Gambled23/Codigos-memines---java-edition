import javax.swing.JOptionPane;

public class clase40 {
    public static void main(String[] args) {
        int numero = 0, numeroNegativo = 0;
        boolean bandera = false;
        for(int i = 0; i<10; i++)
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + (i+1)));
            if(numero < 0)
            {
                numeroNegativo = numero;
                bandera = true;
            }
            else
            {

            }
        }
        if(bandera)
        {
            JOptionPane.showMessageDialog(null, "SI hay numeros negativos, el " + numeroNegativo);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay numeros negativos");
        }
    }
}

package reto5;
import javax.swing.*;

public class Reto5 {

    public static void main(String[] args){
        int op=0;
        double n1,d,b,o,h;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Qué desea realizar: "+" [1]C. Decimal a Binario "+" [2]C. Decimal a Octal "+" [3]C. Decimal a Hexadecimal "+" [4]C. Binario a Decimal "+" [5]C. Octal a Decimal "+" [6]C. Hexadecimal a Decimal "+" [7]Salir "));
            switch(op)
            {
                case 1:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero decimal: "));
                    b=n1;
                    JOptionPane.showMessageDialog(null,"La conversión es: ");
                    break;
                case 2:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
                    o=n1;
                    JOptionPane.showMessageDialog(null,"La conversión es: ");
                    break;
                case 3:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
                    h=n1;
                    JOptionPane.showMessageDialog(null,"La conversión es: ");
                    break;
                case 4:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
                    d=n1;
                    JOptionPane.showMessageDialog(null,"La conversión es: ");
                    break;
                case 5:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
                    d=n1;
                    JOptionPane.showMessageDialog(null,"La conversión es: ");
                    break;
                case 6:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero: "));
                    d=n1;
                    JOptionPane.showMessageDialog(null,"La conversión es: ");
                    break;
            }
        }while(op!=7);   
    }
}

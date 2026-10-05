
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        String frase;
        int num;
        int i = 0;
        frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de vezes que você quer que seja reproduzido"));
        
        JOptionPane.showMessageDialog(null,"Valor de vezes foi:" + num);
        
        while (i < num ){
        System.out.println(frase); 
        i++;
        }
    }
}
        
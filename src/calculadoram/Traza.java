package calculadoram;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Traza implements Cal{

    @Override
    public String Calculadora(int a) {
        int [][] Matriz=new int[a][a];
        int x = 0;
        String Imprimir="";
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                Matriz [i][j]=(int)(Math.random()*10);
                Imprimir=Imprimir+Matriz[i][j]+" ";
            }   
            Imprimir=Imprimir+"\n";
        }
        JOptionPane.showMessageDialog(null, "La matriz que se opera es esta \n" + Imprimir);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i==j){
                    x = x + Matriz[i][j];                                               
                }                
            }            
        }
        return x+"";
    } 
}

package calculadoram;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Determinante implements Cal{

    @Override
    public String Calculadora(int a) {
        int [][] Matriz=new int[a][a];
        int [][] Matriz1=new int[5][3];
        String Imprimir="";
        int x = 1;
        int y = 1;
        int z = 0;
        int d = 4;
        String resu="";
        if(a==3){
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    Matriz [i][j]=(int)(Math.random()*10);
                    Imprimir=Imprimir+Matriz[i][j]+" ";
                }
                Imprimir=Imprimir+"\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz que se opera es esta \n" + Imprimir);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 3; j++) {
                    if(i<3){
                        Matriz1[i][j]=Matriz[i][j];
                    }
                    else{
                        Matriz1[i][j]=Matriz[i-3][j];
                    }
                }                
            }
            for (int k = 0; k < 3; k++) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i==j){
                            x = x * Matriz1[i+k][j];                                               
                        }                
                    }            
                }
                z=z+x;
                x=1;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i==j){
                            y = y * Matriz1[i+d-k][j]; 
                            d=d-2;
                        }                
                    }            
                }
                d=4;
                z=z-y;
                y=1;
                resu=z+"";
            }            
        }
        else{
            resu="La matriz no tiene dimenciones 3x3";
        }
        return resu;
    }
}

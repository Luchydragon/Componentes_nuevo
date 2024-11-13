/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentes_nuevo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

/**
 *
 * @author Alumno
 */
public class Componentes_nuevo extends JFrame {
    
    private JTextArea textArea= new JTextArea();
    private ButtonGroup btngrupo1 = new ButtonGroup();
    private JRadioButton rd1 = new JRadioButton();
    private JRadioButton rd2 = new JRadioButton();
    private JCheckBox check1 = new JCheckBox();
    private JCheckBox check2= new JCheckBox();
    
    public Componentes_nuevo(){
        setTitle("Operaciones Básicas"); //titulo de la ventana
        setSize(1000, 300); //tamaño de ventana
        setLocationRelativeTo(null); //centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcion terminar la ejecución al cerrar la ventana
        //componenetes 
      getContentPane().setBackground(Color.red);
    }
    public void AddComponentes(JPanel panel1){
     textArea.setBounds(10,20,300,100);
     panel1.add(textArea);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Componentes_nuevo ventana = new Componentes_nuevo();
        JPanel panell= new JPanel();
        panell.setLayout(null);
        
        ventana.getContentPane().add(panell);
        ventana.AddComponentes(panell);
        ventana.setVisible(true);
    }
    
}

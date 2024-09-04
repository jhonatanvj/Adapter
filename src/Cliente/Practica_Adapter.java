/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;


import Adapter_Obejtos.VehiculoAdapter;
import Adapter_Obejtos.VehiculoDeCalle;
import Adapter_Obejtos.VehiculoDeCarreras;
import Target_Objetos.EdificioAdministrativo;
import Target_Objetos.EdificioEstudiantil;
import Target_Objetos.Target_objetos;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica_Adapter extends JFrame {
    private JButton btnEdificioAdministrativo;
    private JButton btnEdificioEstudiantil;
    private JButton btnVehiculoDeCalle;
    private JButton btnVehiculoDeCarreras;
    private JTextArea textArea;
    private static Target_objetos objetos;
    

    public Practica_Adapter() {
        setTitle("Patrón Adapter - Edificios y Vehículos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        btnEdificioAdministrativo = new JButton("Edificio Administrativo");
        btnEdificioAdministrativo.setBounds(50, 50, 300, 30);
        add(btnEdificioAdministrativo);

        btnEdificioEstudiantil = new JButton("Edificio Estudiantil");
        btnEdificioEstudiantil.setBounds(50, 100, 300, 30);
        add(btnEdificioEstudiantil);

        btnVehiculoDeCalle = new JButton("Vehículo de Calle");
        btnVehiculoDeCalle.setBounds(50, 150, 300, 30);
        add(btnVehiculoDeCalle);

        btnVehiculoDeCarreras = new JButton("Vehículo de Carreras");
        btnVehiculoDeCarreras.setBounds(50, 200, 300, 30);
        add(btnVehiculoDeCarreras);

        textArea = new JTextArea();
        textArea.setBounds(50, 250, 380, 200);
        textArea.setEditable(false);
        add(textArea);

        btnEdificioAdministrativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objetos = new EdificioAdministrativo();
                usarProfesion();
            }
        });

        btnEdificioEstudiantil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objetos = new EdificioEstudiantil();
                usarProfesion();
            }
        });

        btnVehiculoDeCalle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objetos = new VehiculoAdapter(new VehiculoDeCalle());
                usarProfesion();
            }
        });

        btnVehiculoDeCarreras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objetos = new VehiculoAdapter(new VehiculoDeCarreras());
                usarProfesion();
            }
        });
    }
    
    
  
    private void usarProfesion() {
        textArea.setText(""); // Limpiar el área de texto
        textArea.append(objetos.getClass().getSimpleName() + ":\n"+
        objetos.contratos()+
        objetos.supervision());
        
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Practica_Adapter().setVisible(true);
            }
        });
    }
}


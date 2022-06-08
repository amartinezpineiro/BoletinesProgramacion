package Boletines.Boletin29;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz implements ActionListener {
    private JButton boton;

    public void crear(){
        //marco
        JFrame marco = new JFrame();
        marco.setLayout(null);
        marco.setResizable(true);
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setBounds(0,0,500,600);

        //primer panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,500,200);

        //segundo panel
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0,200,500,400);

        //etiquetas
        JLabel etiqueta1 = new JLabel("NOME");
        JLabel etiqueta2 = new JLabel("APELIDO");
        etiqueta1.setBounds(0,0,75,50);
        etiqueta2.setBounds(0,75,75,50);

        //textFields
        JTextField texto1 = new JTextField();
        JTextField texto2 = new JTextField();
        texto1.setBounds(100,0,200,50);
        texto2.setBounds(100,75,200,50);

        //comboBox
        String[] elementos={"dam1","dam2","asir1","asir2"};
        JComboBox<String> comboBox = new JComboBox<>(elementos);
        comboBox.setBounds(350,0,100,50);

        //boton
        boton=new JButton("AGREGAR TABOA");
        boton.setToolTipText("Añade fila a la tabla");
        boton.addActionListener(this);
        boton.setBounds(350,75,150,50);

        //tabla
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        tabla.setBounds(0,0,500,400);
                

        //Añado los componentes al primer panel
        panel.add(comboBox);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(boton);
        //añado componentes al segundo panel
        panel2.add(tabla);
        //añado los paneles al marco
        marco.add(panel);
        marco.add(panel2);

        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton){
        }
    }
}
package Boletines.Boletin26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz implements ActionListener {
    private JFrame marco;
    private JPanel panel;
    private JButton boton1;
    private JButton boton2;
    private JTextField texto1;
    private JTextField texto2;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JTextArea areaTexto;
    public void crear(){
        marco =new JFrame();
        panel=new JPanel();
        boton1=new JButton("PREMER");
        boton2=new JButton("LIMPAR");
        texto1=new JTextField();
        texto2= new JTextField();
        etiqueta1 =new JLabel("NOME");
        etiqueta2 =new JLabel("PASSWORD");
        areaTexto =new JTextArea("AREA DE TEXTO.");

        marco.setBounds(200,100,600,600);

        panel.setBounds(50,50,50,50);

        boton1.setBounds(50,450,100,50);
        boton2.setBounds(200,450,100,50);
        boton2.setToolTipText("Limpiar el texto");

        etiqueta1.setBounds(50,50,100,50);
        etiqueta2.setBounds(50,150,100,50);

        texto1.setBounds(250,50,100,50);
        texto2.setBounds(250,150,100,50);

        areaTexto.setBounds(50,250,200,100);

        panel.setLayout(null);
        //Añado los componentes al panel
        panel.add(boton1);
        panel.add(boton2);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(areaTexto);
        //Añado el panel al marco
        marco.add(panel);

        marco.setResizable(true);
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setVisible(true);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            areaTexto.setText("Hola "+texto1.getText());
        }else if (e.getSource()==boton2){
            texto1.setText("");
            texto2.setText("");
            areaTexto.setText("");
        }
    }
}

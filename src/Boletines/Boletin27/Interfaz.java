package Boletines.Boletin27;

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

    private JPanel panel2;
    private JList lista;
    private JButton boton3;
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

        String[] elementos={"ElementoLista1","ElementoLista2","ElementoLista3"};
        panel2=new JPanel();
        lista =new JList<>(elementos);
        boton3=new JButton("BOTON");
        areaTexto=new JTextArea("AREA DE TEXTO");

        panel2.setBounds(0,400,500,400);
        lista.setBounds(0,0,200,250);
        boton3.setBounds(300,0,100,50);
        areaTexto.setBounds(400,0,100,250);


        marco.setLayout(null);
        marco.setBounds(0,0,500,800);

        panel.setBounds(0,0,500,400);

        boton1.setBounds(50,250,100,50);
        boton2.setBounds(200,250,100,50);
        boton2.setToolTipText("Limpiar el texto");

        etiqueta1.setBounds(0,50,100,50);
        etiqueta2.setBounds(0,150,100,50);

        texto1.setBounds(300,50,200,50);
        texto2.setBounds(300,150,200,50);

        panel.setLayout(null);
        //Añado los componentes al panel
        panel.add(boton1);
        panel.add(boton2);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(etiqueta1);
        panel.add(etiqueta2);

        panel2.setLayout(null);
        panel2.add(lista);
        panel2.add(boton3);
        panel2.add(areaTexto);

        //Añado el panel al marco
        marco.add(panel);
        marco.add(panel2);



        marco.setResizable(true);
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setVisible(true);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            areaTexto.setText("Hola "+texto1.getText());
        }else if (e.getSource()==boton2){
            texto1.setText("");
            texto2.setText("");
            areaTexto.setText("");
        }else if(e.getSource()==boton3){
            panel.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
        }
    }
}
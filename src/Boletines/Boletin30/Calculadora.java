package Boletines.Boletin30;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora implements ActionListener {
    private JTextField texto;
    private JButton boton0;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton botonDiv;
    private JButton botonMul;
    private JButton botonSum;
    private JButton botonRes;
    private JButton botonCalc;
    private JButton botonPunt;
    private String calculo="";

    public void crear(){
        //marco
        JFrame marco = new JFrame();
        marco.setLayout(null);
        marco.setResizable(false);
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setBounds(0,0,325,450);

        //primer panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,325,100);

        //segundo panel
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0,100,325,350);

        //Textfield
        texto = new JTextField();
        texto.setBounds(25,25,275,50);

        //boton
        boton0=new JButton("0");
        boton1=new JButton("1");
        boton2=new JButton("2");
        boton3=new JButton("3");
        boton4=new JButton("4");
        boton5=new JButton("5");
        boton6=new JButton("6");
        boton7=new JButton("7");
        boton8=new JButton("8");
        boton9=new JButton("9");
        botonDiv=new JButton("/");
        botonMul=new JButton("*");
        botonRes=new JButton("-");
        botonSum=new JButton("+");
        botonCalc=new JButton("=");
        botonPunt=new JButton(".");

        botonDiv.setToolTipText("Dividir");
        botonMul.setToolTipText("Multiplicar");
        botonSum.setToolTipText("Sumar");
        botonRes.setToolTipText("Restar");
        botonCalc.setToolTipText("Mostar resultado");

        boton0.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        botonDiv.addActionListener(this);
        botonMul.addActionListener(this);
        botonSum.addActionListener(this);
        botonRes.addActionListener(this);
        botonCalc.addActionListener(this);
        botonPunt.addActionListener(this);


        boton7.setBounds(25,25,50,50);
        boton8.setBounds(100,25,50,50);
        boton9.setBounds(175,25,50,50);
        botonDiv.setBounds(250,25,50,50);
        boton4.setBounds(25,100,50,50);
        boton5.setBounds(100,100,50,50);
        boton6.setBounds(175,100,50,50);
        botonMul.setBounds(250,100,50,50);
        boton1.setBounds(25,175,50,50);
        boton2.setBounds(100,175,50,50);
        boton3.setBounds(175,175,50,50);
        botonRes.setBounds(250,175,50,50);
        boton0.setBounds(25,250,50,50);
        botonPunt.setBounds(100,250,50,50);
        botonCalc.setBounds(175,250,50,50);
        botonSum.setBounds(250,250,50,50);


        //Añado los componentes al primer panel
        panel.add(texto);

        //añado componentes al segundo panel
        panel2.add(boton0);
        panel2.add(boton1);
        panel2.add(boton2);
        panel2.add(boton3);
        panel2.add(boton4);
        panel2.add(boton5);
        panel2.add(boton6);
        panel2.add(boton7);
        panel2.add(boton8);
        panel2.add(boton9);
        panel2.add(botonDiv);
        panel2.add(botonMul);
        panel2.add(botonRes);
        panel2.add(botonSum);
        panel2.add(botonCalc);
        panel2.add(botonPunt);


        //añado los paneles al marco
        marco.add(panel);
        marco.add(panel2);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton0){
            texto.setText(this.calculo+="0");
        }
        if(e.getSource()==boton1){
            texto.setText(this.calculo+="1");
        }
        if(e.getSource()==boton2){
            texto.setText(this.calculo+="2");
        }
        if(e.getSource()==boton3){
            texto.setText(this.calculo+="3");
        }
        if(e.getSource()==boton4){
            texto.setText(this.calculo+="4");
        }
        if(e.getSource()==boton5){
            texto.setText(this.calculo+="5");
        }
        if(e.getSource()==boton6){
            texto.setText(this.calculo+="6");
        }
        if(e.getSource()==boton7){
            texto.setText(this.calculo+="7");
        }
        if(e.getSource()==boton8){
            texto.setText(this.calculo+="8");
        }
        if(e.getSource()==boton9){
            texto.setText(this.calculo+="9");
        }
        if(e.getSource()==botonDiv){
            texto.setText(this.calculo+=" / ");
        }
        if(e.getSource()==botonMul){
            texto.setText(this.calculo+=" * ");
        }
        if(e.getSource()==botonRes){
            texto.setText(this.calculo+=" - ");
        }
        if(e.getSource()==botonSum){
            texto.setText(calculo+=" + ");
        }
        if(e.getSource()==botonCalc){
            texto.setText(""+Float.parseFloat(calculo));

        }
        if(e.getSource()==botonPunt){
            texto.setText(this.calculo+=".");
        }


    }
}

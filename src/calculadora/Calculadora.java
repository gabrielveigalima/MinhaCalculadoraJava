package calculadora;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;




    public class Calculadora extends JFrame {  
        float v1, v2, resul;
        String sinal, tipo;
        int resulint;
       

        public JButton um;
        public JButton dois;
        public JButton tres;
        public JButton quatro;
        public JButton cinco;
        public JButton seis;
        public JButton sete;
        public JButton oito;
        public JButton nove;
        public JButton zero;
        public JButton ponto;
        public JButton igual;
        public JButton mais;
        public JButton menos;
        public JButton dividi;
        public JButton vezes;
        public JButton zerar;
        public JLabel txtNomedevelop;
        public JTextField tela;
        
        public Calculadora(){
                
            super("Calculadora do Gabriel");
            setSize(310, 305);
            //Deixa a janela fixa 
            setResizable(false);
            //Deixa a janela centralizada
            setLocationRelativeTo(null);
            //Aparecer todos os butoes
            setLayout(null);
            Adiciona();
            //Para aparecer os butões 
            setVisible(true);
            //Fecha a janela 
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void Adiciona(){
            setIcon();
            tela = new JTextField(20);
            tela.setBounds(10, 10, 280, 45);
            this.getContentPane().add(tela);

            zerar = new JButton("C");
            zerar.setBounds(180, 60, 110, 30);
            this.getContentPane().add(zerar);

            um = new JButton("1");
            um.setBounds(10, 60, 45, 30);
            this.getContentPane().add(um);

            dois = new JButton("2");
            dois.setBounds(60, 60, 45, 30);
            this.getContentPane().add(dois);

            tres = new JButton("3");
            tres.setBounds(110, 60, 45, 30);
            this.getContentPane().add(tres);

            mais = new JButton("+");
            mais.setBounds(180, 110, 45, 30);
            this.getContentPane().add(mais);

            vezes = new JButton("x");
            vezes.setBounds(240, 110, 45, 30);
            this.getContentPane().add(vezes);

            quatro = new JButton("4");
            quatro.setBounds(10, 110, 45, 30);
            this.getContentPane().add(quatro);

            cinco = new JButton("5");
            cinco.setBounds(60, 110, 45, 30);
            this.getContentPane().add(cinco);

            seis = new JButton("6");
            seis.setBounds(110, 110, 45, 30);
            this.getContentPane().add(seis);

            menos = new JButton("-");
            menos.setBounds(180, 160, 45, 30);
            this.getContentPane().add(menos);

            dividi = new JButton("/");
            dividi.setBounds(240, 160, 45, 30);
            this.getContentPane().add(dividi);

            sete = new JButton("7");
            sete.setBounds(10, 160, 45, 30);
            this.getContentPane().add(sete);

            oito = new JButton("8");
            oito.setBounds(60, 160, 45, 30);
            this.getContentPane().add(oito);

            nove = new JButton("9");
            nove.setBounds(110, 160, 45, 30);
            this.getContentPane().add(nove);

            igual = new JButton("=");
            igual.setBounds(180, 210, 110, 30);
            this.getContentPane().add(igual);

            zero = new JButton("0");
            zero.setBounds(10, 210, 95, 30);
            this.getContentPane().add(zero);

            ponto = new JButton(".");
            ponto.setBounds(110, 210, 45, 30);
            this.getContentPane().add(ponto);
            
            
            txtNomedevelop = new JLabel("© 2017 - Gabriel Lima");
            txtNomedevelop.setBounds(80, 255, 210, 9);
            txtNomedevelop.setFont(new Font("Arial", Font.BOLD, 12));
            this.getContentPane().add(txtNomedevelop);

            um.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"1");
                }
            });
            dois.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"2");
                }
            });
            tres.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"3");
                }
            });
            quatro.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"4");
                }
            });
            cinco.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"5");
                }
            });
            seis.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"6");
                }
            });
            sete.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"7");
                }
            });
            oito.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"8");
                }
            });
            nove.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"9");
                }
            });
            zero.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText()+"0");
                }
            });
            ponto.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tipo = "float";
                    tela.setText(tela.getText()+".");
                }
            });           
            zerar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tela.setText("");
                }
            });
            mais.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                   v1 = Float.parseFloat(tela.getText());
                    sinal = "+";
                    tela.setText("");
                }
            });
            menos.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    v1 = Float.parseFloat(tela.getText());
                    sinal = "-";
                    tela.setText("");
                }
            });
            vezes.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    v1 = Float.parseFloat(tela.getText());
                    sinal = "*";
                    tela.setText("");
                }
            });
            dividi.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   v1 = Float.parseFloat(tela.getText());
                    sinal = "/";
                    tela.setText("");
                }
            });
            igual.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   v2 = Float.parseFloat(tela.getText());

                   if(sinal == "+"){
                       if(tipo == "float"){
                           resul = v1+v2;
                       tela.setText(String.valueOf(resul));
                       }else{
                           resul = v1+v2;
                           resulint = (int) resul;
                           tela.setText(String.valueOf(resulint));
                       }

                   }

                   if(sinal == "-"){
                       if(tipo == "float"){
                        resul = v1-v2;
                        tela.setText(String.valueOf(resul));
                       }else{
                           resul = v1-v2;
                           resulint = (int) resul;
                           tela.setText(String.valueOf(resulint));
                       }
                   }

                   if(sinal == "*"){
                       if(tipo == "float"){
                        resul = v1*v2;
                        tela.setText(String.valueOf(resul));
                       }else{
                           resul = v1*v2;
                           resulint = (int) resul;
                           tela.setText(String.valueOf(resulint));
                       }
                   }

                    if(sinal == "/"){
                        if(tipo == "float"){
                        resul = v1/v2;
                        tela.setText(String.valueOf(resul));
                       }
                        /*Nesse if ele vai verificar se a divisão terá sobra
                        se existir sobra ele vai exibir o resultado em float
                        senão em inteio
                        */
                        if(v1%v2 == 0){
                            resul = v1/v2;
                            resulint = (int) resul;
                            tela.setText(String.valueOf(resulint));
                        } 
                        else{
                            resul = v1/v2;
                            tela.setText(String.valueOf(resul));
                        }

                    }
                }
            });
        }

        public void setIcon() {
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        }
        
    }
    


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
public class MiVentana extends JFrame implements ActionListener{
  //numeros
  private JLabel tiempo;
  private JButton start;
  Timer timer;
  
  Reloj reloj= new Reloj();
 
  public MiVentana(){

    this.setTitle("Reloj");
    start =new JButton("Start");
    tiempo=new JLabel();
    timer = new Timer();
  //grid filas y columnas
    tiempo.setFont(new Font("Serif",Font.PLAIN,40));
    this.getContentPane().setLayout(new BorderLayout ());
    this.getContentPane ().add(tiempo,BorderLayout.CENTER);
    this.getContentPane ().add(start,BorderLayout.SOUTH);
  
    this.setSize(450, 100);
    this.setVisible(true);

    start.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed (ActionEvent e){
    
    if(e.getActionCommand().equals("Start")){
      start.setEnabled(false);
      TimerTask task = new TimerTask() {
        public void run()
        {
          reloj.incrementar();
          tiempo.setText(reloj.imprimir());
        }
      };
       timer.schedule(task,0,1000); 
    }
  }
}



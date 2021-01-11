import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;


public class GUIHAS extends JFrame{
    private JPanel mainPanel;
    private JLabel FRIDGES;
    private JTextField FRIDGE;
    private JTextField OVEN;
    private JTextField AIR_CONDITION;
    private JTextField WASHINE_MACHINE;
    private JButton READButton;
    private JLabel OVENS;
    private JLabel AIR_CONDITIONS;
    private JLabel WASHINE_MACHINES;

    public GUIHAS(String Title){

        super(Title);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        READButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Try Catch se periptwsi sfalmatos input klp
                try {
                    //Dexete ton arithmo sta JtextFields
                    int FR = Integer.parseInt(FRIDGE.getText());
                    int OV = Integer.parseInt(OVEN.getText());
                    int AC = Integer.parseInt(AIR_CONDITION.getText());
                    int WM = Integer.parseInt(WASHINE_MACHINE.getText());
                    int i;
                    //Epanalypseis Klasewn
                    //CLASS FRIDGE
                    for (i = 0; i < FR; i++) {
                        Fridge NewFridge = new Fridge();
                    }
                    //CLASS OVEN
                    for (i = 0; i < OV; i++) {
                        Oven NewOven = new Oven();
                    }

                    //CLASS AIRCONDITION
                    for (i = 0; i < AC; i++) {
                        AirCondition NewAirCondition = new AirCondition();
                    }

                    //CLASS WASHINE MACHINE
                    WashineMachine NewWashineMachine = null;
                    for (i = 0; i < WM; i++) {
                        NewWashineMachine = new WashineMachine();
                    }
                    //Parathyro READ....
                    JFrame f= new JFrame("DEVICES");
                    f.setLocationRelativeTo(null);
                    f.getContentPane().setBackground(Color.DARK_GRAY);
                    JLabel l1,l2,l3,l4;
                    l1=new JLabel("THE FRIDGES ARE : "+Fridge.FridgeCounter);
                    l1.setFont(new Font("Book Antiqua", Font.BOLD, 18));
                    l1.setForeground(Color.white);
                    l1.setBounds(100,30, 350,30);
                    l2=new JLabel("THE OVENS ARE : "+Oven.OvensCounter);
                    l2.setFont(new Font("Book Antiqua", Font.BOLD, 18));
                    l2.setForeground(Color.white);
                    l2.setBounds(100,60, 350,30);
                    l3=new JLabel("THE WASHINE MACHINES ARE : " + WashineMachine.WashingsCounter);
                    l3.setFont(new Font("Book Antiqua", Font.BOLD, 18));
                    l3.setForeground(Color.white);
                    l3.setBounds(100,90, 350,30);
                    l4=new JLabel("THE AIR_CONDITIONS ARE: "+AirCondition.ACounter);
                    l4.setFont(new Font("Book Antiqua", Font.BOLD, 18));
                    l4.setForeground(Color.white);
                    l4.setBounds(100,120, 350,30);
                    f.add(l1); f.add(l2); f.add(l3); f.add(l4);
                    f.setSize(600,300);
                    f.setLayout(null);
                    f.setVisible(true);


                }
                //Parathyro ERROR!!!
                catch (Exception a){
                    JOptionPane.showMessageDialog(null, "Error Or Wrong Input!!", "ERROR", JOptionPane.PLAIN_MESSAGE);

                }
            }
        });
    }



    public static void main(String[] args){
        JFrame frame = new GUIHAS("EXERCISE 7");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().add ()






    }

}

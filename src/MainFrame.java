import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbtnchange = new JButton("轉換");
//    private JButton jbtnchange2 = new JButton();
    private JTextField jtf = new JTextField();
//    private JTextField jtf2 = new JTextField();
    private JLabel jlb = new JLabel();
//    private JLabel jlb2 = new JLabel();
    private JButton jbtnexit = new JButton("Exit");
    public MainFrame(){
        this.init();
    }
    public void init(){
//        this.add(jlb2);
//        this.add(jtf2);
//        this.add(jbtnchange2);
//        jtf2.setBounds(0,190,200,200);
//        jbtnchange2.setBounds(200,190,200,200);
//        jlb2.setBounds(400,190,200,200);
        this.add(jbtnexit);
        this.add(jtf);
        this.add(jbtnchange);
        this.add(jlb);
        this.setLayout(null);
        jbtnexit.setBounds(400,190,200,200);
        jtf.setBounds(0,-10,200,200);
        jbtnchange.setBounds(200,-10,200,200);
        jlb.setBounds(400,-10,200,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(80,60,600,400);
        jbtnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        jbtnchange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    Float v1 = Float.parseFloat(jtf.getText());
                    Float v2 = v1*0.6214f;
                    jlb.setText(Float.toString(v2)+"英里");
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(MainFrame.this,"Error");
                }catch (IndexOutOfBoundsException e2){
                    JOptionPane.showMessageDialog(MainFrame.this,"錯誤");
                }catch (Exception e3){
                    JOptionPane.showMessageDialog(MainFrame.this,"Yo");
                }
            }
        });
    }
}

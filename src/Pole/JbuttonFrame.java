package Pole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public
    class JbuttonFrame
            extends JFrame {
//    public JbuttonFrame(){
//        JButton button = new JButton("Tak!");
//        JPanel jPanel = new JPanel();
//    button.addActionListener(new AbstractAction() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//        button.setBackground(Color.GREEN);
//        }
//    });

public JbuttonFrame() {
    generateFrame();
}

public void generateFrame(){
    JPanel panel = new JPanel();
   JLabel label = new JLabel("Zaliczoniy pirwszy projekt?");
    panel.add(label, BorderLayout.CENTER); //panel.


JButton jButton = new JButton("tak!");
//jButton.addActionListener(new Dzialania());
    jButton.setPreferredSize(new Dimension(70, 40));
jButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hura");
        dispose();
    }
});
    this.getContentPane().add(jButton,BorderLayout.WEST);

      JButton jButton1 = new JButton("Nie?");
    jButton1.setPreferredSize(new Dimension(70, 40));
    //jButton1.addActionListener(new Dzialania2());
    jButton1.addActionListener(new AbstractAction() {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("moze jednak, tak?");
            Random random = new Random();
            int x = random.nextInt(getWidth() - jButton1.getWidth());
            int y = random.nextInt(getHeight() - jButton1.getHeight());
            jButton1.setLocation(x, y);
            }

    });
      this.getContentPane().add(jButton1,BorderLayout.EAST);
        this.getContentPane().add(panel, BorderLayout.CENTER);

   pack();

   setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(true);
   }
                
}

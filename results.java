import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class results implements ActionListener {
    
    JFrame frame;
    JLabel s1;
    JLabel s2;
    JLabel s3;
    JLabel total;
    JLabel n1;
    JLabel n2;
    JLabel n3;
    JLabel t;
    
    JLabel user;
    JTextField userTF;
    JButton save;
    JLabel status;
    JButton menu;
    
    public results () {
        frame = new JFrame("");
        s1 = new JLabel("Stage 1: ");
        s2 = new JLabel("Stage 2: ");
        s3 = new JLabel("Stage 3: ");
        total = new JLabel ("Total: ");
        n1 = new JLabel ();
        n2 = new JLabel ();
        n3 = new JLabel ();
        t = new JLabel ();
        
        user = new JLabel("Enter Username: ");
        userTF = new JTextField("");
        save = new JButton("Save Score");
        status = new JLabel("Only total time elapsed will be saved!");
        menu = new JButton ("Back to Main Menu");
        
    }
    
    public void setFrame() {
        frame.setLayout(new GraphPaperLayout(new Dimension(15, 19)));
        
        frame.add(s1, new Rectangle (1,1,5,2));
        frame.add(s2, new Rectangle (1,3,5,2));
        frame.add(s3, new Rectangle (1,5,5,2));
        frame.add(total, new Rectangle (1,7,5,2));
        
        frame.add(n1, new Rectangle (6,1,8,2));
        frame.add(n2, new Rectangle (6,3,8,2));
        frame.add(n3, new Rectangle (6,5,8,2));
        frame.add(t, new Rectangle (6,7,8,2));
        
        frame.add(user, new Rectangle (1,10,5,2));
        frame.add(userTF, new Rectangle (6,10,8,2));
        frame.add(save, new Rectangle (1,12,13,2));
        frame.add(status, new Rectangle (1,14,13,2));
        frame.add(menu, new Rectangle (1,16,13,2));
        
        frame.setVisible(true); 
        frame.setBounds (0,0,400,500);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        
        menu.addActionListener(this);
        save.addActionListener(this);
    }
    
    public void actionPerformed (ActionEvent e) {
        String ac = e.getActionCommand();
        if (ac.equals(menu.getActionCommand())) {
            Homepage sg=new Homepage () {};
            sg.setFrame();
            frame.dispose();
        }
        else {
            
            try {
                FileWriter afile = new FileWriter("score.txt", true);
                afile.write(t.getText() + " " + userTF.getText() + "\n");
                afile.close();
                
                status.setText("Score saved successfully!");
                save.setEnabled(false);
            }
            catch (IOException a) {
                status.setText("Error Occured :<");
            }
        }
    }
    
 }    

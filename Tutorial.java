import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tutorial implements ActionListener {
    
    JFrame frame;
    JLabel image;
    JLabel dialogue;
    JButton back;
    JButton next;
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
    ImageIcon icon4;
    ImageIcon icon5;
    String text1;
    String text2;
    String text3;
    String text4;
    String text5;
    String text6;
    String text7;
    String text8;
    String text9;
    String text10;
    String text11;
    String text12;
    
    
    public Tutorial () {
        frame = new JFrame("Tutorial");
        
        
        icon1 = new ImageIcon(Tutorial.class.getResource("pkg4qproj/resources/story/1.png"));
        icon2 = new ImageIcon(Tutorial.class.getResource("pkg4qproj/resources/story/2.png"));
        icon3 = new ImageIcon(Tutorial.class.getResource("pkg4qproj/resources/story/3.png"));
        icon4 = new ImageIcon(Tutorial.class.getResource("pkg4qproj/resources/story/4.png"));
        icon5 = new ImageIcon(Tutorial.class.getResource("pkg4qproj/resources/story/5.png"));
        
        text1 = "It's your first day being an electrical engineer";
        text2 = "Nervous but determined,";
        text3 = "You take up your first ever client";
        text4 = "You're tasked to fix their house's electrical wiring";
        text5 = "3 rooms have faulty lights and switches";
        text6 = "And you are asked to fix them";
        text7 = "The faster you are the higher your pay will be";
        text8 = "Click on the tiles to rotate them";
        text9 = "Rotate the components in the right orientation";
        text10 = "Afterwards, turn on the power source";
        text11 = "If done correctly, you will proceed to the next stage";
        text12 = "Else, it's game over";
        
        image = new JLabel(icon1);
        dialogue = new JLabel(text1);
        back = new JButton("Menu");
        next = new JButton("Next");
    }
    
    public void setFrame() {
        frame.setLayout(new GraphPaperLayout(new Dimension(16, 12)));
        
        frame.add(image, new Rectangle(1,1,14,6));
        frame.add(dialogue, new Rectangle(1,7,14,2));
        frame.add(back, new Rectangle(1,9,4,2));
        frame.add(next, new Rectangle(11,9,4,2));

        frame.setVisible(true); 
        frame.setBounds (0,0,800,650);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        
        next.addActionListener(this);
        back.addActionListener(this);
                
    }
    
    public void actionPerformed (ActionEvent e) {
        String ac = e.getActionCommand();
        
        if (ac.equals(next.getActionCommand())) {
            String text = dialogue.getText();
            
            if(text == text1) {
                dialogue.setText(text2);
            }
            else if(text == text2) {
                dialogue.setText(text3);
            }
            else if(text == text3) {
                dialogue.setText(text4);
                image.setIcon(icon2);
            }
            else if(text == text4) {
                dialogue.setText(text5);
            }
            else if(text == text5) {
                dialogue.setText(text6);
            }
            else if(text == text6) {
                dialogue.setText(text7);
                image.setIcon(icon3);
            }
            else if(text == text7) {
                dialogue.setText(text8);
                image.setIcon(icon4);
            }
            else if(text == text8) {
                dialogue.setText(text9);
            }
            else if(text == text9) {
                dialogue.setText(text10);
            }
            else if(text == text10) {
                dialogue.setText(text11);
                image.setIcon(icon5);
            }
            else if(text == text11) {
                dialogue.setText(text12);
            }
            else if(text == text12) {
                Homepage sg=new Homepage () {};
                sg.setFrame();
                frame.dispose();
            }
        }
        else{
            Homepage sg=new Homepage () {};
            sg.setFrame();
            frame.dispose();
        }
        
    }
    
 }    

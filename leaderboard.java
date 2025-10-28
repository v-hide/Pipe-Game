import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class leaderboard implements ActionListener {
    
    JFrame frame;
    JLabel rank;
    JLabel t1;
    JLabel t2;
    JLabel t3;
    JLabel t4;
    JLabel t5;
    JLabel username;
    JLabel u1;
    JLabel u2;
    JLabel u3;
    JLabel u4;
    JLabel u5;
    JLabel timetaken;
    JLabel s1;
    JLabel s2;
    JLabel s3;
    JLabel s4;
    JLabel s5;
    JButton menu;
    
    public leaderboard () {
        frame = new JFrame("");
        rank = new JLabel("Rank");
        t1 = new JLabel("#1");
        t2 = new JLabel("#2");
        t3 = new JLabel("#3");
        t4 = new JLabel("#4");
        t5 = new JLabel("#5");
        username = new JLabel("Username");
        u1 = new JLabel("");
        u2 = new JLabel("");
        u3 = new JLabel("");
        u4 = new JLabel("");
        u5 = new JLabel("");
        timetaken = new JLabel("Time Taken");
        s1 = new JLabel("");
        s2 = new JLabel("");
        s3 = new JLabel("");
        s4 = new JLabel("");
        s5 = new JLabel("");
        menu = new JButton("Back to Menu");
    }
    
    public void setFrame() {
        frame.setLayout(new GraphPaperLayout(new Dimension(17, 17)));
        
        frame.add(rank, new Rectangle(1,1,2,2));
        frame.add(t1, new Rectangle(1,3,2,2));
        frame.add(t2, new Rectangle(1,5,2,2));
        frame.add(t3, new Rectangle(1,7,2,2));
        frame.add(t4, new Rectangle(1,9,2,2));
        frame.add(t5, new Rectangle(1,11,2,2));
        
        frame.add(username, new Rectangle(3,1,9,2));
        frame.add(u1, new Rectangle(3,3,9,2));
        frame.add(u2, new Rectangle(3,5,9,2));
        frame.add(u3, new Rectangle(3,7,9,2));
        frame.add(u4, new Rectangle(3,9,9,2));
        frame.add(u5, new Rectangle(3,11,9,2));
        
        frame.add(timetaken, new Rectangle(12,1,4,2));
        frame.add(s1, new Rectangle(12,3,4,2));
        frame.add(s2, new Rectangle(12,5,4,2));
        frame.add(s3, new Rectangle(12,7,4,2));
        frame.add(s4, new Rectangle(12,9,4,2));
        frame.add(s5, new Rectangle(12,11,4,2));
        
        frame.add(menu, new Rectangle(1,14,15,2));
        
        frame.setVisible(true); 
        frame.setBounds (0,0,600,400);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        
        menu.addActionListener(this);
        
        sort();
    }
    
    public void actionPerformed (ActionEvent e) {
        Homepage sg=new Homepage () {};
        sg.setFrame();
        frame.dispose();
    }
    
    public void sort() {
        try {
            File f = new File("score.txt");
            Scanner cons = new Scanner(f);
            int count=0;
            
            double scores[] = new double[1000000];
            String user[] = new String[1000000];
            double score;
            
            while (cons.hasNextLine()) {                
                String cont;
                cont = cons.nextLine();
                String subs[] = cont.split(" ");
                score = Double.parseDouble(subs[0]);
                scores[count] = score;
                user[count] = subs[1];
                count++;
            }
            
            //Finding top1
            double min = scores[0];
            for (int i = 0; i < count; i++) {
                min = Math.min(min, scores[i]);
            }
            s1.setText(Double.toString(min) + "s");
            //Finding top1 user
            int ind1;
            for (int i = 0; i < count; i++)
            {
                if (scores[i] == min) {
                    ind1 = i;
                    
                    if (scores[i] == 1000000000) {
                        s1.setText("");
                    }
                    else {
                        u1.setText(user[ind1]);
                        scores[ind1] = 1000000000; //removes top5 
                    }
                }
            }
            
            //Finding top2
            double min2 = scores[0];
            for (int i = 0; i < count; i++) {
                min2 = Math.min(min2, scores[i]);
            }
            s2.setText(Double.toString(min2) + "s");
            //Finding top2 user
            int ind2;
            for (int i = 0; i < count; i++)
            {
                if (scores[i] == min2) {
                    ind2 = i;
                    
                    if (scores[i] == 1000000000) {
                        s2.setText("");
                    }
                    else {
                        u2.setText(user[ind2]);
                        scores[ind2] = 1000000000; //removes top5 
                    }
                }
            }
            
            //Finding top3
            double min3 = scores[0];
            for (int i = 0; i < count; i++) {
                min3 = Math.min(min3, scores[i]);
            }
            s3.setText(Double.toString(min3) + "s");
            //Finding top3 user
            int ind3;
            for (int i = 0; i < count; i++)
            {
                if (scores[i] == min3) {
                    ind3 = i;
                    
                    if (scores[i] == 1000000000) {
                        s3.setText("");
                    }
                    else {
                        u3.setText(user[ind3]);
                        scores[ind3] = 1000000000; //removes top5 
                    }
                }
            }
            
            //Finding top4
            double min4 = scores[0];
            for (int i = 0; i < count; i++) {
                min4 = Math.min(min4, scores[i]);
            }
            s4.setText(Double.toString(min4) + "s");
            //Finding top4 user
            int ind4;
            for (int i = 0; i < count; i++)
            {
                if (scores[i] == min4) {
                    ind4 = i;
                    
                    if (scores[i] == 1000000000) {
                        s4.setText("");
                    }
                    else {
                        u4.setText(user[ind4]);
                        scores[ind4] = 1000000000; //removes top5 
                    }
                }
            }
            
            //Finding top5
            double min5 = scores[0];
            for (int i = 0; i < count; i++) {
                min5 = Math.min(min5, scores[i]);
            }
            s5.setText(Double.toString(min5) + "s");
            //Finding top5 user
            int ind5;
            for (int i = 0; i < count; i++)
            {
                if (scores[i] == min5) {
                    ind5 = i;
                    
                    if (scores[i] == 1000000000) {
                        s5.setText("");
                    }
                    else {
                        u5.setText(user[ind5]);
                        scores[ind5] = 1000000000; //removes top5 
                    }
                    
                    
                }
            }
        }
        catch (Exception var) {
            JOptionPane.showMessageDialog(frame,"Unable to display leaderboard");
            System.out.println(var.toString());
        }
    }
    
 }    

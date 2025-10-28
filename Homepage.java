import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Homepage implements ActionListener {
    
    JFrame frame;
    JLabel title;
    JButton tutorial;
    JButton start;
    JButton load;
    
    public Homepage () {
        frame = new JFrame("");
        title = new JLabel("");
        tutorial = new JButton("Tutorial");
        start = new JButton("Start");
        load = new JButton("Local Leaderboard");
    }
    
    public void setFrame() {
        frame.setLayout(new GraphPaperLayout(new Dimension(12, 16)));
        frame.add(title, new Rectangle (1,1,10,2));
        frame.add(tutorial, new Rectangle (1,5,10,2));
        frame.add(start, new Rectangle (1,8,10,2));
        frame.add(load, new Rectangle (1,11,10,2));
        
        frame.setVisible(true); 
        frame.setBounds (0,0,300,400);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        
        start.addActionListener(this);
        tutorial.addActionListener(this);
        load.addActionListener(this);
    }
    
    public void actionPerformed (ActionEvent e) {
        String ac = e.getActionCommand();
        
        if (ac.equals(tutorial.getActionCommand())) {
            Tutorial sg=new Tutorial () {};
            sg.setFrame();
            frame.dispose();
        }
        else if (ac.equals(start.getActionCommand())) {
            double ran = 3*(Math.random());
            double num = Math.round(ran);
            
            if (num == 1.0) {
                _3x31 sg=new _3x31 () {};
                sg.setFrame();
                frame.dispose();
            }
            else if (num == 2.0) {
                _3x32 sg=new _3x32 () {};
                sg.setFrame();
                frame.dispose();
            }
            else {
                _3x33 sg=new _3x33 () {};
                sg.setFrame();
                frame.dispose();
            }
        }
        else if (ac.equals(load.getActionCommand())) {
            leaderboard sg=new leaderboard () {};
            sg.setFrame();
            frame.dispose();
        }

    }
    
 }    

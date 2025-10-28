import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _3x33 implements ActionListener {
    JFrame frame;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;    
    JButton b7;
    JButton b8;
    JButton b9;
    JButton check;
    ImageIcon wire;
    ImageIcon wire2;
    ImageIcon wire3;
    ImageIcon wire4;
    ImageIcon corner;
    ImageIcon corner2;
    ImageIcon corner3;
    ImageIcon corner4;
    ImageIcon end;
    ImageIcon end2;
    ImageIcon end3;
    ImageIcon end4;
    ImageIcon bulb;
    ImageIcon bulb2;
    ImageIcon bulb3;
    ImageIcon bulb4;
    
    long start = System.currentTimeMillis();
    
    public _3x33 () {
        frame = new JFrame ("_3x33");
        wire = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/arrow.png"));
        wire2 = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/arrowR.png"));
        wire3 = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/arrowU.png"));
        wire4 = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/arrowL.png"));
        
        corner = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/corner.png"));
        corner2 = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/cornerR.png"));
        corner3 = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/cornerU.png"));
        corner4 = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/cornerL.png"));
        
        end = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/end.png"));
        end2 = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/endR.png"));
        end3 = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/endU.png"));
        end4 = new ImageIcon(_3x33.class.getResource("pkg4qproj/resources/tiles/endL.png"));
        
        bulb = new ImageIcon(_3x31.class.getResource("pkg4qproj/resources/tiles/bulb.png"));
        bulb2 = new ImageIcon(_3x31.class.getResource("pkg4qproj/resources/tiles/bulbR.png"));
        bulb3 = new ImageIcon(_3x31.class.getResource("pkg4qproj/resources/tiles/bulbU.png"));
        bulb4 = new ImageIcon(_3x31.class.getResource("pkg4qproj/resources/tiles/bulbL.png"));
        
        b1 = new JButton ("​");
        b2 = new JButton ("​​");
        b3 = new JButton ("​​​");
        b4 = new JButton ("​​​​");
        b5 = new JButton ("​​​​​");
        b6 = new JButton ("​​​​​​");
        b7 = new JButton ("​​​​​​​");
        b8 = new JButton ("​​​​​​​​");
        b9 = new JButton ("​​​​​​​​​");
        check = new JButton("Turn On");
        
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        
        b5.setOpaque(false);
        b5.setContentAreaFilled(false);
        b5.setBorderPainted(false);
        
        b6.setOpaque(false);
        b6.setContentAreaFilled(false);
        b6.setBorderPainted(false);

        b7.setOpaque(false);
        b7.setContentAreaFilled(false);
        b7.setBorderPainted(false);
        
        b8.setOpaque(false);
        b8.setContentAreaFilled(false);
        b8.setBorderPainted(false);
        
        b9.setOpaque(false);
        b9.setContentAreaFilled(false);
        b9.setBorderPainted(false);
    }
    
    public void setFrame() {
        frame.setLayout(new GraphPaperLayout(new Dimension(8, 10)));
        frame.add(check, new Rectangle (1,7,6,2));
        frame.add(b1, new Rectangle (1,1,2,2));
        frame.add(b2, new Rectangle (3,1,2,2));
        frame.add(b3, new Rectangle (5,1,2,2));
        frame.add(b4, new Rectangle (1,3,2,2));
        frame.add(b5, new Rectangle (3,3,2,2));
        frame.add(b6, new Rectangle (5,3,2,2));
        frame.add(b7, new Rectangle (1,5,2,2));
        frame.add(b8, new Rectangle (3,5,2,2));
        frame.add(b9, new Rectangle (5,5,2,2));
        
        
        frame.setVisible(true);
        frame.setBounds(0, 0, 350,500);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        check.addActionListener(this);
        
        b1.setIcon(corner);
        b2.setIcon(bulb);
        b3.setIcon(corner);
        b4.setIcon(end);
        b5.setIcon(wire);
        b6.setIcon(bulb);
        b7.setIcon(corner);
        b8.setIcon(bulb);
        b9.setIcon(corner);
        
        
    }
        
        
    
    public void actionPerformed (ActionEvent e) {
        String ac = e.getActionCommand();

        
        if (ac.equals(b1.getActionCommand())) {
        
        ImageIcon icon = (ImageIcon)b1.getIcon();

            if (icon.equals(corner)) {
                b1.setIcon(corner2);
            }
            else if (icon.equals(corner2)) {
                b1.setIcon(corner3);
            }
            else if (icon.equals(corner3)) {
                b1.setIcon(corner4);
            }
            else if (icon.equals(corner4)) {
                b1.setIcon(corner);
            }
        }
        else if (ac.equals(b2.getActionCommand())) {
                    
        ImageIcon icon2 = (ImageIcon)b2.getIcon();
            if (icon2.equals(bulb)) {
                b2.setIcon(bulb2);
            }
            else if (icon2.equals(bulb2)) {
                b2.setIcon(bulb3);
            }
            else if (icon2.equals(bulb3)) {
                b2.setIcon(bulb4);
            }
            else if (icon2.equals(bulb4)) {
                b2.setIcon(bulb);
            }
        }
        else if (ac.equals(b3.getActionCommand())) {
        
        ImageIcon icon = (ImageIcon)b3.getIcon();

            if (icon.equals(corner)) {
                b3.setIcon(corner2);
            }
            else if (icon.equals(corner2)) {
                b3.setIcon(corner3);
            }
            else if (icon.equals(corner3)) {
                b3.setIcon(corner4);
            }
            else if (icon.equals(corner4)) {
                b3.setIcon(corner);
            }
        }
        
        else if (ac.equals(b4.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b4.getIcon();

            if (icon.equals(end)) {
                b4.setIcon(end2);
            }
            else if (icon.equals(end2)) {
                b4.setIcon(end3);
            }
            else if (icon.equals(end3)) {
                b4.setIcon(end4);
            }
            else if (icon.equals(end4)) {
                b4.setIcon(end);
            }
        }
        else if (ac.equals(b5.getActionCommand())) {
                    
        ImageIcon icon2 = (ImageIcon)b5.getIcon();
            if (icon2.equals(wire)) {
                b5.setIcon(wire2);
            }
            else if (icon2.equals(wire2)) {
                b5.setIcon(wire3);
            }
            else if (icon2.equals(wire3)) {
                b5.setIcon(wire4);
            }
            else if (icon2.equals(wire4)) {
                b5.setIcon(wire);
            }
        }
        else if (ac.equals(b6.getActionCommand())) {
        
        ImageIcon icon = (ImageIcon)b6.getIcon();

            if (icon.equals(bulb)) {
                b6.setIcon(bulb2);
            }
            else if (icon.equals(bulb2)) {
                b6.setIcon(bulb3);
            }
            else if (icon.equals(bulb3)) {
                b6.setIcon(bulb4);
            }
            else if (icon.equals(bulb4)) {
                b6.setIcon(bulb);
            }
        }
        else if (ac.equals(b7.getActionCommand())) {
        
        ImageIcon icon = (ImageIcon)b7.getIcon();

            if (icon.equals(corner)) {
                b7.setIcon(corner2);
            }
            else if (icon.equals(corner2)) {
                b7.setIcon(corner3);
            }
            else if (icon.equals(corner3)) {
                b7.setIcon(corner4);
            }
            else if (icon.equals(corner4)) {
                b7.setIcon(corner);
            }
        }
        else if (ac.equals(b8.getActionCommand())) {
        
        ImageIcon icon2 = (ImageIcon)b8.getIcon();
            if (icon2.equals(bulb)) {
                b8.setIcon(bulb2);
            }
            else if (icon2.equals(bulb2)) {
                b8.setIcon(bulb3);
            }
            else if (icon2.equals(bulb3)) {
                b8.setIcon(bulb4);
            }
            else if (icon2.equals(bulb4)) {
                b8.setIcon(bulb);
            }
        }
        else if (ac.equals(b9.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b9.getIcon();

            if (icon.equals(corner)) {
                b9.setIcon(corner2);
            }
            else if (icon.equals(corner2)) {
                b9.setIcon(corner3);
            }
            else if (icon.equals(corner3)) {
                b9.setIcon(corner4);
            }
            else if (icon.equals(corner4)) {
                b9.setIcon(corner);
            }
        }
        
        else {
            ImageIcon a1 =(ImageIcon)b1.getIcon();
            ImageIcon a2 =(ImageIcon)b2.getIcon();
            ImageIcon a3 =(ImageIcon)b3.getIcon();
            ImageIcon a4 =(ImageIcon)b4.getIcon();
            ImageIcon a5 =(ImageIcon)b5.getIcon();
            ImageIcon a6 =(ImageIcon)b6.getIcon();
            ImageIcon a7 =(ImageIcon)b7.getIcon();
            ImageIcon a8 =(ImageIcon)b8.getIcon();
            ImageIcon a9 =(ImageIcon)b9.getIcon();
            
            if (a1.equals(corner) && a2.equals(bulb2) && a3.equals(corner2) && a4.equals(end3) && a6.equals(bulb3) && a7.equals(corner4) && a8.equals(bulb4) && a9.equals(corner3)) {
                long finish = System.currentTimeMillis();
                long timeElapsed = finish - start;
                double time = timeElapsed;
                double fin = time/1000.0;
                String finstr = Double.toString(fin);
                
                double ran = 3*(Math.random());
                double num = Math.round(ran);
                
                if (num == 1.0) {
                    _3x41 sg=new _3x41 () {};
                    sg.setFrame();
                    sg._3x3 = fin;
                    frame.dispose();
                }
                else if (num == 2.0) {
                    _3x42 sg=new _3x42 () {};
                    sg.setFrame();
                    sg._3x3 = fin;
                    frame.dispose();
                }
                else {
                    _3x43 sg=new _3x43 () {};
                    sg.setFrame();
                    sg._3x3 = fin;
                    frame.dispose();
                }
                
                JOptionPane.showMessageDialog(frame,"Success! It took you " + fin + " seconds to finish.");
                frame.dispose();
            }           
            else {
                JOptionPane.showMessageDialog(frame,"Failed :<");
                Homepage sg=new Homepage () {};
                sg.setFrame();
                frame.dispose();
            }
            
        }
        
    }
    
 }    

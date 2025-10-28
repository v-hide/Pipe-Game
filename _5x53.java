import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _5x53 implements ActionListener {
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
    JButton b10;
    JButton b11;
    JButton b12;
    JButton b13;
    JButton b14;
    JButton b15;
    JButton b16;
    JButton b17;
    JButton b18;    
    JButton b19;
    JButton b20;
    JButton b21; 
    JButton b22;
    JButton b23;
    JButton b24;
    JButton b25;
    JButton check;
    ImageIcon wire;
    ImageIcon wire2;
    ImageIcon wire3;
    ImageIcon wire4;
    ImageIcon corner;
    ImageIcon corner2;
    ImageIcon corner3;
    ImageIcon corner4;
    ImageIcon off;
    ImageIcon off2;
    ImageIcon off3;
    ImageIcon off4;
    ImageIcon Foff;
    ImageIcon Foff2;
    ImageIcon Foff3;
    ImageIcon Foff4;
    ImageIcon end;
    ImageIcon end2;
    ImageIcon end3;
    ImageIcon end4;
    ImageIcon bulb;
    ImageIcon bulb2;
    ImageIcon bulb3;
    ImageIcon bulb4;
    ImageIcon multi;
    ImageIcon multi2;
    ImageIcon multi3;
    ImageIcon multi4;
    ImageIcon Fmulti;
    ImageIcon Fmulti2;
    ImageIcon Fmulti3;
    ImageIcon Fmulti4;
    ImageIcon flick;
    ImageIcon flick2;
    ImageIcon flick3;
    ImageIcon flick4;
    
    double _3x3;
    double _3x4;
    double _5x5;

    long start = System.currentTimeMillis();
    
    public _5x53 () {
        frame = new JFrame ("_5x53");
        wire = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/arrow.png"));
        wire2 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/arrowR.png"));
        wire3 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/arrowU.png"));
        wire4 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/arrowL.png"));
        
        corner = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/corner.png"));
        corner2 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/cornerR.png"));
        corner3 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/cornerU.png"));
        corner4 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/cornerL.png"));
        
        off = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/corneroff.png"));
        off2 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/corneroffR.png"));
        off3 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/corneroffU.png"));
        off4 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/corneroffL.png"));
        
        Foff = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/Foff.png"));
        Foff2 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/FoffR.png"));
        Foff3 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/FoffU.png"));
        Foff4 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/FoffL.png"));
        
        end = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/end.png"));
        end2 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/endR.png"));
        end3 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/endU.png"));
        end4 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/endL.png"));
        
        bulb = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/bulb.png"));
        bulb2 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/bulbR.png"));
        bulb3 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/bulbU.png"));
        bulb4 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/bulbL.png"));
        
        multi = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/3way.png"));
        multi2 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/3wayR.png"));
        multi3 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/3wayU.png"));
        multi4 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/3wayL.png"));
        
        Fmulti = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/F3way.png"));
        Fmulti2 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/F3wayR.png"));
        Fmulti3 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/F3wayU.png"));
        Fmulti4 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/F3wayL.png"));
        
        flick = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/switch.png"));
        flick2 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/switchR.png"));
        flick3 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/switchU.png"));
        flick4 = new ImageIcon(_5x53.class.getResource("pkg4qproj/resources/tiles/switchL.png"));
        
        
        
        
        
        b1 = new JButton ("​");
        b2 = new JButton ("​​");
        b3 = new JButton ("​​​");
        b4 = new JButton ("​​​​");
        b5 = new JButton ("​​​​​");
        b6 = new JButton ("​​​​​​");
        b7 = new JButton ("​​​​​​​");
        b8 = new JButton ("​​​​​​​​");
        b9 = new JButton ("​​​​​​​​​");
        b10 = new JButton ("​​​​​​​​​​");
        b11 = new JButton ("​​​​​​​​​​​");
        b12 = new JButton ("​​​​​​​​​​​​");
        b13 = new JButton ("​​​​​​​​​​​​​");
        b14 = new JButton ("​​​​​​​​​​​​​​");
        b15 = new JButton ("​​​​​​​​​​​​​​​");
        b16 = new JButton ("​​​​​​​​​​​​​​​​");
        b17 = new JButton ("​​​​​​​​​​​​​​​​​");
        b18 = new JButton ("​​​​​​​​​​​​​​​​​​");
        b19 = new JButton ("​​​​​​​​​​​​​​​​​​​");
        b20 = new JButton ("​​​​​​​​​​​​​​​​​​​​");
        b21 = new JButton ("​​​​​​​​​​​​​​​​​​​​​");
        b22 = new JButton ("​​​​​​​​​​​​​​​​​​​​​​");
        b23 = new JButton ("​​​​​​​​​​​​​​​​​​​​​​​");
        b24 = new JButton ("​​​​​​​​​​​​​​​​​​​​​​​​");
        b25 = new JButton ("​​​​​​​​​​​​​​​​​​​​​​​​​");
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
        
        b10.setOpaque(false);
        b10.setContentAreaFilled(false);
        b10.setBorderPainted(false);
        
        b11.setOpaque(false);
        b11.setContentAreaFilled(false);
        b11.setBorderPainted(false);
        
        b12.setOpaque(false);
        b12.setContentAreaFilled(false);
        b12.setBorderPainted(false);
        
        b13.setOpaque(false);
        b13.setContentAreaFilled(false);
        b13.setBorderPainted(false);
        
        b14.setOpaque(false);
        b14.setContentAreaFilled(false);
        b14.setBorderPainted(false);
        
        b15.setOpaque(false);
        b15.setContentAreaFilled(false);
        b15.setBorderPainted(false);
        
        b16.setOpaque(false);
        b16.setContentAreaFilled(false);
        b16.setBorderPainted(false);
        
        b17.setOpaque(false);
        b17.setContentAreaFilled(false);
        b17.setBorderPainted(false);
        
        b18.setOpaque(false);
        b18.setContentAreaFilled(false);
        b18.setBorderPainted(false);

        b19.setOpaque(false);
        b19.setContentAreaFilled(false);
        b19.setBorderPainted(false);
        
        b20.setOpaque(false);
        b20.setContentAreaFilled(false);
        b20.setBorderPainted(false);
        
        b21.setOpaque(false);
        b21.setContentAreaFilled(false);
        b21.setBorderPainted(false);
        
        b22.setOpaque(false);
        b22.setContentAreaFilled(false);
        b22.setBorderPainted(false);
        
        b23.setOpaque(false);
        b23.setContentAreaFilled(false);
        b23.setBorderPainted(false);
        
        b24.setOpaque(false);
        b24.setContentAreaFilled(false);
        b24.setBorderPainted(false);
        
        b25.setOpaque(false);
        b25.setContentAreaFilled(false);
        b25.setBorderPainted(false);
    }
    
    public void setFrame() {
        frame.setLayout(new GraphPaperLayout(new Dimension(12, 15)));
        frame.add(check, new Rectangle (1,11,10,2));
        frame.add(b1, new Rectangle (1,1,2,2));
        frame.add(b2, new Rectangle (3,1,2,2));
        frame.add(b3, new Rectangle (5,1,2,2));
        frame.add(b4, new Rectangle (7,1,2,2));
        frame.add(b5, new Rectangle (9,1,2,2));
        frame.add(b6, new Rectangle (1,3,2,2));
        frame.add(b7, new Rectangle (3,3,2,2));
        frame.add(b8, new Rectangle (5,3,2,2));
        frame.add(b9, new Rectangle (7,3,2,2));
        frame.add(b10, new Rectangle (9,3,2,2));
        frame.add(b11, new Rectangle (1,5,2,2));
        frame.add(b12, new Rectangle (3,5,2,2));
        frame.add(b13, new Rectangle (5,5,2,2));
        frame.add(b14, new Rectangle (7,5,2,2));
        frame.add(b15, new Rectangle (9,5,2,2));
        frame.add(b16, new Rectangle (1,7,2,2));
        frame.add(b17, new Rectangle (3,7,2,2));
        frame.add(b18, new Rectangle (5,7,2,2));
        frame.add(b19, new Rectangle (7,7,2,2));
        frame.add(b20, new Rectangle (9,7,2,2));
        frame.add(b21, new Rectangle (1,9,2,2));
        frame.add(b22, new Rectangle (3,9,2,2));
        frame.add(b23, new Rectangle (5,9,2,2));
        frame.add(b24, new Rectangle (7,9,2,2));
        frame.add(b25, new Rectangle (9,9,2,2));
        
        
        frame.setVisible(true);
        frame.setBounds(0, 0, 600,750);
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
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        check.addActionListener(this);
        
        b1.setIcon(corner);
        b2.setIcon(wire);
        b3.setIcon(bulb);
        b4.setIcon(wire);
        b5.setIcon(corner);
        b6.setIcon(off);
        b7.setIcon(end);
        b8.setIcon(multi);
        b9.setIcon(corner);
        b10.setIcon(flick);
        b11.setIcon(Foff);
        b12.setIcon(wire);
        b13.setIcon(off);
        b14.setIcon(bulb);
        b15.setIcon(bulb);
        b16.setIcon(wire);
        b17.setIcon(wire);
        b18.setIcon(Foff);
        b19.setIcon(corner);
        b20.setIcon(bulb);
        b21.setIcon(corner);
        b22.setIcon(wire);
        b23.setIcon(Fmulti);
        b24.setIcon(wire);
        b25.setIcon(corner);        
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
            if (icon2.equals(wire)) {
                b2.setIcon(wire2);
            }
            else if (icon2.equals(wire2)) {
                b2.setIcon(wire3);
            }
            else if (icon2.equals(wire3)) {
                b2.setIcon(wire4);
            }
            else if (icon2.equals(wire4)) {
                b2.setIcon(wire);
            }
        }
        else if (ac.equals(b3.getActionCommand())) {
        
        ImageIcon icon = (ImageIcon)b3.getIcon();

            if (icon.equals(bulb)) {
                b3.setIcon(bulb2);
            }
            else if (icon.equals(bulb2)) {
                b3.setIcon(bulb3);
            }
            else if (icon.equals(bulb3)) {
                b3.setIcon(bulb4);
            }
            else if (icon.equals(bulb4)) {
                b3.setIcon(bulb);
            }
        }
        
        else if (ac.equals(b4.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b4.getIcon();

            if (icon.equals(wire)) {
                b4.setIcon(wire2);
            }
            else if (icon.equals(wire2)) {
                b4.setIcon(wire3);
            }
            else if (icon.equals(wire3)) {
                b4.setIcon(wire4);
            }
            else if (icon.equals(wire4)) {
                b4.setIcon(wire);
            }
        }
        else if (ac.equals(b5.getActionCommand())) {
                    
        ImageIcon icon2 = (ImageIcon)b5.getIcon();
            if (icon2.equals(corner)) {
                b5.setIcon(corner2);
            }
            else if (icon2.equals(corner2)) {
                b5.setIcon(corner3);
            }
            else if (icon2.equals(corner3)) {
                b5.setIcon(corner4);
            }
            else if (icon2.equals(corner4)) {
                b5.setIcon(corner);
            }
        }
        else if (ac.equals(b6.getActionCommand())) {
        
        ImageIcon icon = (ImageIcon)b6.getIcon();

            if (icon.equals(off)) {
                b6.setIcon(off2);
            }
            else if (icon.equals(off2)) {
                b6.setIcon(off3);
            }
            else if (icon.equals(off3)) {
                b6.setIcon(off4);
            }
            else if (icon.equals(off4)) {
                b6.setIcon(off);
            }
        }
        else if (ac.equals(b7.getActionCommand())) {
        
        ImageIcon icon = (ImageIcon)b7.getIcon();

            if (icon.equals(end)) {
                b7.setIcon(end2);
            }
            else if (icon.equals(end2)) {
                b7.setIcon(end3);
            }
            else if (icon.equals(end3)) {
                b7.setIcon(end4);
            }
            else if (icon.equals(end4)) {
                b7.setIcon(end);
            }
        }
        else if (ac.equals(b8.getActionCommand())) {
        
        ImageIcon icon2 = (ImageIcon)b8.getIcon();
            if (icon2.equals(multi)) {
                b8.setIcon(multi2);
            }
            else if (icon2.equals(multi2)) {
                b8.setIcon(multi3);
            }
            else if (icon2.equals(multi3)) {
                b8.setIcon(multi4);
            }
            else if (icon2.equals(multi4)) {
                b8.setIcon(multi);
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
        else if (ac.equals(b10.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b10.getIcon();

            if (icon.equals(flick)) {
                b10.setIcon(flick2);
            }
            else if (icon.equals(flick2)) {
                b10.setIcon(flick3);
            }
            else if (icon.equals(flick3)) {
                b10.setIcon(flick4);
            }
            else if (icon.equals(flick4)) {
                b10.setIcon(flick);
            }
            
        }
        else if (ac.equals(b11.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b11.getIcon();

            if (icon.equals(Foff)) {
                b11.setIcon(Foff2);
            }
            else if (icon.equals(Foff2)) {
                b11.setIcon(Foff3);
            }
            else if (icon.equals(Foff3)) {
                b11.setIcon(Foff4);
            }
            else if (icon.equals(Foff4)) {
                b11.setIcon(Foff);
            }
            
        }
        else if (ac.equals(b12.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b12.getIcon();

            if (icon.equals(wire)) {
                b12.setIcon(wire2);
            }
            else if (icon.equals(wire2)) {
                b12.setIcon(wire3);
            }
            else if (icon.equals(wire3)) {
                b12.setIcon(wire4);
            }
            else if (icon.equals(wire4)) {
                b12.setIcon(wire);
            }
            
        }
        else if (ac.equals(b13.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b13.getIcon();

            if (icon.equals(off)) {
                b13.setIcon(off2);
            }
            else if (icon.equals(off2)) {
                b13.setIcon(off3);
            }
            else if (icon.equals(off3)) {
                b13.setIcon(off4);
            }
            else if (icon.equals(off4)) {
                b13.setIcon(off);
            }
            
        }
        else if (ac.equals(b14.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b14.getIcon();

            if (icon.equals(bulb)) {
                b14.setIcon(bulb2);
            }
            else if (icon.equals(bulb2)) {
                b14.setIcon(bulb3);
            }
            else if (icon.equals(bulb3)) {
                b14.setIcon(bulb4);
            }
            else if (icon.equals(bulb4)) {
                b14.setIcon(bulb);
            }
        }
        else if (ac.equals(b15.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b15.getIcon();

            if (icon.equals(bulb)) {
                b15.setIcon(bulb2);
            }
            else if (icon.equals(bulb2)) {
                b15.setIcon(bulb3);
            }
            else if (icon.equals(bulb3)) {
                b15.setIcon(bulb4);
            }
            else if (icon.equals(bulb4)) {
                b15.setIcon(bulb);
            }
            
        }
        else if (ac.equals(b16.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b16.getIcon();

            if (icon.equals(wire)) {
                b16.setIcon(wire2);
            }
            else if (icon.equals(wire2)) {
                b16.setIcon(wire3);
            }
            else if (icon.equals(wire3)) {
                b16.setIcon(wire4);
            }
            else if (icon.equals(wire4)) {
                b16.setIcon(wire);
            }
            
        }
        else if (ac.equals(b17.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b17.getIcon();

            if (icon.equals(wire)) {
                b17.setIcon(wire2);
            }
            else if (icon.equals(wire2)) {
                b17.setIcon(wire3);
            }
            else if (icon.equals(wire3)) {
                b17.setIcon(wire4);
            }
            else if (icon.equals(wire4)) {
                b17.setIcon(wire);
            }
            
        }
        else if (ac.equals(b18.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b18.getIcon();

            if (icon.equals(Foff)) {
                b18.setIcon(Foff2);
            }
            else if (icon.equals(Foff2)) {
                b18.setIcon(Foff3);
            }
            else if (icon.equals(Foff3)) {
                b18.setIcon(Foff4);
            }
            else if (icon.equals(Foff4)) {
                b18.setIcon(Foff);
            }
            
        }
        else if (ac.equals(b19.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b19.getIcon();

            if (icon.equals(corner)) {
                b19.setIcon(corner2);
            }
            else if (icon.equals(corner2)) {
                b19.setIcon(corner3);
            }
            else if (icon.equals(corner3)) {
                b19.setIcon(corner4);
            }
            else if (icon.equals(corner4)) {
                b19.setIcon(corner);
            }
        }
        else if (ac.equals(b20.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b20.getIcon();

            if (icon.equals(bulb)) {
                b20.setIcon(bulb2);
            }
            else if (icon.equals(bulb2)) {
                b20.setIcon(bulb3);
            }
            else if (icon.equals(bulb3)) {
                b20.setIcon(bulb4);
            }
            else if (icon.equals(bulb4)) {
                b20.setIcon(bulb);
            }
            
        }
        else if (ac.equals(b21.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b21.getIcon();

            if (icon.equals(corner)) {
                b21.setIcon(corner2);
            }
            else if (icon.equals(corner2)) {
                b21.setIcon(corner3);
            }
            else if (icon.equals(corner3)) {
                b21.setIcon(corner4);
            }
            else if (icon.equals(corner4)) {
                b21.setIcon(corner);
            }
        }
        else if (ac.equals(b22.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b22.getIcon();

            if (icon.equals(wire)) {
                b22.setIcon(wire2);
            }
            else if (icon.equals(wire2)) {
                b22.setIcon(wire3);
            }
            else if (icon.equals(wire3)) {
                b22.setIcon(wire4);
            }
            else if (icon.equals(wire4)) {
                b22.setIcon(wire);
            }
            
        }
        else if (ac.equals(b23.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b23.getIcon();

            if (icon.equals(Fmulti)) {
                b23.setIcon(Fmulti2);
            }
            else if (icon.equals(Fmulti2)) {
                b23.setIcon(Fmulti3);
            }
            else if (icon.equals(Fmulti3)) {
                b23.setIcon(Fmulti4);
            }
            else if (icon.equals(Fmulti4)) {
                b23.setIcon(Fmulti);
            }
            
        }
        else if (ac.equals(b24.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b24.getIcon();

            if (icon.equals(wire)) {
                b24.setIcon(wire2);
            }
            else if (icon.equals(wire2)) {
                b24.setIcon(wire3);
            }
            else if (icon.equals(wire3)) {
                b24.setIcon(wire4);
            }
            else if (icon.equals(wire4)) {
                b24.setIcon(wire);
            }
            
        }
        else if (ac.equals(b25.getActionCommand())) {
            
        ImageIcon icon = (ImageIcon)b25.getIcon();

            if (icon.equals(corner)) {
                b25.setIcon(corner2);
            }
            else if (icon.equals(corner2)) {
                b25.setIcon(corner3);
            }
            else if (icon.equals(corner3)) {
                b25.setIcon(corner4);
            }
            else if (icon.equals(corner4)) {
                b25.setIcon(corner);
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
            ImageIcon a10 =(ImageIcon)b10.getIcon();
            ImageIcon a11 =(ImageIcon)b11.getIcon();
            ImageIcon a12 =(ImageIcon)b12.getIcon();
            ImageIcon a13 =(ImageIcon)b13.getIcon();
            ImageIcon a14 =(ImageIcon)b14.getIcon();
            ImageIcon a15 =(ImageIcon)b15.getIcon();
            ImageIcon a16 =(ImageIcon)b16.getIcon();
            ImageIcon a17 =(ImageIcon)b17.getIcon();
            ImageIcon a18 =(ImageIcon)b18.getIcon();
            ImageIcon a19 =(ImageIcon)b19.getIcon();
            ImageIcon a20 =(ImageIcon)b20.getIcon();
            ImageIcon a21 =(ImageIcon)b21.getIcon();
            ImageIcon a22 =(ImageIcon)b22.getIcon();
            ImageIcon a23 =(ImageIcon)b23.getIcon();
            ImageIcon a24 =(ImageIcon)b24.getIcon();
            ImageIcon a25 =(ImageIcon)b25.getIcon();
            
            if (a1.equals(corner) && a2.equals(wire) && a3.equals(bulb2) && a4.equals(wire) && a5.equals(corner2) && a6.equals(off4) && a7.equals(end4) && a8.equals(multi) && a9.equals(corner2) && a10.equals(flick4) && a11.equals(Foff4) && a12.equals(wire3) && a13.equals(off3) && a14.equals(bulb3) && a15.equals(bulb3) && a16.equals(wire4) && a18.equals(Foff4) && a19.equals(corner3) && a20.equals(bulb3) && a21.equals(corner4) && a22.equals(wire3) && a23.equals(Fmulti3) && a24.equals(wire3) && a25.equals(corner3)) {
                long finish = System.currentTimeMillis();
                long timeElapsed = finish - start;
                double time = timeElapsed;
                double fin = time/1000.0;
                String finstr = Double.toString(fin);
                
                JOptionPane.showMessageDialog(frame,"Success! It took you " + fin + " seconds to finish.");
                frame.dispose();
                double total = _3x3 + _3x4 + fin;
                
                String str1 = Double.toString(_3x3);
                String str2 = Double.toString(_3x4);
                String str3 = Double.toString(fin);
                String str4 = Double.toString(total);
                
                results sg=new results () {};
                sg.setFrame();
                sg.n1.setText(str1);
                sg.n2.setText(str2);
                sg.n3.setText(str3);
                sg.t.setText(str4);
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

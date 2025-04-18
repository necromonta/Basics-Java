package basics.raycast;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author anagy
 */
public class MyFrame extends JFrame implements KeyListener{
    DrawPanel panel;
    float angel;
    MyFrame(){
//        drawMap2D();
//      drawMap3D();
       
       frame();       
    }
    void frame(){
       panel=new DrawPanel();
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout(null);  
     this.setExtendedState(JFrame.MAXIMIZED_BOTH);
     this.setUndecorated(true);
     this.addKeyListener(this);
     this.setVisible(true); 
     this.getContentPane().add(panel);
    
    }
    
    @Override
    public void paint(Graphics g) {
       Graphics2D g2D=(Graphics2D) g;
       g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);
       g2D.clearRect(0,0,1920,1080);
       g2D.setStroke(new BasicStroke(5));
       g2D.setPaint(Color.red);
       g2D.drawLine(panel.getX(),panel.getY(),300,300);
    }
    
//    
//    void drawMap2D(){
//      
//        JPanel[][] visualMap=new JPanel[mapX][mapY];
//         for (int i = 0; i < mapX; i++) {
//            for (int j = 0; j < mapY; j++) {
//                visualMap[i][j]=new JPanel();
//                visualMap[i][j].setBounds(i*50, j*50, 200,200);
//                 
//                if (map[i][j]==1) {
//                  visualMap[i][j].setBackground(Color.black);
//                }else if(map[i][j]==2){
//                  visualMap[i][j].setBackground(Color.blue);
//                }else{
//                  visualMap[i][j].setBackground(Color.white);
//                }
//                this.add(visualMap[i][j]);
//            }
//        }
//        
//    }
//    
//    void drawMap3D(){
//       
//         JPanel[][] visualMap=new JPanel[mapX][mapY];
//         for (int i = 0; i < mapX; i++) {
//            for (int j = 0; j < mapY; j++) {
//                visualMap[i][j]=new JPanel();
//               
//                visualMap[i][j].setBounds(i*50+450, j*50, 200-calculatesDistance(2,3,i,j),200-calculatesDistance(2,3,i,j));
//                if (map[i][j]==1) {
//                  visualMap[i][j].setBackground(Color.black);
//                }else if(map[i][j]==2){
//                  visualMap[i][j].setBackground(Color.blue);
//                }else{
//                  visualMap[i][j].setBackground(Color.white);
//                }
//                
//                this.add(visualMap[i][j]);
//            }
//        }
//    }
//    
    int calculatesDistance(int px,int py,int x,int y){
       return Math.abs(px-x)+Math.abs(py-y);
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
      switch (e.getKeyChar()) {
            case 'a':
          
                  panel.setLocation(panel.getX()-5, panel.getY());
                  
               repaint();
                break;
            case 'd':
              panel.setLocation(panel.getX()+5, panel.getY());
               repaint();
          
                break;
            case 'w':

 panel.setLocation(panel.getX(), panel.getY()-5);

               repaint();
                break;
                
            case 's':
              panel.setLocation(panel.getX(), panel.getY()+5);
              
               repaint();
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
    class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.black);
         this.setBounds(500,450, 500,500);
         this.setBackground(Color.black);
         this.setOpaque(false);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
   
}

}

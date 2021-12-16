
package jframe;



import javax.swing.JFrame;


public class FrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 300);
        //frame.setLocationRelativeTo(null);
        frame.setBounds(500, 200, 500, 300);
        frame.setTitle("Shuvos Table");
        //frame.setResizable(false);
        
        
    }
    
}

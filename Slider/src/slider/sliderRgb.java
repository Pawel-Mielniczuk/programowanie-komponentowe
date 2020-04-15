/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author Paweł
 */
public class sliderRgb extends JFrame {
    JSlider redSlider, greenSlider, blueSlider;
    JLabel redLable, greenLable, blueLable;
    JPanel colorPanel, sliders, labels;
    
    public sliderRgb() {
        redSlider = new JSlider(JSlider.HORIZONTAL, 0,255,0);
        greenSlider = new JSlider(JSlider.HORIZONTAL, 0,255,0);
        blueSlider = new JSlider(JSlider.HORIZONTAL, 0,255,0);

        redLable = new JLabel("Red = 0");
        greenLable = new JLabel("Green = 0");
        blueLable = new JLabel("Blue = 0");
        
         
         
         colorPanel = new JPanel();
         colorPanel.setBackground(Color.BLACK);
         
         Container pane = this.getContentPane();
         pane.setLayout(new GridLayout(1,3,3,3));
         
         sliders = new JPanel();
         labels = new JPanel();
         
         pane.add(sliders);
         pane.add(labels);
         pane.add(colorPanel);
         
         sliders.setLayout(new GridLayout(3,1,2,2));
         sliders.add(redSlider);
         sliders.add(greenSlider);
         sliders.add(blueSlider);
         
         labels.setLayout(new GridLayout(3,1,2,2));
         labels.add(redLable);
         labels.add(greenLable);
         labels.add(blueLable);
         
    
    }
   
    
    public static void main(String[] args) {
	// write your code here
        sliderRgb slider = new sliderRgb();
        slider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        slider.setVisible(true);
        slider.setTitle("Color Picker");
        slider.setSize(300,200);
    }
}

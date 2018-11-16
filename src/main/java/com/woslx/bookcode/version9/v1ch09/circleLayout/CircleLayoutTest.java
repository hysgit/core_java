package com.woslx.bookcode.version9.v1ch09.circleLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.32 2007-06-12
 * @author Cay Horstmann
 */
public class CircleLayoutTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            @Override
            public void run()
            {
               JFrame frame = new CircleLayoutFrame();
               frame.setTitle("CircleLayoutTest");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}
package com.woslx.bookcode.version9.v1ch09.border;

import com.woslx.bookcode.version9.v1ch09.border.BorderFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.33 2007-06-12
 * @author Cay Horstmann
 */
public class BorderTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            @Override
            public void run()
            {
               JFrame frame = new BorderFrame();
               frame.setTitle("BorderTest");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

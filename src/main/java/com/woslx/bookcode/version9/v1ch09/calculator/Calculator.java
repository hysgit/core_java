package com.woslx.bookcode.version9.v1ch09.calculator;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.33 2007-06-12
 * @author Cay Horstmann
 */
public class Calculator
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            @Override
            public void run()
            {
               CalculatorFrame frame = new CalculatorFrame();
               frame.setTitle("Calculator");               
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

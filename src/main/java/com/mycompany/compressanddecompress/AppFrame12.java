/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compressanddecompress;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AppFrame12 extends JFrame implements ActionListener{
    JButton CompButton;
    JButton DecompButton;
    
    AppFrame12(){
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CompButton = new JButton("Click to CompressFile");
        CompButton.setBounds(80,150,200,30);
        CompButton.addActionListener(this);
        DecompButton = new JButton("Click to DecompressFile");
        DecompButton.setBounds(300,150,200,30);
        DecompButton.addActionListener(this);
        
        this.add(CompButton);
        this.add(DecompButton);
        this.setSize(600,400);
        this.setTitle("Compressor & Decompressor");
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==CompButton){
            JFileChooser filechooser = new JFileChooser();
            int res = filechooser.showSaveDialog(null);
            if(res==JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    Compress.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
                
            }
        }
        if(e.getSource()==DecompButton){
            JFileChooser filechooser = new JFileChooser();
            int res = filechooser.showSaveDialog(null);
            if(res==JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    Decompress.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
                
            }
        }
    }
    
}

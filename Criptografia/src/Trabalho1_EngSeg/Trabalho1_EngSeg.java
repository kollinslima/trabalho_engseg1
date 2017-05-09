/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1_EngSeg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kollins
 */
public class Trabalho1_EngSeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File inputFile = new File("inputText.txt");        
        File keyFile = new File("key.txt");
        
        String key;
        
        char[][] box1 = new char[8][8];
        char[][] box2 = new char[8][8];
                
        try {
            Writer outputFile = new FileWriter("outputFile");
            Scanner inputText = new Scanner(inputFile);
            Scanner readKey = new Scanner(keyFile);
            
            key = readKey.nextLine();               //Leitura da chave
            
            while(inputText.hasNextLine()){

                
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro na leitura do arquivo");
        } catch (IOException ex) {
            System.out.println("Erro na escrita do arquivo outputFile");
        }   
        
        
        
        
    }
    
}

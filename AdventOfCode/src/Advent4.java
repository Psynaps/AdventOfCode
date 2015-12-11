
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Gunn
 */
public class Advent4 {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner (new FileReader ("Advent3.txt"));
        int count = 0;
        while (reader.hasNextLine()){
            String s = reader.nextLine();
            ArrayList <Character> n = new ArrayList<Character>();
            }
        
        System.out.println(count);
    }
}

import java.io.FileReader;
import java.io.IOException;
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
public class Advent3 {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner (new FileReader ("Advent3.txt"));
        int count = 0;
        while (reader.hasNextLine()){
            String s = reader.nextLine();
            String [] n = s.split("x");
            int [] nums = {Integer.parseInt(n[0]), Integer.parseInt(n[1]), Integer.parseInt(n[2])};
            int s1 = nums[0]*nums[1];
            int s2 = nums[1]*nums[2];
            int s3 = nums[2]*nums[0];
            count+=(nums[0]*nums[1])*nums[2];
            if (s1<=s2&&s1<=s3){
                count+=nums[0]*2;
                count+=nums[1]*2;
            }
            else if (s2<=s1&&s2<=s3){
                count+=nums[1]*2;
                count+=nums[2]*2;
            }
            else {
                count+=nums[2]*2;
                count+=nums[0]*2;
            }
        }
        System.out.println(count);
    }
}
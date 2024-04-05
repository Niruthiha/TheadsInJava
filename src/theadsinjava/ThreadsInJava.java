/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theadsinjava;

/**
 *
 * @author nirut
 */
public class ThreadsInJava {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        FilePlayer fp = new FilePlayer();
        fp.play("C:\\Users\\nirut\\OneDrive\\Desktop\\Sounds\\do.wav");

        // Create and start threads
        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t2 = new Thread2();
        t2.start();
    }
}
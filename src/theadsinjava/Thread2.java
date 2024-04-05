/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theadsinjava;
 //for (int i = 1001; i <= 2000; i++)
/**
 *
 * @author nirut
 */
public class Thread2 extends Thread {
    
    @Override
    public void run() {
        try {
            FilePlayer fp = new FilePlayer();
            for (int i = 1; i <= 100; i++) {
                fp.play("C:\\Users\\nirut\\OneDrive\\Desktop\\Sounds\\do.wav");
                Thread1.sleep(1000);
                fp.play("C:\\Users\\nirut\\OneDrive\\Desktop\\Sounds\\mi.wav");
                Thread1.sleep(1000);
                fp.play("C:\\Users\\nirut\\OneDrive\\Desktop\\Sounds\\sol.wav");
                Thread1.sleep(1000);
                fp.play("C:\\Users\\nirut\\OneDrive\\Desktop\\Sounds\\si.wav");
                Thread1.sleep(1000);
                fp.play("C:\\Users\\nirut\\OneDrive\\Desktop\\Sounds\\do-octave.wav");
                
            }
        } catch (InterruptedException e) {
        }
    }
}
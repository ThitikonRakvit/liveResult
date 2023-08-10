/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liveresult;

import java.util.Scanner;

/**
 *
 * @author thiti
 */
public class LiveResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        People1 obj1 = new People1();
        People2 obj2 = new People2();
        HeadQuater obj = new HeadQuater();
        obj.register(obj1);
        obj.register(obj2);

        String data = "s";

        while (!data.equals("")) {
            Scanner kb = new Scanner(System.in);
            data = kb.nextLine();
            if (!data.equals("")) {
                obj.setSomeData(data);
            }
        }

    }

}

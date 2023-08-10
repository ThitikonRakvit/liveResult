/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liveresult;

/**
 *
 * @author thiti
 */
public class People1 implements MyObserver{
        @Override
    public void update(Source o) {
        System.out.println(((HeadQuater)o).getSomeData());
    }
}

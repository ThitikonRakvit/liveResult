/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liveresult;

import java.util.ArrayList;

/**
 *
 * @author thiti
 */
public class HeadQuater implements Source{
        private final ArrayList<MyObserver> list;
    private String someData;

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(String aData) {
	someData = aData;
	notifyObservers();
    }
    public String getSomeData() {
	return someData;
    }
    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
}

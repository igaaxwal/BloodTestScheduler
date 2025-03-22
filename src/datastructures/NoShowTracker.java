/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author igawa
 */
class NoShowTracker {
    private LinkedList<String> noShows = new LinkedList<>();
    
    public void addNoShow(String person) {
        if (noShows.size() == 5) {
            noShows.removeFirst();
        }
        noShows.add(person);
    }
    
    public List<String> getNoShows() {
        return new ArrayList<>(noShows);
    }
}
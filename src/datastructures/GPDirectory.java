/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author igawa
 */
class GPDirectory {
    private Map<String, String> gpDetails = new HashMap<>();
    
    public void addGP(String patient, String gpName) {
        gpDetails.put(patient, gpName);
    }
    
    public String getGP(String patient) {
        return gpDetails.getOrDefault(patient, "Unknown GP");
    }
}
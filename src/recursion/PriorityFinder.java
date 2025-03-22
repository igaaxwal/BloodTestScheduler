/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

import java.util.List;


/**
 *
 * @author igawa
 */

import models.Patient;
import java.util.List;

public class PriorityFinder {
    
    public static Patient findHighestPriority(List<Patient> patients, int index, Patient highest) {
        // Base case: If the index reaches the end of the list, return the highest found
        if (index >= patients.size()) {
            return highest;
        }

        Patient current = patients.get(index);
        
        // If highest is null or the current patient has a higher priority, update highest
        if (highest == null || current.compareTo(highest) < 0) {
            highest = current;
        }

        // Recursive call to check the next patient in the list
        return findHighestPriority(patients, index + 1, highest);
    }

    // Overloaded method for easier use (starts recursion with index 0)
    public static Patient findHighestPriority(List<Patient> patients) {
        if (patients == null || patients.isEmpty()) {
            return null;
        }
        return findHighestPriority(patients, 0, null);
    }
}

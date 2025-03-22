/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author igawa
 */

import models.Patient;
import datastructures.PriorityQueueADT;
import java.util.PriorityQueue;

public class BloodTestScheduler {
    private PriorityQueueADT<Patient> patientQueue;

    public BloodTestScheduler() {
        patientQueue = new PriorityQueueADT<>();
    }

    public void addPatient(String name) {
        // Assign random priority (1 = highest, 3 = lowest) for demo
        int priority = (int) (Math.random() * 3) + 1;
        Patient newPatient = new Patient(name, priority);
        patientQueue.enqueue(newPatient);
    }

    public String processNextPatient() {
        Patient nextPatient = patientQueue.dequeue();
        return (nextPatient != null) ? nextPatient.toString() : null;
    }
}





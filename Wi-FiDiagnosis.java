// Kevin Chen 
// Class: CMSC203 CRN 21558
// Instructor: Robert S. Alexander
// assignment(1)
// description(This program is Wi-Fi Diagnosis that help step by step to fix your internet)

import java.util.Scanner;

public class WiFiDiagnosis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object here

        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work. ");
        
        System.out.println("First step: reboot your computer ");
        
        System.out.print("Are you able to connect with the internet? (yes or no) ");
        
        String wifiDiagnosis = input.nextLine(); // input yes or no 
        
        if (wifiDiagnosis.equalsIgnoreCase("yes")){ // checks if yes
        
        System.out.println("rebooting the computer seemed to work ");
        
        } else { // if no moves to the next task
        
        System.out.println("Second step: reboot your router ");
            
        System.out.print("Are you able to connect with the internet? (yes or no) ");
        
        wifiDiagnosis = input.nextLine(); // input yes or no
        
        if (wifiDiagnosis.equalsIgnoreCase("yes")){ // checks if yes 
        
        System.out.println("Rebooting the router seemed to work ");
        
        } else { // if no moves to the next task
        
        System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power ");
            
        System.out.print("Are you able to connect with the internet? (yes or no) ");
        
        wifiDiagnosis = input.nextLine(); // input yes or no
        
        if (wifiDiagnosis.equalsIgnoreCase("yes")){ // checks if yes
        
        System.out.println("Plugging in your cables in firmly seemed to work ");
        
        } else { // if no moves to the next task
        
        System.out.println("Fourth step: move your computer closer to your router ");
            
        System.out.print("Are you able to connect with the internet? (yes or no) ");
        
        wifiDiagnosis = input.nextLine(); // input yes or no
        
        if (wifiDiagnosis.equalsIgnoreCase("yes")){ // checks if yes
        
        System.out.println("Moving your computer closer to your router seemed to work ");
        
        } else { // if no moves to the next task
        
        System.out.println("Fifth step: contact your ISP ");
            
        System.out.print("Are you able to connect with the internet? (yes or no) ");
        
        wifiDiagnosis = input.nextLine(); // input yes or no
        
        if (wifiDiagnosis.equalsIgnoreCase("yes")){ // checks if yes
        
        System.out.println("Contacting your ISP seemed to work ");
        
        } 
        }
        }
        }        
        } 
        System.out.println("Thanks for testing my program by Kevin Chen");
    }
}
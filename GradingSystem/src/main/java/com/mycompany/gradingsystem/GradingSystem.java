package com.mycompany.gradingsystem;

public class GradingSystem {

    public static void main(String[] args) {
        // TODO code application logic here 
        // Create an instance of the Login class
        Login_page LoginFrame = new Login_page();
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);//center
                

        // Make the login frame visible
        LoginFrame.setVisible(true);
    }
}

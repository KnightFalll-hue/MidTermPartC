/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class TestUserProfile {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        
        System.out.println("Please choose a genre from the following:");
        for (int i=0; i<4; i++)
        {
        System.out.println(UserProfile.genres[i]);
        }
        String userGenre = scanner.nextLine();
        
        UserProfile UserProfile = new UserProfile(userName, userGenre);
        
        System.out.println("An account with the following User Name and faverite moive genre has been created:");
        System.out.println(UserProfile.getUserID());
        System.out.println(UserProfile.getGenre());
    }
}


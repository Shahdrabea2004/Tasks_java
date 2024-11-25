package Main;

import java.net.Socket;
import java.util.Scanner;

import Main.OOP_8.Facebook;
import Main.OOP_8.LinkedIn;

public class Main
{

    public static void main(String[] args) {
        //OOP_8
        
        Facebook facebook=new Facebook("0", "0", "0");
        LinkedIn linkedIn=new LinkedIn("0", "0", "0");

        facebook.postDetails();
        linkedIn.postDetails();
        
        

    }
}

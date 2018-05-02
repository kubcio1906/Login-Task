package pl.Akademia.Kodu;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Scanner;

public class Login {
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loigin:");
        String login = (scanner.nextLine());
        System.out.println("Password:");
        String password = scanner.nextLine();
        DBConnection.connect();
        if(DBConnection.authentic(login,password)){
            System.out.println("jest git");
        }else{
            System.out.println("error");
        }

    }
}

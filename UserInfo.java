
package com.mycompany.userinfo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * Bryce Beeskow
 * Discussion 5
 */

//UserInfo class
public class UserInfo implements Serializable{
    public String name;
    public int age;
    public transient String password;
    
    
    
    public static void main(String[] args) throws IOException {
        //creating a user
        UserInfo user1 = new UserInfo();
        user1.name = "Cassidy";
        user1.age = 26;
        user1.password = "DaisyTheDog";
        
        UserInfo user2 = new UserInfo();
        user2.name = "Bryce";
        user2.age = 25;
        user2.password = "123456";
        
        
        //
        try{
            FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user1);
            out.writeObject(user2);
            out.close();
            fileOut.close();
        
            System.out.println("Object serialized and saved in userInfo.ser ");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
    

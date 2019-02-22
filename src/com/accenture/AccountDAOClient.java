package com.accenture;

import java.util.List;

public class AccountDAOClient {

    public static void main(String[] args) {
        AccountDAO obj = new AccountDAOImpl();

        try {
            Account account = obj.findAccount("1");

            //Test1 - Type code to test findAccount("1")

            List list = obj.findAccount("J", "D");
            //Test2 - Type code to test findAccount("J","D"). How many records do you get?

//            obj.insertAccount("6", "Sasha", "Kohli", "sasha.kohli@gmail.com", 90000);
            //Test3 - Type code to test insertAccount("6","Sasha","Kohli","sasha.kohli@gmail.com",90000)


            obj.deposit("1", 2000);
            //Test4 - Type code to test deposit("1",2000)


            obj.deposit("2", 3000);
            //Test5 - Type code to test deposit("2",3000)

            obj.deleteAccount("6");
            //Test6 - Type code to test deleteAccount("6")



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

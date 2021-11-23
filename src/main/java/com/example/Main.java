package com.example;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        new Thread(()->{
            try
            {
                Desktop.getDesktop().open(new File(Main.class.getResource("/blank.jpg").getPath()));
            } catch (IOException e)
            {
                System.out.println("oopse");
            }
        }).start();
    }
}

package com.expleo.project4;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Toest
{

    public static void main(String[] args) throws SQLException, InterruptedException, IOException {

        runMavenCommands();
        Thread.sleep(25000);
        runCopyFilesbatch();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("taskkill /f /im cmd.exe");

    }

    public static void runMavenCommands() throws InterruptedException {
        ProcessBuilder pd = new ProcessBuilder("cmd","/c","Start","mavenCommands.bat");
        String userprofile = System.getenv("USERPROFILE");
        System.out.println("User Profile "+userprofile);
        File dir = new File(userprofile+"\\Desktop\\JhbGrads201905_ProjectDay4_Thuhlo\\");

        try
        {
            pd.directory(dir);
            Process p = pd.start();
            System.out.println("Maven Commands - True");
        }
        catch (IOException e)
        {
            System.out.println("Maven Commands - False");
        }
    }

    public static void runCopyFilesbatch()
    {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c","Start", "batch.bat");
        String userprofile = System.getenv("USERPROFILE");
        File dir = new File(userprofile+"\\Desktop\\JhbGrads201905_ProjectDay4_Thuhlo\\");

        try
        {
            pb.directory(dir);
            Process p = pb.start();
            System.out.println("Copy Files - True");
        }
        catch (IOException e)
        {
            System.out.println("Copy Files - False");
        }
    }
}

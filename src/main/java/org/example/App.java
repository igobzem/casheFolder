package org.example;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class App
{

    public static void main( String[] args )
    {
        final String cashe = "cashe";
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(cashe);
            }
        };

        // store all names with same name
        // with/without extension
        File directory = new File("c:/work");
        File[] flist = directory.listFiles(filter);

        // Empty array
        if (flist == null) {
            System.out.println(
                    "Empty directory or directory does not exists.");
        }
        else {

            // Print all files with same name in directory
            // as provided in object of MyFilenameFilter
            // class
            for (File file : flist) {
                System.out.println(file);
                System.out.print("rename to cashe? Y/N:");
                try {
                    byte[] b = new byte[1];
                    System.in.read(b);
                    System.in.read();
                    if (b[0] == 'Y') {
                        System.out.println("try...");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

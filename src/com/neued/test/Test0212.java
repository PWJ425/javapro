package com.neued.test;

import java.io.*;

public class Test0212 {
    public static void main(String[] args) {
        File file = new File("d:\\Test,java");
        /*System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.getPath());
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
     /*   try {
            OutputStream outputStream=new FileOutputStream(file,true);
            String a="\n11111111111";
            outputStream.write(a.getBytes());
            outputStream.flush();
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        InputStream inputStream=null;
        try {
            inputStream=new FileInputStream(file);
            byte[] a=new byte[10];
            int b=inputStream.read(a);
            while (b!=-1){
                System.out.println("读取的字节数"+b);

                System.out.println(new String(a,0,b));
                b=inputStream.read(a);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(inputStream!=null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

package eapli.base;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TXTFile {
    String path = "eapli.base\\base.core\\src\\main\\java\\eapli\\base\\FileToWriteAndRead.txt";


    public void write(String content) {
        try {
            FileWriter fw = new FileWriter(path);
            fw.write(content);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success");
    }

    public void read() throws IOException {
        FileReader fr = new FileReader(path);
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
        fr.close();
    }

    public String readVerificationTypeOfDataAndContent(String path) throws FileNotFoundException {
        File clientFile = new File(path);
        Scanner scanClient = new Scanner(clientFile);
        String[] column;
        String typeofData;

        while (scanClient.hasNextLine()) {
            column = scanClient.nextLine().split(";");
            typeofData = column[0];

            if (typeofData.equals("String") | typeofData.equals("string") | typeofData.equals("STRING")) {
                String content = column[1];
                return ("Ok" + " " + content);
            }

            if (typeofData.equals("Boolean") | typeofData.equals("boolean") | typeofData.equals("BOOLEAN")) {
                boolean content = Boolean.parseBoolean(column[1]);
                return "Ok" + " " + content;
            }

            if (typeofData.equals("Integer") | typeofData.equals("integer") | typeofData.equals("INTEGER") |
                    typeofData.equals("Int") | typeofData.equals("int") | typeofData.equals("INT")) {
                int content = Integer.parseInt(column[1]);
                return "Ok" + " " + content;
            }

            else return "NotOk";
        }
        return "NotOk";
    }
}

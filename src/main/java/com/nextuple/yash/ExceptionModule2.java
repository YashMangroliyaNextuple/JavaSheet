package com.nextuple.yash;

import com.nextuple.yash.exceptions.CanNotFindFile;
import com.nextuple.yash.exceptions.FileNotExist;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

class FileReader
{
    public File openFile(String fileName) throws FileNotExist {
        File file = new File(fileName);
        if(!file.exists())
        {
            throw new FileNotExist();
        }
        return file;
    }

    public void showFileProperties(String fileName) throws CanNotFindFile
    {
        try{
            String line;
            int charCount=0,wordCount=0;
            File file=openFile(fileName);
            RandomAccessFile randomAccessFile=new RandomAccessFile(file,"r");
            while(randomAccessFile.getFilePointer()<randomAccessFile.length())
            {
                line=randomAccessFile.readLine();
                for(int i=0;i<line.length();i++)
                {
                    if(line.charAt(i)!=' ') charCount++;
                    else {
                        if(line.charAt(i)==' ' && i+1<line.length() && line.charAt(i+1)!=' ')
                        {
                            wordCount++;
                        }
                    }
                }
                if(line.charAt(line.length()-1)!=' ') wordCount++;
            }
            System.out.println("Number of words: "+wordCount);
            System.out.println("Number of characters: "+charCount);
        }catch(FileNotExist fne)
        {
            throw new CanNotFindFile("Can not find "+fileName);
        }catch(Exception e)
        {
            throw new CanNotFindFile(e.getMessage());
        }
    }
}



public class ExceptionModule2 {
    public static void main(String[] args) {
        FileReader fileReader=new FileReader();
        try {
            fileReader.showFileProperties("src/main/java/com/nextuple/yash/configFiles/essay.txt");
        }catch(CanNotFindFile e)
        {
            System.out.println(e.getMessage());
        }
    }
}

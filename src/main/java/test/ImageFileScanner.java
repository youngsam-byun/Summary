package test;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by byun.ys on 2017-01-18.
 */
public class ImageFileScanner{


     @Test
    public  void test(){

         find("d:/");

         for(String s:images)
             System.out.println(s);


    }

    private static final String JPG="jpg";
    private static final String PNG="png";
    private static final String GIF="gif";

    private static List<String> images;

    public ImageFileScanner(){
        images=new ArrayList<String>();
    }

    public void find(String path){

        //preconditional check
        if(path==null || path.isEmpty())
            return;

        //read current directory
        File directory = new File(path);

        if(directory.isDirectory()==false)
            return;

        //get files
        File[] files=directory.listFiles();
        if(files==null)
            return;

        List<String> subDirectories=new ArrayList<>();

        //extension check
        for(File f:files){

            if(f.isDirectory()) {
                subDirectories.add(f.getAbsolutePath());
                continue;
            }

            String fileName=f.getName();
            int index=fileName.lastIndexOf(".");
            if(index<0)
                continue;

            String ext=fileName.substring(index+1);

            if(ext.toLowerCase().equals(PNG)||
                    ext.toLowerCase().equals(JPG)||
                    ext.toLowerCase().equals(GIF))
                images.add(f.getAbsolutePath());
        }



        //null check
        if(subDirectories ==null || subDirectories.size()==0)
            return;

        //recursive call to the end
        for(String d:subDirectories)
            find(d);

    }

}

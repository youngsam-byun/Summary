package file;

import org.junit.Test;

import java.io.*;

/**
 * Created by YS on 2017-01-13.
 */
public class FileReadWriteTest {

    @Test
    public void readTest() throws IOException {

        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(""));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

    }

    @Test
    public void writeTest() throws IOException {
        BufferedWriter bw = null;
        String message = null;
        try {
            bw = new BufferedWriter(new FileWriter(""));
            bw.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bw.close();
        }


    }

    @Test
    public void filereadByByte() {

        FileReader fr = null;
        BufferedReader br = null;
        int b = -1;
        try {
            br = new BufferedReader(fr = new FileReader("c:\\test.txt"));
            while ((b = br.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }

    }

    @Test
    public void readWriteTogetherTest()  {


        FileReader fr = null;
        BufferedReader br = null;
        String line = null;
        int b = -1;

        FileWriter fw = null;
        BufferedWriter bw = null;
        int off=0;
        try {
            br = new BufferedReader(fr = new FileReader("c:\\test.txt"));
            bw = new BufferedWriter(fw = new FileWriter("C:\\Users\\YS\\Downloads\\test2.txt"));
            while ((b = br.read()) != -1) {

                bw.write(b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                fw.close();

                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}


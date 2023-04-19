package unlimited;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Whatsapp {


        public static void main(String[] args) throws AWTException, InterruptedException {

            Scanner sc=new Scanner(System.in);
            System.out.println("enter ypur massage");
            String msg=sc.nextLine();
            System.out.println("how many times u wanna send massage ");
            int size=sc.nextInt();

            StringSelection stringSelection=new StringSelection(msg);
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection,null);
            Thread.sleep(6000);
            Robot robot=new Robot();
            for(int i=0;i<size;i++){
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);

                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(3000);
            }




        }






}

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

/*
    public void KeyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        System.out.println("kukk");
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            System.out.println(handler.object.get(i));
            if (tempObject.getId() == ID.Guttebass) {
                if(key == KeyEvent.VK_W) {
                    handler.setUp(true);
                    System.out.println("up");
                }
                if(key == KeyEvent.VK_S) {
                    handler.setDown(true);
                    System.out.println("down");
                }
                if(key == KeyEvent.VK_A) {
                    handler.setLeft(true);
                    System.out.println("left");
                }
                if(key == KeyEvent.VK_D) {
                    handler.setRight(true);
                    System.out.println("right");
                }
            }
        }
    }

    public void KeyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Guttebass) {
                if(key == KeyEvent.VK_W) handler.setUp(false);
                if(key == KeyEvent.VK_S) handler.setDown(false);
                if(key == KeyEvent.VK_A) handler.setLeft(false);
                if(key == KeyEvent.VK_D) handler.setRight(false);
            }
        }
    }
    */

}

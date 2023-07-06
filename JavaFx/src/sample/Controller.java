package sample;

import com.sun.webkit.ContextMenu;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    public TextField TextEnter;
    public TextField TextEnter2;
    public Label text;


    public void useButton(){
        String proverkaLogin;
        String proverkaPass;

        proverkaLogin = TextEnter.getText();
        proverkaPass = TextEnter2.getText();

        if (proverkaLogin.length() == 0) {
            text.setText("Логин введен не правильно!");
        }

        if (proverkaPass.length() == 0){
            text.setText("Пароль введен не правильно!");
        }




    }

}

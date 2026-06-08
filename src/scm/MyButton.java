package scm;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {

    public MyButton(String text) {
        super(text);

        setFont(new Font("맑은 고딕", Font.BOLD, 24));
        setFocusPainted(false);
    }
}
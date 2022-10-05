package com.archiver.task.task1.task2.listeners;

import com.archiver.task.task1.task2.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;

public class TextEditMenuListener implements MenuListener {
    private View view;

    public TextEditMenuListener(View view) {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent e) {
JMenu source = (JMenu) e.getSource();
Component[] components = source.getMenuComponents();
        for (Component component: components) {
            component.setEnabled(view.isHtmlTabSelected());
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {
       
    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}

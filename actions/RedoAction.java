package com.archiver.task.task1.task2.actions;

import com.archiver.task.task1.task2.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {
   private View view;

    public RedoAction(View view){
        this.view = view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
view.redo();
    }
}

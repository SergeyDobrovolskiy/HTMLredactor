package com.archiver.task.task1.task2.actions;

import com.archiver.task.task1.task2.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UndoAction extends AbstractAction {
    private View view;
    
    public UndoAction(View view){
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        view.undo();
    }
}

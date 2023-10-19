package com.codewithmosh;

import com.codewithmosh.command.BlackAndWhiteCommand;
import com.codewithmosh.command.Button;
import com.codewithmosh.command.CompositeCommand;
import com.codewithmosh.command.ResizeCommand;
import com.codewithmosh.command.editor.BoldCommand;
import com.codewithmosh.command.editor.HtmlDocument;
import com.codewithmosh.command.editor.UndoCommand;
import com.codewithmosh.command.fx.AddCustomerCommand;
import com.codewithmosh.command.fx.CustomerService;
import com.codewithmosh.command.editor.History;
import com.codewithmosh.strategy.HighContrastFilter;
import com.codewithmosh.strategy.ImageStore;
import com.codewithmosh.strategy.JpegCompressor;
import com.codewithmosh.templateMethod.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}

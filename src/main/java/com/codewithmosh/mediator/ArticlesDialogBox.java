package com.codewithmosh.mediator;

public class ArticlesDialogBox extends DialogBox{

   private ListBox articlesListBox = new ListBox(this);
   private TextBox titleTextBox = new TextBox(this);
   private Button saveButton = new Button(this); 

    @Override
    public void changed(UIControl control) {
        if(control == articlesListBox){
            articleSelected();
        }else if(control == titleTextBox){
            titleChanged();
        }
    }


    public void simulateUserInreaction(){
        articlesListBox.setSelection("Articule 1");
        titleTextBox.setContent("");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());

    }

    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.enabled(true);
    }
    
    private void titleChanged(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.enabled(!isEmpty);
    }
    
}

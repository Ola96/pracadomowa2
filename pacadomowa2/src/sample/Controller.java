package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

    public class Controller {

        public RadioButton przycisk1;
        public RadioButton przycisk2;
        public RadioButton przycisk3;
        public Label label;
        public ToggleGroup toggleGroup;



        public void handleClick(ActionEvent actionEvent) {
            if (przycisk1.isSelected()) {
                label.setText(przycisk1.getText());}
            if (przycisk2.isSelected()) {
                label.setText(przycisk2.getText());}
            if (przycisk3.isSelected()) {
                label.setText(przycisk3.getText());}
                   }


    }


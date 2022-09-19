package com.example.f22comp1011s1w1;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CreateSongController implements Initializable {

    @FXML
    private ComboBox<Artist> artistComboBox;

    @FXML
    private ComboBox<String> genreComboBox;

    @FXML
    private TextField lengthTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Spinner<Integer> yearSpinner;

    @FXML
    void createSong(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Artist artist1 = new Artist("Alfred","Jackson", LocalDate.of(1987,10,11));
        Artist artist2 = new Artist("Jack","Johnson", LocalDate.of(1997,01,8));

        artistComboBox.getItems().add(artist1);
        artistComboBox.getItems().add(artist2);

        genreComboBox.getItems().addAll(Song.getGenres());

//        LengthChangeListener lcl = new LengthChangeListener();
        //This is a lambda expression
        lengthTextField.textProperty().addListener((observableValue, oldValue, newValue) -> {
            try{
                Integer.parseInt(newValue);
            }catch (Exception e)
            {
                lengthTextField.setText(oldValue);
            }
        });
    }
}

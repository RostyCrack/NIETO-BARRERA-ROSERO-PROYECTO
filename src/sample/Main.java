package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    Stage window;
    TableView<Persona> table;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ColombianRiot");

        //Name Column
        TableColumn<Persona, String> nameColumn= new TableColumn<>("name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));


        //Death Column
        TableColumn<Persona, String> deathColumn= new TableColumn<>("death");
        deathColumn.setMinWidth(100);
        deathColumn.setCellValueFactory(new PropertyValueFactory<>("death"));

        //Age Column
        TableColumn<Persona, Double> ageColumn= new TableColumn<>("age");
        ageColumn.setMinWidth(200);
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));



        table = new TableView<>();
        table.setItems(getPersona());
        table.getColumns().addAll(nameColumn, deathColumn, ageColumn);

        VBox vBox = new VBox();
        vBox.getChildren().add(table);

        Scene scene = new Scene (vBox);
        window.setScene(scene);
        window.show();

    }

    //Get ALL People
    public ObservableList<Persona> getPersona() {
        ObservableList<Persona> personas = FXCollections.observableArrayList();
        personas.add(new Persona("Julian", "gas lacrimogeno",20));
        personas.add(new Persona("Miguel", "perdida de ojo",27));
        personas.add(new Persona("Juan", "disparo",23));
        personas.add(new Persona("Sebastian", "caida",28));
        personas.add(new Persona("Pablo", "gas lacrimogeno",26));
        personas.add(new Persona("Julian", "gas lacrimogeno",29));
        personas.add(new Persona("Maria", "Abuso Policial",33));
        personas.add(new Persona("Juliana", "choque de automovil",50));
        personas.add(new Persona("Jose", "gas lacrimogeno",19));
        return personas;
    }



}

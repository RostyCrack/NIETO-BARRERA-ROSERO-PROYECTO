package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Stack;


public class Main extends Application {

    Stage window;
    TableView<Persona> table;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Reporte De Personas Desaparecidas");
        //Columna nombre
        TableColumn<Persona, String> nameColumn = new TableColumn<>("Nombre");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Nombre"));

        //Columna apellido
        TableColumn<Persona, String> lastNameColumn = new TableColumn<>("Apellido");
        nameColumn.setMinWidth(100);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Apellido"));

        //Columna Causa
        TableColumn<Persona, String> deathColumn = new TableColumn<>("Causa de muerte");
        nameColumn.setMinWidth(100);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Causa de muerte"));

        table = new TableView<>();
        table.setItems(getPersona());
        table.getColumns().addAll(nameColumn, lastNameColumn, deathColumn);


        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);

        Scene scene = new Scene(vBox, 400, 400);
        window.setScene(scene);
        window.show();
    }

    public ObservableList<Persona> getPersona(){
        ObservableList<Persona> personas = FXCollections.observableArrayList();
        personas.add(new Persona("Cristian", "Rosero", "Por mkon"));
        personas.add(new Persona("Samu", "Barrera", "Por mkon"));
        personas.add(new Persona("Lukas", "Nieto", "Por mkon"));
        personas.add(new Persona("Mia", "Lacouture", "Por hp"));
        return personas;
    }
}

package PRAKTIKUM6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tabelMahasiswa = new TableView<>();

        TableColumn<Mahasiswa, Integer> kolomId = new TableColumn<>("ID");
        kolomId.setCellValueFactory(new PropertyValueFactory<>("id"));
        kolomId.setPrefWidth(80);

        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama Lengkap");
        kolomNama.setCellValueFactory(new PropertyValueFactory<>("namaLengkap"));
        kolomNama.setPrefWidth(250);

        TableColumn<Mahasiswa, String> kolomNim = new TableColumn<>("Nomor Induk");
        kolomNim.setCellValueFactory(new PropertyValueFactory<>("nomorInduk"));
        kolomNim.setPrefWidth(200);

        tabelMahasiswa.getColumns().addAll(kolomId, kolomNama, kolomNim);

        ObservableList<Mahasiswa> dataMahasiswa = FXCollections.observableArrayList(
            new Mahasiswa(1, "Natalie Grace Katiandagho", "2310817120003"),
            new Mahasiswa(2, "Siapa Hayo", "2310817120077"),
            new Mahasiswa(3, "Ini Terserah", "2310817120017"),
            new Mahasiswa(4, "Ga Tau Siapa", "2310817120991"),
            new Mahasiswa(5, "Haha Hihi", "2310817120992"),
            new Mahasiswa(6, "Kuku Kaki", "2310817121573"),
            new Mahasiswa(7, "Siapa Namanya", "2310817110011"),
            new Mahasiswa(8, "Dimana Rumahnya", "2310817198722"),
            new Mahasiswa(9, "Hoho Hehe", "2310817128763"),
            new Mahasiswa(10, "Koko Cece Titi", "2310817127074")
        );

        tabelMahasiswa.setItems(dataMahasiswa);

        VBox layout = new VBox(tabelMahasiswa);

        Scene scene = new Scene(layout, 500, 300);
        primaryStage.setTitle("Daftar Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

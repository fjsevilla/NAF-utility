/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.controller;

import com.nafsolver.bd.dao.ArckceDAO;
import com.nafsolver.bd.dao.ArckctDAO;
import com.nafsolver.bd.dao.ArckmcDAO;
import com.nafsolver.bd.dao.ArcktbDAO;
import com.nafsolver.bd.dao.ArcktdDAO;
import com.nafsolver.entity.Arckce;
import com.nafsolver.entity.Arckct;
import com.nafsolver.entity.Arckmc;
import com.nafsolver.entity.Arcktb;
import com.nafsolver.entity.Arcktd;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * FXML Controller class
 *
 * @author Admin
 */
@Controller
public class GenericTablePanelController implements Initializable {

    @Autowired
    ArckceDAO dao;

    @Autowired
    ArckctDAO companiDao;
    @Autowired
    ArcktdDAO tipoDocDao;
    @Autowired
    ArckmcDAO tipoCtaDao;
    @Autowired
    ArcktbDAO tipoBcoDao;

    @FXML
    TableView upperTable;

    @FXML
    TableColumn<Arckce, String> noCia;
    @FXML
    TableColumn<Arckce, String> noCta;
    @FXML
    TableColumn<Arckce, String> noSec;
    @FXML
    TableColumn<Arckce, BigDecimal> monto;
    @FXML
    TableColumn<Arckce, String> beneficiario;
    @FXML
    TableColumn<Arckce, String> autoriza;
    @FXML
    TableColumn<Arckce, Integer> noCheque;
    @FXML
    Button btnReset;
    @FXML
    Button btnOk;
    @FXML
    TextField txtSeq;
    @FXML
    TextField txtCheq;
    @FXML
    ComboBox cmbCia;
    @FXML
    ComboBox cmbTipo;
    @FXML
    ComboBox cmbCta;

    private String selectedCia = "";
    private String selectedTipo = "";
    private String selectedCta = "";

    String[] columnNames = {"NoCia", "NoSecuencia", "NoCta", "Fecha", "Monto", "Autoriza"};

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        noCta.setCellValueFactory(new PropertyValueFactory("noCta"));
        noCia.setCellValueFactory(new Callback<CellDataFeatures<Arckce, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<Arckce, String> param) {
                String compani = companiDao.findById(param.getValue().getId().getNoCia()).get().getDescrip();
                return new SimpleStringProperty(compani);
            }
        });
        noSec.setCellValueFactory(new Callback<CellDataFeatures<Arckce, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<Arckce, String> param) {
                return new SimpleStringProperty(String.valueOf(param.getValue().getId().getNoSecuencia()));
            }
        });
        autoriza.setCellValueFactory(new PropertyValueFactory("autoriza"));
        beneficiario.setCellValueFactory(new PropertyValueFactory("beneficiario"));
        noCheque.setCellValueFactory(new PropertyValueFactory("cheque"));
        monto.setCellValueFactory(new PropertyValueFactory("monto"));

        ObservableList<Arckct> ciaList = observableArrayList(companiDao.findAll());
        //cmbCia.setCellFactory(new PropertyValueFactory("descrip"));
        StringConverter<Arckct> converter = new StringConverter<Arckct>() {
            @Override
            public String toString(Arckct object) {
                return object.getNoCia() + " - " + object.getDescrip();
            }

            @Override
            public Arckct fromString(String string) {
                return null;
            }
        };
        cmbCia.setConverter(converter);

        cmbCia.setItems(ciaList);
        
        fillCombos();
        formatNumerics();
        initTable();
    }

    @FXML
    public void formatNumerics() {
        UnaryOperator<Change> integerFilter = change -> {
            String newText = change.getControlNewText();
            if (newText.matches("-?([1-9][0-9]*)?")) {
                return change;
            }
            return null;
        };

        txtSeq.setTextFormatter(new TextFormatter<>(new IntegerStringConverter(), 0, integerFilter));
        txtCheq.setTextFormatter(new TextFormatter<>(new IntegerStringConverter(), 0, integerFilter));

        txtSeq.clear();
        txtCheq.clear();
    }

    @FXML
    public void initTable() {
        upperTable.getItems().clear();
        ObservableList<Arckce> lista = observableArrayList(dao.findAll());

        if (lista.isEmpty() || lista.get(0) == null) {
            System.out.println("Lista Vacia");

        } else {
            System.out.println("********** Lista con " + lista.size() + " elementos ***********");
        }
        upperTable.setItems(lista);
    }

    @FXML
    public void fillCombos() {
        ObservableList<Arcktd> tipoList;
        ObservableList<Arckmc> ctaList;
        
        if (!selectedCia.isEmpty()) {
            tipoList = observableArrayList(tipoDocDao.findByNoCia(selectedCia));
            ctaList = observableArrayList(tipoCtaDao.findByNoCia(selectedCia));
        } else {
            tipoList = observableArrayList(tipoDocDao.findAll());
            ctaList = observableArrayList(tipoCtaDao.findAll());
        }
        //cmbCia.setCellFactory(new PropertyValueFactory("descrip"));
        StringConverter<Arcktd> tipoConverter = new StringConverter<Arcktd>() {
            @Override
            public String toString(Arcktd object) {
                return object.getTipoMov() + " - " + object.getDescrip();
            }

            @Override
            public Arcktd fromString(String string) {
                return null;
            }
        };
        cmbTipo.setConverter(tipoConverter);

        cmbTipo.getItems().clear();
        cmbTipo.setItems(tipoList);

        //cmbCia.setCellFactory(new PropertyValueFactory("descrip"));
        StringConverter<Arckmc> ctaConverter = new StringConverter<Arckmc>() {
            @Override
            public String toString(Arckmc object) {
                String bco = "";
                Optional o = tipoBcoDao.findById(object.getBanco());
                if (o.isPresent()) {
                    bco = ((Arcktb) o.get()).getDescrip();
                }
                return bco + " - " + object.getId().getNoCta();
            }

            @Override
            public Arckmc fromString(String string) {
                return null;
            }
        };
        cmbCta.setConverter(ctaConverter);

        cmbCta.getItems().clear();
        cmbCta.setItems(ctaList);
    }

    @FXML
    public void okAction(ActionEvent actionEvent) {
        ObservableList<Arckce> lista;
        Integer noSeq = 0;
        Integer noCheq = 0;
        selectedCia = cmbCia.getValue()!=null?((Arckct) cmbCia.getValue()).getNoCia():null;
        selectedTipo = cmbTipo.getValue()!=null?((Arcktd) cmbTipo.getValue()).getId().getTipoDoc():null;
        selectedCta = cmbCta.getValue()!=null?((Arckmc) cmbCta.getValue()).getId().getNoCta():null;

        if (!txtSeq.getText().trim().isEmpty()) {
            noSeq = Integer.valueOf(txtSeq.getText());
        }
        if (!txtCheq.getText().trim().isEmpty()) {
            noCheq = Integer.valueOf(txtCheq.getText());
        }
        

        lista = observableArrayList(dao.findByCriteria(selectedCia, noSeq, 
            selectedCta, noCheq, selectedTipo));
            
            
        upperTable.getItems().clear();
        upperTable.setItems(lista);
    }

    @FXML
    public void resetAction(ActionEvent actionEvent) {
        txtSeq.clear();
        txtCheq.clear();
        selectedCia = "";
        selectedTipo = "";
        selectedCta = "";
        
        cmbCia.setValue(null);
        fillCombos();
        initTable();
    }

    @FXML
    public void selectedCia(ActionEvent e) {
        selectedCia = ((Arckct) cmbCia.getValue()).getNoCia();
        fillCombos();
    }

}

package com.nafsolver;

import com.nafsolver.bd.services.ArccmcDaoImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class NafRestServerApplication extends Application{// implements CommandLineRunner {

    private ConfigurableApplicationContext springContext;
    private Parent rootNode;
    private FXMLLoader fxmlLoader;
    @Autowired
    DataSource dataSource;

    @Autowired
    ArccmcDaoImpl dao;

    public static void main(String[] args) {
        launch(args);
        //SpringApplication.run(NafRestServerApplication.class, args);
    }
/*
    @Transactional(readOnly = true)
    @Override
    public void run(String... args) throws Exception {
        //ArccmcDaoImpl dao = new ArccmcDaoImpl();

        System.out.println("DATASOURCE = " + dataSource);
        String mc = dao.getById("01", "J405966327");
        //System.out.println("Nombre: "+mc.getNombre()+"\nDireccion: "+ mc.getDireccion());
        System.out.println(mc);
        System.exit(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void start(Stage primaryStage) throws Exception {
        fxmlLoader.setLocation(getClass().getResource("/fxml/GenericTablePanel.fxml"));
        rootNode = fxmlLoader.load();

        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(rootNode, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(NafRestServerApplication.class);
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(springContext::getBean);
    }

    @Override
    public void stop() {
        springContext.stop();
    }

}

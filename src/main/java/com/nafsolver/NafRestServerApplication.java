package com.nafsolver;

import com.nafsolver.bd.services.ArccmcDaoImpl;
import com.nafsolver.entity.Arccmc;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class NafRestServerApplication implements CommandLineRunner{
     @Autowired
    DataSource dataSource;
    
    @Autowired
ArccmcDaoImpl dao;

	public static void main(String[] args) {
           SpringApplication.run(NafRestServerApplication.class, args);
	}

    @Transactional(readOnly = true)
    @Override
    public void run(String... args) throws Exception {
            //ArccmcDaoImpl dao = new ArccmcDaoImpl();
            
            
        System.out.println("DATASOURCE = " + dataSource);
        String mc =  dao.getById("01", "J405966327");
        //System.out.println("Nombre: "+mc.getNombre()+"\nDireccion: "+ mc.getDireccion());
        System.out.println(mc);
        System.exit(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

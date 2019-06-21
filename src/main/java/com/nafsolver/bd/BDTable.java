/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd;

import java.sql.SQLException;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Admin
 */
public class BDTable {

    private final static Logger logger = LogManager.getLogger(BDTable.class);
    private String tableName;
    private String module;
    private List<BDColumn> columns;
    private BDConection con;

    public enum Module {
        CC("Cuentas Por Pagar"), CG("Contabilidad General"),
        CP("Cuentas Por Pagar"), FA("Facturacion"),
        CK("Cheques y Bancos"), IN("Inventario");
        String desc;

        private Module(String d) {
            desc = d;
        }

        public String getDescription() {
            return desc;
        }
    }

    public BDTable(String tName)  {
        tableName = tName;
        try {
            columns = BDConection.getColumnList(tName);
            System.out.println("Tabla " + tName + " con " + columns.size() + " columnas");
            logger.trace("Tabla " + tName + " con " + columns.size() + " columnas");
        } catch (SQLException ex) {
            logger.log(Level.FATAL, "Error al obtener las Columnas de la tabla " + tName, ex);
        }
    }

    public String getModule() {
        if (tableName.startsWith("AR")) {
            String sub = tableName.substring(2, 4);
            return Module.valueOf(sub).getDescription();
        } else {
            return null;
        }
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<BDColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<BDColumn> columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "BDTable{" + "tableName=" + tableName + ", module=" + module + '}';
    }
    
    

}

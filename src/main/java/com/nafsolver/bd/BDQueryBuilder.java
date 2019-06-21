/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class BDQueryBuilder {
    private final String PRIMARY_COLUMNS = "NO_CIA, NO_DOCU, NO_REFE, NO_CLIENTE, NO_PROVE";
    public static String getAmt(BDTable table){
        String columns;
        
        
        StringBuilder query = new StringBuilder("SELECT * FROM " + table.getTableName() );
        
        return null;
    }
   
}

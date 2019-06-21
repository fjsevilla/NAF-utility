/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Context {

    private static Properties props;

    public static void init() {
        InputStream propertiesStream;
        try {
            props = new Properties();

            propertiesStream = ClassLoader.getSystemResourceAsStream("tabledefinition.properties");
            props.load(propertiesStream);
            propertiesStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Context.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

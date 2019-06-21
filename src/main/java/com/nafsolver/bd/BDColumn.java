/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class BDColumn {
    private String tableName;
    private String columnName;
    private String dataType;
    private int dataLength;
    private boolean nullable;
    private List<Object> data;
    

    public BDColumn(String tableName, String columnName, String dataType, int dataLength, boolean nullable) {
        this.tableName = tableName;
        this.columnName = columnName;
        this.dataType = dataType;
        this.dataLength = dataLength;
        this.nullable = nullable;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getDataLength() {
        return dataLength;
    }

    public void setDataLength(int dataLength) {
        this.dataLength = dataLength;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public List<Object> getData() {
        return data;
    }
    
    public Object getData(int index) {
        return data.get(index);
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.columnName);
        hash = 79 * hash + Objects.hashCode(this.dataType);
        hash = 79 * hash + this.dataLength;
        hash = 79 * hash + (this.nullable ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BDColumn other = (BDColumn) obj;
        if (this.dataLength != other.dataLength) {
            return false;
        }
        if (this.nullable != other.nullable) {
            return false;
        }
        if (!Objects.equals(this.columnName, other.columnName)) {
            return false;
        }
        if (!Objects.equals(this.dataType, other.dataType)) {
            return false;
        }
        return true;
    }
    
    
}

package com.sqlboy.design.templatemethod;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 以下代码为了说明案例问题简单示例，不考虑数据库访问细节、异常情况、大数据量情况下的分页等
 */
public abstract class AbstractParser {

    String filePath;
    Connection connection;

    AbstractParser(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 模板方法
     *
     * @throws Exception
     */
    public final void upload() throws Exception {
        List<String> fileData = getFileData(filePath);
        boolean checkResult = checkData(fileData);
        if (checkResult) {
            getDBConnection();
            insertData(fileData);
            closeDBConnection();
        }
    }

    public List<String> getFileData(String filePath) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        List<String> data = new ArrayList<>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            data.add(line);
        }

        inputStream.close();
        bufferedReader.close();
        return data;
    }

    public abstract boolean checkData(List<String> data);

    public void getDBConnection() throws SQLException, ClassNotFoundException {
        //        String url = "";
        //        Class.forName("com.mysql.jdbc.Driver");
        //        connection = DriverManager.getConnection(url);
    }

    public void insertData(List<String> data) {
        for (String id : data) {
            System.out.println(id);
        }
    }

    public void closeDBConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

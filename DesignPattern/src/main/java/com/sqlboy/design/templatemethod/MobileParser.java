package com.sqlboy.design.templatemethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MobileParser extends AbstractParser {
    MobileParser(String filePath) {
        super(filePath);
    }

    @Override
    public List<String> getFileData(String filePath) throws IOException {
        List<String> data = new ArrayList<>();
        data.add("18888888888");
        data.add("13888888888");
        data.add("13988888888");

        return data;
    }

    @Override
    public boolean checkData(List<String> data) {
        for (String mobile : data) {
            if (mobile.length() != 11) {
                return false;
            }
        }
        return true;
    }
}

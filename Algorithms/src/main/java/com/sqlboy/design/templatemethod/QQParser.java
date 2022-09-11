package com.sqlboy.design.templatemethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QQParser extends AbstractParser {
    QQParser(String filePath) {
        super(filePath);
    }

    @Override
    public List<String> getFileData(String filePath) throws IOException {
        List<String> data = new ArrayList<>();
        data.add("888888");
        data.add("123456");
        data.add("9999999");

        return data;
    }

    @Override
    public boolean checkData(List<String> data) {
        for (String qq : data) {
            // 规则仅为示例，真实情况肯定没这么简单
            if (qq.length() < 6 || qq.length() > 11) {
                return false;
            }
        }
        return true;
    }
}

package com.sqlboy.design.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) throws Exception {
        MobileParser mobileParser = new MobileParser("xxx");
        mobileParser.upload();

        QQParser qqParser = new QQParser("xxx");
        qqParser.upload();
    }
}

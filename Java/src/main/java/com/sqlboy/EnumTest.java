package com.sqlboy;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        SeasonEnum spring = SeasonEnum.SPRING;
        String s = spring.toString();
        System.out.println(s);

        System.out.println("--------");
        SeasonEnum valueOfSpring = SeasonEnum.valueOf(s);
        System.out.println(spring == valueOfSpring);

        System.out.println("--------");
        SeasonEnum[] values = SeasonEnum.values();
        System.out.println(Arrays.toString(values));

        System.out.println("--------");
        System.out.println(SeasonEnum.SUMMER.ordinal());

        System.out.println("--------");
        System.out.println(SeasonEnum.SUMMER.compareTo(SeasonEnum.WINTER));
    }
}

enum SeasonEnum{
    SPRING("春天", "春风又绿江南岸"),
    SUMMER("夏天", "映日荷花别样红"),
    AUTUMN("秋天", "秋水共长天一色"),
    WINTER("冬天", "窗含西岭千秋雪");

    public final String name;
    public final String desc;

    SeasonEnum(String name, String desc){
       this.name = name;
       this.desc = desc;
    }
}

class Season{
    private final String NAME;
    private final String DESC;

    private Season(String name, String desc){
        this.NAME = name;
        this.DESC = desc;
    }

    public static final Season SPRING = new Season("春天", "春风又绿江南岸");
    public static final Season SUMMER = new Season("夏天", "映日荷花别样红");
    public static final Season AUTUMN = new Season("秋天", "秋水共长天一色");
    public static final Season WINTER = new Season("冬天", "窗含西岭千秋雪");
}
package pojo;

import lombok.Data;

/**
 * Data注解在类上，会为类的所有属性自动生成setter/getter、equals、canEqual、
 * hashCode、toString方法，如为final属性，则不会为该属性生成setter方法
 */
@Data
public class DataPojo {
    private String name;
    private int age;
}

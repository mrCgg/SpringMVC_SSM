package com.demo.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * describe:
 *
 * @author cgg
 * @date 2019/06/24
 */
public class StringToDateConvert implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        //判断
        if (s==null)
        {
            throw new RuntimeException("为检测到数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //把字符串转换成日期
        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("数据转换类型出错");
        }
    }
}

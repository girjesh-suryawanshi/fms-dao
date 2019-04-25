package com.mpcz.fmsdao.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public abstract class GlobalResources {

    public static Logger getLogger(Class className) {
        return LoggerFactory.getLogger(className);
    }


}

package com.example.orderfoodkitchen.Common;

import com.example.orderfoodkitchen.Model.Request;
import com.example.orderfoodkitchen.Model.User;

public class Common {

    public static User currentUser;
    public static Request currentRequest;
    public static final String UPDATE="Update";
    public static final String DELETE="Delete";
    public static final String REMOVE="Remove";

    public static final int PICK_IMAGE_REQUEST=71;

    public static String convertCodeToStatus(String code)
    {

        if (code.equals("0"))
            return "Placed";
        else if (code.equals("1"))
            return "On My Way";
        else
            return "Shipped";
    }

}

package model;

import java.io.FileReader;

import com.google.gson.Gson;

public class ItensModel {

    private static final String JSON_LOGIN = "./data/item.json";

    private static ItensModel itemModel;
    private String item;

    public static ItensModel getValueModel() {
        try {
            if (itemModel == null) {
                itemModel = new Gson().fromJson(new FileReader(JSON_LOGIN), ItensModel.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemModel;
    }

    public static String getItem() {
        return ItensModel.getValueModel().item;
    }
}
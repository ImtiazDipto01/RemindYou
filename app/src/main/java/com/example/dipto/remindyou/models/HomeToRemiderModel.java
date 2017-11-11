package com.example.dipto.remindyou.models;

import java.io.Serializable;

/**
 * Created by Dipto on 11/11/2017.
 */

public class HomeToRemiderModel implements Serializable {

    private String fragment_flag, remminder_id ;

    public HomeToRemiderModel(String fragment_flag, String remminder_id){
        this.fragment_flag = fragment_flag;
        this.remminder_id = remminder_id ;
    }

    public String getFragment_flag() {
        return fragment_flag;
    }

    public void setFragment_flag(String fragment_flag) {
        this.fragment_flag = fragment_flag;
    }

    public String getRemminder_id() {
        return remminder_id;
    }

    public void setRemminder_id(String remminder_id) {
        this.remminder_id = remminder_id;
    }
}

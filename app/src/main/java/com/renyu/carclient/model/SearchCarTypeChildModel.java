package com.renyu.carclient.model;

import java.util.ArrayList;

/**
 * Created by renyu on 15/12/7.
 */
public class SearchCarTypeChildModel {
    int parentId=-1;
    int id=-1;
    String text="";
    String imageUrl="";
    boolean isOpen=false;
    ArrayList<SearchCarTypeChildModel> lists=null;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public ArrayList<SearchCarTypeChildModel> getLists() {
        return lists;
    }

    public void setLists(ArrayList<SearchCarTypeChildModel> lists) {
        this.lists = lists;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

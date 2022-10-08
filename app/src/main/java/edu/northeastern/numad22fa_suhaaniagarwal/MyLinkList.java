package edu.northeastern.numad22fa_suhaaniagarwal;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class MyLinkList extends Application {
    private static List<Link> linkList = new ArrayList<Link>();
    private static int nextId = 0;

    public static List<Link> getLinkList() {
        return linkList;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public static void setLinkList(List<Link> linkList) {
        MyLinkList.linkList = linkList;
    }
}

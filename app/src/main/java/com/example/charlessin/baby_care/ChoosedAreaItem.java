package com.example.charlessin.baby_care;

public class ChoosedAreaItem {
    String name;
    String add;
    String tel;

    public ChoosedAreaItem(String name, String add, String tel) {
        this.name = name;
        this.add = add;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

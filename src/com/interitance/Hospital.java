package com.interitance;

public class Hospital {
    public String location;
    public String Name;

    Hospital(String location , String Name){
        this.location=location;
        this.Name=Name;
    }

    private String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}

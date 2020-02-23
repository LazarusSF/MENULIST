package com.sf.lazarus.menulist;

/**
 * Created by LAZARUS on 25-09-2017.
 */

public class Food {

    private String name;
    private String description;
    private int imageId;

    public static final Food[] foods={
            new Food("Pizza","Thin crust pizza with exta cheese",R.drawable.pizzaone),
            new Food("burger","veg burgrer with healthy stuff",R.drawable.burgerone),
            new Food("sandwich","whole wheat sandwich",R.drawable.sandwichone),
    };

    public Food(String name,String description,int imageId){

        this.name=name;
        this.description=description;
        this.imageId=imageId;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    public String toString(){
        return this.name;
    }
}

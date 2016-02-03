package com.nisum.market;


public enum FruitName {

    LEMON("lemon", Lemon.class),BANANA("banana", Banana.class),CHIRIMOYA("chirimoya", Chirimoya.class), WATERMELON
            ("watermelon", Watermelon.class);



    private final String name;
    private final Class<? extends Fruit> classType;


    FruitName(String name, Class<? extends Fruit> classType) {
        this.name = name;
        this.classType = classType;
    }


    public String getName() {
        return name;
    }

    public static FruitName getFruitName(String name) {
        for (FruitName myFruitName : values()) {
            if (myFruitName.getName().equalsIgnoreCase(name)) {
                return myFruitName;
            }
        }
        return null;
    }

    public static Fruit getFruit(String name){
        FruitName fruitName = getFruitName(name);

        if (fruitName != null){
            return fruitName.newFruitInstance();
        }

        return null;
    }


    private Fruit newFruitInstance() {
        try {
            return classType.newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}

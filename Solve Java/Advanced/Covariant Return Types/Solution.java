package com.example.jsontodb.Covariant_Return_Types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    String whatsYourName(){
        return "I have many names and types.";
    }
}

class Jasmine extends Flower{

    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {

    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region {

    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region {

    @Override
    Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    @Override
    Flower yourNationalFlower() {
        return new Lily();
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = switch (s) {
            case "WestBengal" -> new WestBengal();
            case "AndhraPradesh" -> new AndhraPradesh();
            default -> null;
        };
        assert region != null;
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

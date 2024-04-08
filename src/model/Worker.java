package model;

import java.util.Random;

public interface Worker {
    Random ID = new Random();
    default int getId(){
        return ID.nextInt();
    }
}

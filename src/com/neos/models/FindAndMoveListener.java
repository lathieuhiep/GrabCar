package com.neos.models;

import com.neos.components.Car;
import com.neos.components.Schedule;

public interface FindAndMoveListener {
    Car find (char startPos, char destPos, String typePost);
    Schedule move(char startPos, char destPos, String carId, String userName, String userId);
}

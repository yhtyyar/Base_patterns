package com.java.base_patterns.behaviorals_patterns.observer;

import java.util.List;

public interface Observer {

    void handleEvent(List<String> goods);
}

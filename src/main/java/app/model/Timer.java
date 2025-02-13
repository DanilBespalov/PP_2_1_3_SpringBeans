package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("timer")
public class Timer {

    private final Long nanoTime = System.nanoTime();
    @Autowired
    public Long getTime() {
        return nanoTime;
    }
}

package app.model;

import org.springframework.stereotype.Component;

@Component(value = "doge")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}

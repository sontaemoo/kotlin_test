package test;

import chapter04.State;
import chapter04.View;
import org.jetbrains.annotations.NotNull;

public class NestedClassTest implements View {
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {
//        View.super.restoreState(state);
    }

    public class ButtonState implements State {

    }
}

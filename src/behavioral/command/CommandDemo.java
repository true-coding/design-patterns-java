package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

    public static void main(String[] args) {

        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        Switch lightSwitch = new Switch();

        Command onCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(onCommand);
        //lightSwitch.storeAndExecute(onCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);
        Command allLights = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLights);



    }
}

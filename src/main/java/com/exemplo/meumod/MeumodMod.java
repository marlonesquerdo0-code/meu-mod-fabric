package com.exemplo.meumod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeumodMod implements ModInitializer {
    public static final String MOD_ID = "meumod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        package com.autobuilder;

        import net.fabricmc.api.ClientModInitializer;
        import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
        import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
        import net.minecraft.client.option.KeyBinding;
        import net.minecraft.client.util.InputUtil;
        import org.lwjgl.glfw.GLFW;

        public class AutobuilderMod implements ClientModInitializer {

    public static KeyBinding toggleKey;
    public static BuildController controller;

    @Override
    public void onInitializeClient() {
        toggleKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.autobuilder.toggle",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_B,
            "category.autobuilder"
        ));

        controller = new BuildController();

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (toggleKey.wasPressed()) {
                controller.toggle(client);
            }
            if (controller.isRunning()) {
                controller.tick(client);
            }
        });
    }
        }
    }
}

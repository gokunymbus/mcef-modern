package net.dimaskama.mcef.testmod;

import com.mojang.blaze3d.platform.InputConstants;
import net.dimaskama.mcef.api.MCEFApi;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class MCEFTestMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        MCEFApi.initialize();
        KeyMapping openBrowserKey = KeyBindingHelper.registerKeyBinding(new KeyMapping(
                "key.mcef-modern-testmod.open",
                GLFW.GLFW_KEY_F10,
                KeyMapping.Category.MISC));
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openBrowserKey.consumeClick()) {
                client.setScreen(new MCEFTestModScreen(client.screen));
            }
        });
    }

}

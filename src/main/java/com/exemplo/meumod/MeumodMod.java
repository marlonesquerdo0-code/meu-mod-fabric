package com.exemplo.meumod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeumodMod implements ModInitializer {
    public static final String MOD_ID = "meumod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Meu Mod carregado!");
    }
}

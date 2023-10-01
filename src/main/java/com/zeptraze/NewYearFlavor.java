package com.zeptraze;

import net.fabricmc.api.ModInitializer;

public class NewYearFlavor implements ModInitializer {
	public static final String MOD_ID = "new-year-flavor";
	@Override
	public void onInitialize() {
		Registrar.register();
	}
}
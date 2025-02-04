package org.gotti.wurmunlimited.modloader;

import org.gotti.wurmunlimited.modcomm.ModComm;
import org.gotti.wurmunlimited.modloader.interfaces.WurmClientMod;
import org.gotti.wurmunlimited.modsupport.ModClient;
import org.gotti.wurmunlimited.modsupport.console.ModConsole;

public class ModLoader extends ModLoaderShared<WurmClientMod> {
	
	public ModLoader() {
		super(WurmClientMod.class);
	}
	
	@Override
	protected void modcommInit() {
		ModComm.init();
	}
	
	@Override
	protected void preInit() {
		ModConsole.preInit();
		ModClient.preInit();
	}
	
	@Override
	protected void init() {
		ModConsole.init();
		ModClient.init();
	}
}

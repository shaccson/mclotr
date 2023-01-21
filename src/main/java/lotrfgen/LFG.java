package lotrfgen;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.*;
import lotr.common.world.structure.LOTRStructures;

@Mod(modid = "lotrfgen", dependencies = "required-after:lotr")
public class LFG {
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent e) {
		e.registerServerCommand(new LFGCommandDatabase());
	}

	@Mod.EventHandler
	public void load(FMLInitializationEvent e) {
		LOTRStructures.registerStructure(2019, LFGDatabaseGenerator.class, "DatabaseGenerator", 9605778, 9605778);
	}
}

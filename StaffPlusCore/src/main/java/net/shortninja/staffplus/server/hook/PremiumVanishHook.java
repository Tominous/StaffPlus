package net.shortninja.staffplus.server.hook;

import org.bukkit.plugin.Plugin;

public final class PremiumVanishHook extends AbstractHook {

	public PremiumVanishHook(Plugin plugin) {
		super(plugin);
	}

	@Override
	public String getPluginName() {
		return "SuperVanish";
	}

	@Override
	public String getPluginVersion() {
		return "6.1.3";
	}

	@Override
	public void onEnable() { }

	@Override
	public void onDisable() { }
}

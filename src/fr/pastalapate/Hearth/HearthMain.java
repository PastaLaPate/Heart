package fr.pastalapate.Hearth;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class HearthMain extends JavaPlugin{
	@Override
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerListener(), this);
	}
}
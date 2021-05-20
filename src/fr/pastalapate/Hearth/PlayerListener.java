package fr.pastalapate.Hearth;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class PlayerListener implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		createScoreBoard(player);
	}
	
	private void createScoreBoard(Player player) {
		ScoreboardManager scoreboardmanager = Bukkit.getScoreboardManager();
		Scoreboard scoreboard = scoreboardmanager.getNewScoreboard();
		Objective objective = scoreboard.registerNewObjective("Hearth", "health");
		
		objective.setDisplayName(ChatColor.RED + "❤");
		objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		
		double hearth = player.getHealth();
		hearth = hearth/2;
		Score score = objective.getScore(ChatColor.RED + "❤" + hearth);
		score.setScore(0);
		
		player.setScoreboard(scoreboard);
	}
}
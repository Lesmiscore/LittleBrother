package com.nao20010128nao;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.EntityEffect;
import org.bukkit.GameMode;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.Statistic;
import org.bukkit.WeatherType;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.Vector;

public class LBPlayer implements Player {

	public LBPlayer() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public PlayerInventory getInventory() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Inventory getEnderChest() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean setWindowProperty(Property prop, int value) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public InventoryView getOpenInventory() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public InventoryView openInventory(Inventory inventory) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public InventoryView openWorkbench(Location location, boolean force) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public InventoryView openEnchanting(Location location, boolean force) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void openInventory(InventoryView inventory) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void closeInventory() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public ItemStack getItemInHand() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setItemInHand(ItemStack item) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public ItemStack getItemOnCursor() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setItemOnCursor(ItemStack item) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isSleeping() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public int getSleepTicks() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public GameMode getGameMode() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setGameMode(GameMode mode) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isBlocking() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public int getExpToLevel() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public double getEyeHeight() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public double getEyeHeight(boolean ignoreSneaking) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public Location getEyeLocation() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Block> getLineOfSight(Set<Material> transparent, int maxDistance) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Block getTargetBlock(Set<Material> transparent, int maxDistance) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent,
			int maxDistance) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Block> getLastTwoTargetBlocks(Set<Material> transparent,
			int maxDistance) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Egg throwEgg() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Snowball throwSnowball() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Arrow shootArrow() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int getRemainingAir() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setRemainingAir(int ticks) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public int getMaximumAir() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setMaximumAir(int ticks) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public int getMaximumNoDamageTicks() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setMaximumNoDamageTicks(int ticks) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public double getLastDamage() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setLastDamage(double damage) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public int getNoDamageTicks() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setNoDamageTicks(int ticks) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Player getKiller() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean addPotionEffect(PotionEffect effect, boolean force) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean addPotionEffects(Collection<PotionEffect> effects) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean hasPotionEffect(PotionEffectType type) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void removePotionEffect(PotionEffectType type) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Collection<PotionEffect> getActivePotionEffects() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean hasLineOfSight(Entity other) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean getRemoveWhenFarAway() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setRemoveWhenFarAway(boolean remove) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public EntityEquipment getEquipment() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setCanPickupItems(boolean pickup) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean getCanPickupItems() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isLeashed() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Entity getLeashHolder() throws IllegalStateException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean setLeashHolder(Entity holder) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Location getLocation() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Location getLocation(Location loc) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setVelocity(Vector velocity) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Vector getVelocity() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public World getWorld() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean teleport(Location location) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean teleport(Location location, TeleportCause cause) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean teleport(Entity destination) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean teleport(Entity destination, TeleportCause cause) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public List<Entity> getNearbyEntities(double x, double y, double z) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int getEntityId() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int getFireTicks() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int getMaxFireTicks() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setFireTicks(int ticks) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void remove() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isDead() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isValid() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Server getServer() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Entity getPassenger() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean setPassenger(Entity passenger) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean eject() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public float getFallDistance() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setFallDistance(float distance) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setLastDamageCause(EntityDamageEvent event) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public UUID getUniqueId() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int getTicksLived() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setTicksLived(int value) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void playEffect(EntityEffect type) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public EntityType getType() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean isInsideVehicle() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean leaveVehicle() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Entity getVehicle() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setCustomName(String name) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public String getCustomName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setCustomNameVisible(boolean flag) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isCustomNameVisible() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void sendMessage(String message) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void sendMessage(String[] messages) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isPermissionSet(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isPermissionSet(Permission perm) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean hasPermission(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean hasPermission(Permission perm) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, String name,
			boolean value, int ticks) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void removeAttachment(PermissionAttachment attachment) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void recalculatePermissions() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean isOp() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setOp(boolean value) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void damage(double amount) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void damage(double amount, Entity source) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public double getHealth() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setHealth(double health) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public double getMaxHealth() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setMaxHealth(double health) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void resetMaxHealth() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public <T extends Projectile> T launchProjectile(
			Class<? extends T> projectile) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <T extends Projectile> T launchProjectile(
			Class<? extends T> projectile, Vector velocity) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean isConversing() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void acceptConversationInput(String input) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean beginConversation(Conversation conversation) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void abandonConversation(Conversation conversation) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void abandonConversation(Conversation conversation,
			ConversationAbandonedEvent details) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isOnline() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isBanned() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setBanned(boolean banned) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isWhitelisted() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setWhitelisted(boolean value) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Player getPlayer() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public long getFirstPlayed() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public long getLastPlayed() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public boolean hasPlayedBefore() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Map<String, Object> serialize() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Set<String> getListeningPluginChannels() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String getDisplayName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setDisplayName(String name) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public String getPlayerListName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setPlayerListName(String name) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setCompassTarget(Location loc) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Location getCompassTarget() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public InetSocketAddress getAddress() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void sendRawMessage(String message) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void kickPlayer(String message) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void chat(String msg) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean performCommand(String command) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isSneaking() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setSneaking(boolean sneak) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isSprinting() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setSprinting(boolean sprinting) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void saveData() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void loadData() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setSleepingIgnored(boolean isSleeping) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isSleepingIgnored() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void playNote(Location loc, byte instrument, byte note) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void playNote(Location loc, Instrument instrument, Note note) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void playSound(Location location, Sound sound, float volume,
			float pitch) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void playSound(Location location, String sound, float volume,
			float pitch) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void playEffect(Location loc, Effect effect, int data) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public <T> void playEffect(Location loc, Effect effect, T data) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void sendBlockChange(Location loc, Material material, byte data) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean sendChunkChange(Location loc, int sx, int sy, int sz,
			byte[] data) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void sendBlockChange(Location loc, int material, byte data) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void sendSignChange(Location loc, String[] lines)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void sendMap(MapView map) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void updateInventory() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void awardAchievement(Achievement achievement) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void removeAchievement(Achievement achievement) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean hasAchievement(Achievement achievement) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void incrementStatistic(Statistic statistic)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void decrementStatistic(Statistic statistic)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void incrementStatistic(Statistic statistic, int amount)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void decrementStatistic(Statistic statistic, int amount)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setStatistic(Statistic statistic, int newValue)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public int getStatistic(Statistic statistic)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void decrementStatistic(Statistic statistic, Material material)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public int getStatistic(Statistic statistic, Material material)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void incrementStatistic(Statistic statistic, Material material,
			int amount) throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void decrementStatistic(Statistic statistic, Material material,
			int amount) throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setStatistic(Statistic statistic, Material material,
			int newValue) throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void incrementStatistic(Statistic statistic, EntityType entityType)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void decrementStatistic(Statistic statistic, EntityType entityType)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public int getStatistic(Statistic statistic, EntityType entityType)
			throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void incrementStatistic(Statistic statistic, EntityType entityType,
			int amount) throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void decrementStatistic(Statistic statistic, EntityType entityType,
			int amount) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setStatistic(Statistic statistic, EntityType entityType,
			int newValue) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setPlayerTime(long time, boolean relative) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public long getPlayerTime() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public long getPlayerTimeOffset() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public boolean isPlayerTimeRelative() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void resetPlayerTime() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setPlayerWeather(WeatherType type) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public WeatherType getPlayerWeather() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void resetPlayerWeather() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void giveExp(int amount) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void giveExpLevels(int amount) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public float getExp() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setExp(float exp) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public int getLevel() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setLevel(int level) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public int getTotalExperience() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setTotalExperience(int exp) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public float getExhaustion() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setExhaustion(float value) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public float getSaturation() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setSaturation(float value) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public int getFoodLevel() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setFoodLevel(int value) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Location getBedSpawnLocation() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setBedSpawnLocation(Location location) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setBedSpawnLocation(Location location, boolean force) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean getAllowFlight() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setAllowFlight(boolean flight) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void hidePlayer(Player player) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void showPlayer(Player player) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean canSee(Player player) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isOnGround() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isFlying() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setFlying(boolean value) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setFlySpeed(float value) throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setWalkSpeed(float value) throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public float getFlySpeed() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public float getWalkSpeed() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setTexturePack(String url) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setResourcePack(String url) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public Scoreboard getScoreboard() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setScoreboard(Scoreboard scoreboard)
			throws IllegalArgumentException, IllegalStateException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isHealthScaled() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void setHealthScaled(boolean scale) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void setHealthScale(double scale) throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public double getHealthScale() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public Entity getSpectatorTarget() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setSpectatorTarget(Entity entity) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void sendTitle(String title, String subtitle) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void resetTitle() {
		// TODO 自動生成されたメソッド・スタブ

	}

}

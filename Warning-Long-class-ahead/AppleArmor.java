package me.AppleTechOnline.Stuff2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;
import me.AppleTechOnline.Stuff2.*;

public class Armor extends JavaPlugin implements Listener {
	
	public Stuff plugin;
	
	public static Inventory armor = Bukkit.createInventory(null, 45, ChatColor.GREEN + "Armor!");
	public void onEnable(){
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	static {
		
	
		ItemStack a5 = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta a5m = a5.getItemMeta();
		a5m.setDisplayName("§6Chainmail Armor");
		a5m.setLore(Arrays.asList("§7*KRUNCH*"));
		a5.setItemMeta(a5m);
		
		ItemStack a6 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta a6m = a6.getItemMeta();
		a6m.setDisplayName("§6Chainmail Armor");
		a6m.setLore(Arrays.asList("§7*KRUNCH*"));
		a6.setItemMeta(a6m);
		
		ItemStack a7 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta a7m = a7.getItemMeta();
		a7m.setDisplayName("§6Chainmail Armor");
		a7m.setLore(Arrays.asList("§7*KRUNCH*"));
		a7.setItemMeta(a7m);
		
		ItemStack a8 = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta a8m = a8.getItemMeta();
		a8m.setDisplayName("§6Chainmail Armor");
		a8m.setLore(Arrays.asList("§7*KRUNCH*"));
		a8.setItemMeta(a8m);
		
	////////////////////////	
		
		ItemStack a1 = new ItemStack(Material.LEATHER_HELMET);
		ItemMeta a1m = a1.getItemMeta();
		a1m.setDisplayName("§bColor Changing Armor");
		a1m.setLore(Arrays.asList("§5Sparkly"));
		a1.setItemMeta(a1m);
		
		ItemStack a2 = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemMeta a2m = a2.getItemMeta();
		a2m.setDisplayName("§bColor Changing Armor");
		a2m.setLore(Arrays.asList("§5Sparkly"));
		a2.setItemMeta(a2m);
		
		ItemStack a3 = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemMeta a3m = a3.getItemMeta();
		a3m.setDisplayName("§bColor Changing Armor");
		a3m.setLore(Arrays.asList("§5Sparkly"));
		a3.setItemMeta(a3m);
		
		ItemStack a4 = new ItemStack(Material.LEATHER_BOOTS);
		ItemMeta a4m = a4.getItemMeta();
		a4m.setDisplayName("§bColor Changing Armor");
		a4m.setLore(Arrays.asList("§5Sparkly"));
		a4.setItemMeta(a4m);
		
		
		
		
		
		
		ItemStack a9 = new ItemStack(Material.IRON_HELMET);
		ItemMeta a9m = a9.getItemMeta();
		a9m.setDisplayName("§aIron Armor");
		a9m.setLore(Arrays.asList("§2Much swag"));
		a9.setItemMeta(a9m);
		
		ItemStack a10 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta a10m = a10.getItemMeta();
		a10m.setDisplayName("§aIron Armor");
		a10m.setLore(Arrays.asList("§2Much swag"));
		a10.setItemMeta(a10m);
		
		ItemStack a11 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta a11m = a11.getItemMeta();
		a11m.setDisplayName("§aIron Armor");
		a11m.setLore(Arrays.asList("§2Much swag"));
		a11.setItemMeta(a11m);
		
		ItemStack a12 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta a12m = a12.getItemMeta();
		a12m.setDisplayName("§aIron Armor");
		a12m.setLore(Arrays.asList("§2Much swag"));
		a12.setItemMeta(a12m);
	/////////////////////////////////////	
		
		ItemStack a13 = new ItemStack(Material.GOLD_HELMET);
		ItemMeta a13m = a13.getItemMeta();
		a13m.setDisplayName("§6Gold Armor");
		a13m.setLore(Arrays.asList("§6I threw Gold at your dog"));
		a13.setItemMeta(a13m);
		
		ItemStack a14 = new ItemStack(Material.GOLD_CHESTPLATE);
		ItemMeta a14m = a14.getItemMeta();
		a14m.setDisplayName("§6Gold Armor");
		a14m.setLore(Arrays.asList("§6I threw Gold at your dog"));
		a14.setItemMeta(a14m);
		
		ItemStack a15 = new ItemStack(Material.GOLD_LEGGINGS);
		ItemMeta a15m = a15.getItemMeta();
		a15m.setDisplayName("§6Gold Armor");
		a15m.setLore(Arrays.asList("§6I threw Gold at your dog"));
		a15.setItemMeta(a15m);
		
		ItemStack a16 = new ItemStack(Material.GOLD_BOOTS);
		ItemMeta a16m = a16.getItemMeta();
		a16m.setDisplayName("§6Gold Armor");
		a16m.setLore(Arrays.asList("§6I threw Gold at your dog"));
		a16.setItemMeta(a16m);
		/////////////////////////////
		
		ItemStack a17 = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta a17m = a17.getItemMeta();
		a17m.setDisplayName("§bDiamond Armor");
		a17m.setLore(Arrays.asList("§bSOO BOOTYFOOLLL"));
		a17.setItemMeta(a17m);
		a17.addEnchantment(Enchantment.PROTECTION_FIRE, 4);
		
		ItemStack a18 = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta a18m = a18.getItemMeta();
		a18m.setDisplayName("§bDiamond Armor");
		a18m.setLore(Arrays.asList("§bSOO BOOTYFOOLLL"));
		a18.setItemMeta(a18m);
		a18.addEnchantment(Enchantment.PROTECTION_FIRE, 4);
		
		ItemStack a19 = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta a19m = a19.getItemMeta();
		a19m.setDisplayName("§bDiamond Armor");
		a19m.setLore(Arrays.asList("§bSOO BOOTYFOOLLL"));
		a19.setItemMeta(a19m);
		a19.addEnchantment(Enchantment.PROTECTION_FIRE, 4);
		
		ItemStack a20 = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta a20m = a20.getItemMeta();
		a20m.setDisplayName("§bDiamond Armor");
		a20m.setLore(Arrays.asList("§bSOO BOOTYFOOLLL"));
		a20.setItemMeta(a20m);
		a20.addEnchantment(Enchantment.PROTECTION_FIRE, 4);
		
		ItemStack a21 = new ItemStack(Material.WOOL, 1, (short) DyeColor.RED.getData());
		ItemMeta a21m = a21.getItemMeta();
		a21m.setDisplayName("§4Close this menu!");
		a21.setItemMeta(a21m);
		
		ItemStack a22 = new ItemStack(Material.INK_SACK, 1, (short) DyeColor.CYAN.getData());
		ItemMeta a22m = a22.getItemMeta();
		a22m.setDisplayName("§aLeather Armor Colors!");
		a22m.setLore(Arrays.asList("§4Coming Soon"));
		a22.setItemMeta(a22m);
		
		ItemStack a23 = new ItemStack(Material.DIAMOND);
		ItemMeta a23m = a23.getItemMeta();
		a23m.setDisplayName("§bDiamonds to you!");
		a23m.setLore(Arrays.asList("§4Donators and stuff!"));
		a23.setItemMeta(a23m);
		
		
		ItemStack a24 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) DyeColor.CYAN.getData());
		ItemMeta a24m = a24.getItemMeta();
		a24m.setLore(Arrays.asList("§4Donators and stuff!"));
		a24m.setDisplayName("§bBecause Im happy!");
		a24.setItemMeta(a24m);
		
		ItemStack a25 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) DyeColor.WHITE.getData());
		ItemMeta a25m = a25.getItemMeta();
		a25m.setDisplayName("§bBecause Im happy!");
		a25.setItemMeta(a25m);
		
		ItemStack a26 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) DyeColor.BLUE.getData());
		ItemMeta a26m = a26.getItemMeta();
		a26m.setDisplayName("§bPizza!!");
		a26.setItemMeta(a26m);
		
		ItemStack a27 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) DyeColor.LIME.getData());
		ItemMeta a27m = a27.getItemMeta();
		a27m.setDisplayName("§aNOODLES!!");
		a27.setItemMeta(a27m);
		
		
		
		
		
		
		armor.setItem(44, a24);
		armor.setItem(43, a26);
		armor.setItem(42, a27);
		
		
		armor.setItem(41, a21);
		armor.setItem(40, a22);
		armor.setItem(39, a23);
		
		
		armor.setItem(38, a27);
		armor.setItem(37, a26);
		armor.setItem(36, a24);
		
		
		armor.setItem(35, a25);
		armor.setItem(34, a25);
		armor.setItem(33, a25);
		armor.setItem(29, a25);
		armor.setItem(28, a25);
		armor.setItem(27, a25);
		armor.setItem(26, a24);
		armor.setItem(25, a24);
		armor.setItem(24, a24);
		armor.setItem(19, a24);
		armor.setItem(18, a24);
		armor.setItem(17, a25);
		armor.setItem(16, a25);
		armor.setItem(10, a25);
		armor.setItem(9, a25);
		
		armor.setItem(7, a24);
		armor.setItem(8, a24);
		armor.setItem(5, a24);
		
		armor.setItem(0, a24);
		armor.setItem(1, a24);		
		
		
		
		
		
		
		armor.setItem(2, new ItemStack(a5));
		armor.setItem(11, new ItemStack(a6));
		armor.setItem(20, new ItemStack(a7));
		armor.setItem(29, new ItemStack(a8));
		
		
		armor.setItem(3, new ItemStack(a1));
		armor.setItem(12, new ItemStack(a2));
		armor.setItem(21, new ItemStack(a3));
		armor.setItem(30, new ItemStack(a3));
		
		
		
		armor.setItem(4, new ItemStack(a9));
		armor.setItem(13, new ItemStack(a10));
		armor.setItem(22, new ItemStack(a11));
		armor.setItem(31, new ItemStack(a12));
		
		armor.setItem(5, new ItemStack(a13));
		armor.setItem(14, new ItemStack(a14));
		armor.setItem(23, new ItemStack(a15));
		armor.setItem(32, new ItemStack(a16));
		
		armor.setItem(6, new ItemStack(a17));
		armor.setItem(15, new ItemStack(a18));
		armor.setItem(24, new ItemStack(a19));
		armor.setItem(33, new ItemStack(a20));
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("armor")) {
			
			Player player = (Player) sender;
			if(player.hasPermission("Apple.Armor") || player.isOp()){
			player.openInventory(armor);
			}
			else{
				player.sendMessage("§4I'm Sorry, But you you dont have permissions to open this!");
			}
		}
		return false;
	}
	
	ItemStack CH = new ItemStack(Material.CHAINMAIL_HELMET);
	ItemStack CC = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
	ItemStack CL = new ItemStack(Material.CHAINMAIL_LEGGINGS);
	ItemStack CB = new ItemStack(Material.CHAINMAIL_BOOTS);
	
	
	
	ItemStack LH = new ItemStack(Material.LEATHER_HELMET);
	ItemStack LC = new ItemStack(Material.LEATHER_CHESTPLATE);
	ItemStack LL = new ItemStack(Material.LEATHER_LEGGINGS);
	ItemStack LB = new ItemStack(Material.LEATHER_BOOTS);
	
	ItemStack IH = new ItemStack(Material.IRON_HELMET);
	ItemStack IC = new ItemStack(Material.IRON_CHESTPLATE);
	ItemStack IL = new ItemStack(Material.IRON_LEGGINGS);
	ItemStack IB = new ItemStack(Material.IRON_BOOTS);
	
	ItemStack GH = new ItemStack(Material.GOLD_HELMET);
	ItemStack GC = new ItemStack(Material.GOLD_CHESTPLATE);
	ItemStack GL = new ItemStack(Material.GOLD_LEGGINGS);
	ItemStack GB = new ItemStack(Material.GOLD_BOOTS);
	
	
	ItemStack DH = new ItemStack(Material.DIAMOND_HELMET);
	ItemStack DC = new ItemStack(Material.DIAMOND_CHESTPLATE);
	ItemStack DL = new ItemStack(Material.DIAMOND_LEGGINGS);
	ItemStack DB = new ItemStack(Material.DIAMOND_BOOTS);
	
	Random random = new Random();
	
	private ItemStack[] RandomizeLeatherColor()
	{
		ItemStack LH = new ItemStack(Material.LEATHER_HELMET);
		ItemStack LC = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemStack LL = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack LB = new ItemStack(Material.LEATHER_BOOTS);
		
		LeatherArmorMeta LHM = (LeatherArmorMeta)LH.getItemMeta();
		LeatherArmorMeta LCM = (LeatherArmorMeta)LH.getItemMeta();
		LeatherArmorMeta LLM = (LeatherArmorMeta)LH.getItemMeta();
		LeatherArmorMeta LBM = (LeatherArmorMeta)LH.getItemMeta();
		
		Color[] colors = new Color[4];
		
		for (int i = 0; i < 4; i++)
		{
			colors[i] = Color.fromRGB(random.nextInt(256),random.nextInt(256),random.nextInt(256));
		}
		
		LHM.setColor(colors[0]);
		LCM.setColor(colors[1]);
		LLM.setColor(colors[2]);
		LBM.setColor(colors[3]);
				
		LH.setItemMeta(LHM);
		LC.setItemMeta(LCM);
		LL.setItemMeta(LLM);
		LB.setItemMeta(LBM);
		
		return new ItemStack[] { LH,LC,LL,LB };
		
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		
		e.setCancelled(true);
		if(!e.getInventory().getName().equalsIgnoreCase(armor.getName())) return;
		if(e.getCurrentItem().getType().equals(Material.LEATHER_HELMET)){
			e.setCancelled(true);
			ItemStack[] stacks = RandomizeLeatherColor();
			e.getWhoClicked().getInventory().setHelmet(stacks[0]);
			e.getWhoClicked().getInventory().setChestplate(stacks[1]);
			e.getWhoClicked().getInventory().setLeggings(stacks[2]);
			e.getWhoClicked().getInventory().setBoots(stacks[3]);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Leather Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
	}
		if(e.getCurrentItem().getType().equals(Material.LEATHER_CHESTPLATE)){
			e.setCancelled(true);
			ItemStack[] stacks = RandomizeLeatherColor();
			e.getWhoClicked().getInventory().setHelmet(stacks[0]);
			e.getWhoClicked().getInventory().setChestplate(stacks[1]);
			e.getWhoClicked().getInventory().setLeggings(stacks[2]);
			e.getWhoClicked().getInventory().setBoots(stacks[3]);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Leather Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
		if(e.getCurrentItem().getType().equals(Material.LEATHER_LEGGINGS)){
			e.setCancelled(true);
			ItemStack[] stacks = RandomizeLeatherColor();
			e.getWhoClicked().getInventory().setHelmet(stacks[0]);
			e.getWhoClicked().getInventory().setChestplate(stacks[1]);
			e.getWhoClicked().getInventory().setLeggings(stacks[2]);
			e.getWhoClicked().getInventory().setBoots(stacks[3]);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Leather Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
		if(e.getCurrentItem().getType().equals(Material.LEATHER_BOOTS)){
			e.setCancelled(true);
			ItemStack[] stacks = RandomizeLeatherColor();
			e.getWhoClicked().getInventory().setHelmet(stacks[0]);
			e.getWhoClicked().getInventory().setChestplate(stacks[1]);
			e.getWhoClicked().getInventory().setLeggings(stacks[2]);
			e.getWhoClicked().getInventory().setBoots(stacks[3]);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Leather Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
		if(e.getCurrentItem().getType().equals(Material.IRON_HELMET)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(IH);
			e.getWhoClicked().getInventory().setChestplate(IC);
			e.getWhoClicked().getInventory().setLeggings(IL);
			e.getWhoClicked().getInventory().setBoots(IB);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Iron Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
		if(e.getCurrentItem().getType().equals(Material.IRON_CHESTPLATE)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(IH);
			e.getWhoClicked().getInventory().setChestplate(IC);
			e.getWhoClicked().getInventory().setLeggings(IL);
			e.getWhoClicked().getInventory().setBoots(IB);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Iron Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
		if(e.getCurrentItem().getType().equals(Material.IRON_LEGGINGS)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(IH);
			e.getWhoClicked().getInventory().setChestplate(IC);
			e.getWhoClicked().getInventory().setLeggings(IL);
			e.getWhoClicked().getInventory().setBoots(IB);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Iron Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
		if(e.getCurrentItem().getType().equals(Material.IRON_BOOTS)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(IH);
			e.getWhoClicked().getInventory().setChestplate(IC);
			e.getWhoClicked().getInventory().setLeggings(IL);
			e.getWhoClicked().getInventory().setBoots(IB);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Iron Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
		if(e.getCurrentItem().getType().equals(Material.DIAMOND_HELMET)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(DH);
			e.getWhoClicked().getInventory().setChestplate(DC);
			e.getWhoClicked().getInventory().setLeggings(DL);
			e.getWhoClicked().getInventory().setBoots(DB);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Diamond Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			
		}
		if(e.getCurrentItem().getType().equals(Material.DIAMOND_CHESTPLATE)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(DH);
			e.getWhoClicked().getInventory().setChestplate(DC);
			e.getWhoClicked().getInventory().setLeggings(DL);
			e.getWhoClicked().getInventory().setBoots(DB);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Diamond Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
		if(e.getCurrentItem().getType().equals(Material.DIAMOND_LEGGINGS)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(DH);
			e.getWhoClicked().getInventory().setChestplate(DC);
			e.getWhoClicked().getInventory().setLeggings(DL);
			e.getWhoClicked().getInventory().setBoots(DB);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Diamond Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
		if(e.getCurrentItem().getType().equals(Material.DIAMOND_BOOTS)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(DH);
			e.getWhoClicked().getInventory().setChestplate(DC);
			e.getWhoClicked().getInventory().setLeggings(DL);
			e.getWhoClicked().getInventory().setBoots(DB);
			p.closeInventory();
			p.sendMessage("§6You are now using §9Diamond Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
		}
			
			
		if(e.getCurrentItem().getType().equals(Material.CHAINMAIL_HELMET)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(CH);
			e.getWhoClicked().getInventory().setChestplate(CC);
			e.getWhoClicked().getInventory().setLeggings(CL);
			e.getWhoClicked().getInventory().setBoots(CB);
			p.closeInventory();
			p.sendMessage("§6You are now using §7Chainmail Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
		if(e.getCurrentItem().getType().equals(Material.CHAINMAIL_CHESTPLATE)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(CH);
			e.getWhoClicked().getInventory().setChestplate(CC);
			e.getWhoClicked().getInventory().setLeggings(CL);
			e.getWhoClicked().getInventory().setBoots(CB);
			p.closeInventory();
			p.sendMessage("§6You are now using §7Chainmail Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
			if(e.getCurrentItem().getType().equals(Material.CHAINMAIL_LEGGINGS)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(CH);
			e.getWhoClicked().getInventory().setChestplate(CC);
			e.getWhoClicked().getInventory().setLeggings(CL);
			e.getWhoClicked().getInventory().setBoots(CB);
			p.closeInventory();
			p.sendMessage("§6You are now using §7Chainmail Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
		if(e.getCurrentItem().getType().equals(Material.CHAINMAIL_BOOTS)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(CH);
			e.getWhoClicked().getInventory().setChestplate(CC);
			e.getWhoClicked().getInventory().setLeggings(CL);
			e.getWhoClicked().getInventory().setBoots(CB);
			p.closeInventory();
			p.sendMessage("§6You are now using §7Chainmail Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
			
		if(e.getCurrentItem().getType().equals(Material.GOLD_HELMET)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(GH);
			e.getWhoClicked().getInventory().setChestplate(GC);
			e.getWhoClicked().getInventory().setLeggings(GL);
			e.getWhoClicked().getInventory().setBoots(GB);
			p.closeInventory();
			p.sendMessage("§6You are now using §eGold Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
			
		if(e.getCurrentItem().getType().equals(Material.GOLD_CHESTPLATE)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(GH);
			e.getWhoClicked().getInventory().setChestplate(GC);
			e.getWhoClicked().getInventory().setLeggings(GL);
			e.getWhoClicked().getInventory().setBoots(GB);
			p.closeInventory();
			p.sendMessage("§6You are now using §eGold Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
		if(e.getCurrentItem().getType().equals(Material.GOLD_LEGGINGS)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(GH);
			e.getWhoClicked().getInventory().setChestplate(GC);
			e.getWhoClicked().getInventory().setLeggings(GL);
			e.getWhoClicked().getInventory().setBoots(GB);
			p.closeInventory();
			p.sendMessage("§6You are now using §eGold Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
		if(e.getCurrentItem().getType().equals(Material.GOLD_BOOTS)){
			e.setCancelled(true);
			e.getWhoClicked().getInventory().setHelmet(GH);
			e.getWhoClicked().getInventory().setChestplate(GC);
			e.getWhoClicked().getInventory().setLeggings(GL);
			e.getWhoClicked().getInventory().setBoots(GB);
			p.closeInventory();
			p.sendMessage("§6You are now using §eGold Armor");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			}
		
		if(e.getCurrentItem().getType().equals(Material.INK_SACK)){
			e.setCancelled(true);
			p.sendMessage("§6This feature is still in development! Please check @AppleTechOnline For updates.");
			p.closeInventory();
			}
			
		
		if(e.getCurrentItem().getType().equals(Material.WOOL)){
			e.setCancelled(true);
			p.closeInventory();
		}
		if(e.getCurrentItem().getType().equals(Material.DIAMOND)){
			e.setCancelled(true);
			p.openInventory(Donators.D);
		}
		if(e.getCurrentItem().getType().equals(Material.STAINED_GLASS_PANE)){
			e.setCancelled(true);
			p.closeInventory();
		}


	
			
		
			
			

		
		
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		if(e.getPlayer().hasPermission("Apple.Armor")){
		ItemStack Is = new ItemStack(Material.IRON_INGOT);
		ItemMeta Im = Is.getItemMeta();
		Im.setDisplayName("§bArmor!");
		Im.setLore(Arrays.asList("§6BASED OF RANDOM WODRDS!!!!"));
		Is.setItemMeta(Im);
		e.getPlayer().getInventory().clear();
		e.getPlayer().getInventory().addItem(new ItemStack(Is));
		}
	}
	@EventHandler(priority=EventPriority.HIGH)
	public void onPlayerUse(PlayerInteractEvent event){
		
		Player p = event.getPlayer();
		if(p.getItemInHand().getType() == Material.IRON_INGOT){
	    	p.chat("/armor");
	}
}
}

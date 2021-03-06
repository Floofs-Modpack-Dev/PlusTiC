package landmaster.plustic.crafttweaker;

import com.blamejared.compat.tconstruct.materials.*;

import crafttweaker.*;
//import crafttweaker.IAction;
import crafttweaker.annotations.*;
import landmaster.plustic.tools.stats.*;
import slimeknights.tconstruct.library.materials.*;
//import crafttweaker.zenscript.IBracketHandler;
import stanhebben.zenscript.annotations.*;

@ZenClass("mods.plustic.toolstats")
@ZenRegister
@ModOnly("modtweaker")
public class ToolStats {
	/*
	static IAction action;
	static IBracketHandler bhandler;
	*/
	
	@ZenMethod("energy")
	public static int getEnergy(ITICMaterial mat) {
		BatteryCellMaterialStats stats = ((Material)mat.getInternal()).getStatsOrUnknown(BatteryCellMaterialStats.TYPE);
		return stats.energy;
	}
	
	@ZenMethod("energy")
	public static void setEnergy(ITICMaterial mat, int energy) {
		CraftTweakerAPI.apply(new SetEnergyAction(mat, energy));
	}
	
	@ZenMethod("laserPower")
	public static float getLaserPower(ITICMaterial mat) {
		LaserMediumMaterialStats stats = ((Material)mat.getInternal()).getStatsOrUnknown(LaserMediumMaterialStats.TYPE);
		return stats.power;
	}
	
	@ZenMethod("laserPower")
	public static void setLaserPower(ITICMaterial mat, float power) {
		CraftTweakerAPI.apply(new SetLaserPowerAction(mat, power));
	}
	
	@ZenMethod("laserRange")
	public static float getLaserRange(ITICMaterial mat) {
		LaserMediumMaterialStats stats = ((Material)mat.getInternal()).getStatsOrUnknown(LaserMediumMaterialStats.TYPE);
		return stats.range;
	}
	
	@ZenMethod("laserRange")
	public static void setLaserRange(ITICMaterial mat, float range) {
		CraftTweakerAPI.apply(new SetLaserRangeAction(mat, range));
	}
}

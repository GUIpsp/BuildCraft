/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.builders.triggers;

import buildcraft.api.filler.IFillerPattern;
import buildcraft.core.triggers.*;
import net.minecraft.util.IIcon;

public class ActionFiller extends BCAction {

	public final IFillerPattern pattern;

	public ActionFiller(IFillerPattern pattern) {
		super("filler:" + pattern.getUniqueTag());
		this.pattern = pattern;
	}

	@Override
	public String getDescription() {
		return "Pattern: " + pattern.getDisplayName();
	}

	@Override
	public IIcon getIcon() {
		return pattern.getIcon();
	}

	@Override
	public int getTextureMap() {
		return 0;
	}
}

package com.radiusmarkers;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("radiusmarkers")
public interface RadiusMarkerConfig extends Config
{
	@ConfigSection(
		name = "Default radiuses",
		description = "Default radius values",
		position = 0
	)
	String defaultRadiusSection = "defaultRadiusSection";

	@ConfigItem(
		keyName = "defaultRadiusWander",
		name = "Wander radius",
		description = "Default NPC wander range radius",
		position = 1,
		section = defaultRadiusSection
	)
	default int defaultRadiusWander()
	{
		return 5;
	}

	@ConfigItem(
		keyName = "defaultRadiusRetreat",
		name = "Retreat radius",
		description = "Default NPC retreat range radius",
		position = 2,
		section = defaultRadiusSection
	)
	default int defaultRadiusRetreat()
	{
		return 7;
	}

	@ConfigItem(
		keyName = "defaultRadiusAggro",
		name = "Aggro radius",
		description = "Default NPC aggro range radius",
		position = 3,
		section = defaultRadiusSection
	)
	default int defaultRadiusAggro()
	{
		return 8;
	}

	@ConfigSection(
		name = "Default colours",
		description = "Default radius colour values",
		position = 4
	)
	String defaultColourSection = "defaultColourSection";

	@Alpha
	@ConfigItem(
		keyName = "defaultCcolourSpawn",
		name = "Spawn point",
		description = "Default NPC spawn tile colour",
		position = 5,
		section = defaultColourSection
	)
	default Color defaultColourSpawn()
	{
		return Color.CYAN;
	}

	@Alpha
	@ConfigItem(
		keyName = "defaultColourWander",
		name = "Wander range",
		description = "Default NPC wander range colour",
		position = 6,
		section = defaultColourSection
	)
	default Color defaultColourWander()
	{
		return Color.YELLOW;
	}

	@Alpha
	@ConfigItem(
		keyName = "defaultColourRetreat",
		name = "Retreat range",
		description = "Default NPC retreat range colour",
		position = 7,
		section = defaultColourSection
	)
	default Color defaultColourRetreat()
	{
		return Color.MAGENTA;
	}

	@Alpha
	@ConfigItem(
		keyName = "defaultColourAggro",
		name = "Aggro range",
		description = "Default NPC aggro range colour",
		position = 8,
		section = defaultColourSection
	)
	default Color defaultColourAggro()
	{
		return Color.RED;
	}

	@ConfigItem(
		keyName = "borderWidth",
		name = "Border width",
		description = "Radius marker border width",
		position = 9
	)
	default int borderWidth()
	{
		return 3;
	}
}

package com.dizkonnekted.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
           configuration.load();

           configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example config file value").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the exception if there is one, seems to be disabled in this version of intelliJ
        }
        finally
        {
            configuration.save();
        }
        System.out.println("Config test: " + configValue);
    }
}

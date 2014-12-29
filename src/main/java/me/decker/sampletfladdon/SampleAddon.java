/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.decker.sampletfladdon;

import net.teamtf.launcher.addon.AddonPriority;

/**
 *
 * @author decker
 */
public class SampleAddon implements net.teamtf.launcher.addon.Addon {

    @Override
    public String getAddonName() {
        return "SampleAddon";
    }

    @Override
    public int getVersion() {
        return 15622;
    }

    @Override
    public AddonPriority getPriority() {
        return AddonPriority.MEDIUM;
    }

    @Override
    public void preLoad() {
        System.out.println("I'm per-loading"); 
    }

    @Override
    public void load() {
        System.out.println("Main loading");
    }

    @Override
    public void postLoad() {
  System.out.println("Post~~Loading");    }

}

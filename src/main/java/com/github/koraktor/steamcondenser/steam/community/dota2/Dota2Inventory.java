/**
 * This code is free software; you can redistribute it and/or modify it under
 * the terms of the new BSD License.
 *
 * Copyright (c) 2012, Sebastian Staudt
 */

package com.github.koraktor.steamcondenser.steam.community.dota2;

import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.exceptions.WebApiException;
import com.github.koraktor.steamcondenser.steam.community.GameInventory;
import com.github.koraktor.steamcondenser.steam.community.GameItem;

/**
 * Represents the inventory of a player of DotA 2
 *
 * @author Sebastian Staudt
 */
public class Dota2Inventory extends GameInventory {

    public static final int APP_ID = 570;

    /**
     * Creates a new inventory instance for the player with the given Steam ID
     *
     * @param steamId64 The 64bit Steam ID of the user
     * @param fetchNow Whether the data should be fetched now
     * @see GameInventory#create
     * @throws WebApiException on Web API errors
     */
    public Dota2Inventory(long steamId64, boolean fetchNow)
            throws SteamCondenserException {
        super(APP_ID, steamId64, fetchNow);
    }

    /**
     * Returns the item class for DotA 2
     *
     * @return The item class for DotA 2 is Dota2Item
     * @see Dota2Item
     */
    protected Class<? extends GameItem> getItemClass() {
        return Dota2Item.class;
    }

}

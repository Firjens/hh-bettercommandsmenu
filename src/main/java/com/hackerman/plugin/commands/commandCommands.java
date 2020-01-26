package com.hackerman.plugin.commands;

import com.eu.habbo.Emulator;
import com.eu.habbo.habbohotel.commands.Command;
import com.eu.habbo.habbohotel.gameclients.GameClient;
import com.eu.habbo.messages.outgoing.habboway.nux.NuxAlertComposer;

import java.util.List;

public class commandCommands
        extends Command
{
    public commandCommands ()
    {
        super(null, new String[] { "cmd", "command", "cmds", "commands" });
    }

    public boolean handle(GameClient gameClient, String[] params)
            throws Exception
    {
        gameClient.sendResponse(new NuxAlertComposer ("habbopages/commands.txt"));
        return true;
    }
}

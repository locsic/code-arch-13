/*
 * Copyright (C) 2002 Christian Sell
 * csell@users.sourceforge.net
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * created by cse, 14.10.2002 10:53:19
 */
package net.sourceforge.squirrel_sql.plugins.jcomplete;

import javax.swing.JTextArea;
import net.sourceforge.squirrel_sql.client.session.ISQLEntryPanelFactory;
import net.sourceforge.squirrel_sql.client.session.ISQLEntryPanel;
import net.sourceforge.squirrel_sql.client.session.ISession;

/**
 * entry panel factory which creates an entry panel with the jcomplete engine installed
 * @version $Id: JCompleteSQLEntryPanelFactory.java,v 1.1 2002/10/14 19:13:56 csell Exp $
 */
public class JCompleteSQLEntryPanelFactory implements ISQLEntryPanelFactory
{
    private JCompletePlugin plugin;

    public JCompleteSQLEntryPanelFactory(JCompletePlugin plugin)
    {
        this.plugin = plugin;
    }

    public ISQLEntryPanel createSQLEntryPanel(ISession session)
    {
        if (session == null) {
            throw new IllegalArgumentException("Null ISession passed");
        }
        //try to get cached instance
        JCompleteSQLEntryPanel entryPanel = (JCompleteSQLEntryPanel)session.getPluginObject(
              plugin, JCompletePlugin.JCOMPLETE_SQL_ENTRY_CONTROL);

        if(entryPanel == null) { //or create a new one
            entryPanel = new JCompleteSQLEntryPanel(session);
            session.putPluginObject(plugin, JCompletePlugin.JCOMPLETE_SQL_ENTRY_CONTROL, entryPanel);
        }
        return entryPanel;
    }
}

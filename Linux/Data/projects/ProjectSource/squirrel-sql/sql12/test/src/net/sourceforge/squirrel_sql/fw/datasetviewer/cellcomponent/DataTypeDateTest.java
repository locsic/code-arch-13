package net.sourceforge.squirrel_sql.fw.datasetviewer.cellcomponent;

import static org.junit.Assert.assertFalse;

import java.sql.Date;

import net.sourceforge.squirrel_sql.fw.datasetviewer.ColumnDisplayDefinition;

import org.junit.Before;
import org.junit.Test;

/*
 * Copyright (C) 2006 Rob Manning
 * manningr@users.sourceforge.net
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
 */

/**
 * JUnit test for DataTypeDate class.
 * 
 * @author manningr
 */
public class DataTypeDateTest extends AbstractDataTypeComponentTest
{

	@Before
	public void setUp() throws Exception
	{
		ColumnDisplayDefinition columnDisplayDefinition = getMockColumnDisplayDefinition();
		mockHelper.replayAll();
		classUnderTest = new DataTypeDate(null, columnDisplayDefinition);
		mockHelper.resetAll();
		super.setUp();
	}

	// 1757076 (DATE column seen as TIMESTAMP, update in editable mode fails)
	// We should always return false for this, when the user hasn't specified
	@Test
	public void testGetReadDateAsTimestamp()
	{
		assertFalse("Expected default value to be false for read date as timestamp",
			DataTypeDate.getReadDateAsTimestamp());
	}

	@Override
	protected Object getEqualsTestObject()
	{
		return new Date(System.currentTimeMillis());
	}

}

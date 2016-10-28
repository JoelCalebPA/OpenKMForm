/**
 * OpenKM, Open Document Management System (http://www.openkm.com)
 * Copyright (c) 2006-2015 Paco Avila & Josep Llort
 * 
 * No bytes were intentionally harmed during the development of this application.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.openkm.plugin.form;

import java.util.ArrayList;
import java.util.List;

import com.openkm.api.OKMAuth;
import com.openkm.bean.form.Option;
import com.openkm.principal.PrincipalAdapterException;

import net.xeoh.plugins.base.annotations.PluginImplementation;

@PluginImplementation
public class OptionSelectSampleList implements OptionSelectValues {
	@Override
	public String getName() {
		return "User list";
	}
	
	@Override
	public List<Option> getOptions() throws OptionSelectException {
		List<Option> options = new ArrayList<Option>();
		
		try {
			// Load select values. In the sample use users list from API call, but also could be third-party
			// call or SQL to OpenKM database ( see LegacyDAO )
			List<String> userList; userList = OKMAuth.getInstance().getUsers(null);
			for (String user : userList) {
				Option option = new Option();
				option.setLabel(OKMAuth.getInstance().getName(null, user));
				option.setValue(user);
				options.add(option);
			}
		} catch (PrincipalAdapterException e) {
			throw new OptionSelectException(e);
		}
		
		return options;
	}
}
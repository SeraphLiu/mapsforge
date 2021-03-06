/*
 * Copyright 2010, 2011, 2012 mapsforge.org
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.mapsforge.android.maps.rendertheme;

final class ElementWayMatcher implements ElementMatcher {
	private static final ElementWayMatcher INSTANCE = new ElementWayMatcher();

	static ElementWayMatcher getInstance() {
		return INSTANCE;
	}

	/**
	 * Private constructor to prevent instantiation from other classes.
	 */
	private ElementWayMatcher() {
		// do nothing
	}

	@Override
	public boolean isCoveredBy(ElementMatcher elementMatcher) {
		return elementMatcher.matches(Element.WAY);
	}

	@Override
	public boolean matches(Element element) {
		return element == Element.WAY;
	}
}

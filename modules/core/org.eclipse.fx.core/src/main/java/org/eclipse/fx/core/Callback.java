/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.core;

import org.eclipse.jdt.annotation.Nullable;

/**
 * A simply callback class with a value
 * 
 * @param <T>
 *            the type passed to {@link #call(Object)}
 */
public interface Callback<T> {
	/**
	 * Method invoked
	 * 
	 * @param value
	 *            the value
	 */
	public void call(@Nullable T value);
}

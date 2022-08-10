/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.fx.ui.keybindings.e4.internal;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

/**
 *
 */
public class BindingServiceCreationFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext context) {
		return ContextInjectionFactory.make(BindingServiceImpl.class, context);
	}

}

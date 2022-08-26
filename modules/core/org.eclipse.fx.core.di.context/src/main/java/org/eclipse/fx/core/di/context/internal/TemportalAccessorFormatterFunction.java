/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.core.di.context.internal;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.fx.core.text.TemporalAccessorFormatter;
import org.osgi.service.component.annotations.Component;

/**
 * {@link IContextFunction} to create {@link TemporalAccessorFormatter}
 */
@Component(service=IContextFunction.class,property="service.context.key:String=org.eclipse.fx.core.text.TemporalAccessorFormatter")
public class TemportalAccessorFormatterFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		return ContextInjectionFactory.make(TemporalAccessorFormatter.class, context);
	}
}

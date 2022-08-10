/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 ******************************************************************************/
package org.eclipse.fx.ui.di.internal;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.fx.ui.di.internal.ResourceServiceImpl.ResourcePool;
import org.osgi.service.component.annotations.Component;

/**
 * Context function who creates a resource pool
 */
@Component(service=IContextFunction.class,property="service.context.key:String=org.eclipse.fx.ui.di.ResourcePool")
public class ResourcePoolFactory extends ContextFunction {

	@Override
	public Object compute(IEclipseContext context) {
		return ContextInjectionFactory.make(ResourcePool.class, context);
	}

}
/*******************************************************************************
 * Copyright (c) 2016 BestSolution.at and others.
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

import java.util.function.Consumer;

import org.eclipse.fx.core.adapter.AdapterProvider;
import org.eclipse.fx.core.adapter.AdapterService.ValueAccess;
import org.eclipse.fx.core.di.ContextBoundValue;
import org.eclipse.fx.core.preferences.Value;
import org.osgi.service.component.annotations.Component;

/**
 * Adapt an {@link ContextBoundValue} to a {@link Consumer}
 */
@SuppressWarnings("rawtypes")
@Component
public class ConsumerAdapterProvider_Value implements AdapterProvider<Value, Consumer> {
	@Override
	public Class<Value> getSourceType() {
		return Value.class;
	}

	@Override
	public Class<Consumer> getTargetType() {
		return Consumer.class;
	}

	@Override
	public boolean canAdapt(Value sourceObject, Class<Consumer> targetType) {
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Consumer adapt(final Value sourceObject, Class<Consumer> targetType, ValueAccess... valueAccess) {
		return e -> sourceObject.publish(e);
	}
}

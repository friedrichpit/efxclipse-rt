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
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ui.workbench.fx;

import org.eclipse.fx.core.app.Application;
import org.eclipse.fx.core.app.ApplicationInstance;
import org.osgi.service.component.annotations.Component;

/**
 * e4 application component
 *
 * @since 3.0
 */
@Component
public class E4ApplicationComponent implements Application {
	@Override
	public ApplicationInstance create() {
		return new E4Application();
	}

	@Override
	public String getId() {
		return "org.eclipse.fx.ui.workbench.fx,application"; //$NON-NLS-1$
	}

}

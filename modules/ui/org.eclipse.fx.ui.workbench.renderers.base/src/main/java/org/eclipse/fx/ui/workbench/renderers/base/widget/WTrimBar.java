/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
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
package org.eclipse.fx.ui.workbench.renderers.base.widget;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimElement;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Widget abstraction for trimbars
 * 
 * @param <N>
 *            the native control
 */
public interface WTrimBar<N> extends WLayoutedWidget<MTrimBar> {
	/**
	 * Append a child widget
	 * 
	 * @param trimElementWidget
	 *            the widget
	 */
	void addChild(@NonNull WLayoutedWidget<MTrimElement> trimElementWidget);

	/**
	 * Insert a child widget at the given index
	 * 
	 * @param idx
	 *            the index
	 * @param trimElementWidget
	 *            the widget
	 */
	void addChild(int idx, @NonNull WLayoutedWidget<MTrimElement> trimElementWidget);

	/**
	 * Remove a child widget
	 * 
	 * @param trimElementWidget
	 *            the widget
	 */
	void removeChild(@NonNull WLayoutedWidget<MTrimElement> trimElementWidget);
}

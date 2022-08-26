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
package org.eclipse.fx.ui.controls.sceneviewer;

import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.Node;

/**
 * Event fired when an item of the viewer has to be opened
 *
 * @since 1.1
 */
public class OpenItemEvent extends Event {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Event type
	 */
	public static final EventType<OpenItemEvent> OPEN_ITEM = new EventType<OpenItemEvent>(
			Event.ANY, "OPEN_ITEM"); //$NON-NLS-1$

	private final Node itemNode;

	/**
	 * Create a new open event
	 *
	 * @param itemNode
	 *            the node to open
	 */
	public OpenItemEvent(Node itemNode) {
		super(OPEN_ITEM);
		this.itemNode = itemNode;
	}

	/**
	 * @return the item node
	 */
	public Node getItemNode() {
		return this.itemNode;
	}
}

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
package org.eclipse.fx.ui.animation.pagetransition.animation;

import javafx.animation.Animation;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.scene.Node;
import javafx.util.Duration;

import org.eclipse.fx.ui.animation.pagetransition.CenterSwitchAnimation;

/**
 * Rotated animation
 */
public class RotateOutAnimation extends CenterSwitchAnimation {

	@Override
	protected Animation createAndPrepareAnimation(Node curNode, Node newNode) {
		RotateTransition rt = new RotateTransition(Duration.millis(600), curNode);
		rt.setByAngle(360);

		ScaleTransition sc = new ScaleTransition(Duration.millis(600), curNode);
		sc.setToX(0);
		sc.setToY(0);

		return new ParallelTransition(rt, sc);
	}

	@Override
	protected void resetProperties(Node curNode, Node newNode) {
		curNode.setRotate(0);
		curNode.setScaleX(1);
		curNode.setScaleY(1);
	}

}

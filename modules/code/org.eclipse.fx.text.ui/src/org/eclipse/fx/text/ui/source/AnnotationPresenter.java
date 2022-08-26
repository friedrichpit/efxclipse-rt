/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.text.ui.source;

import java.util.Set;

public interface AnnotationPresenter {

	Set<ITextAnnotationPresenter> getTextAnnotationPresenter();
	Set<ILineRulerAnnotationPresenter> getLineRulerAnnotationPresenter();

}

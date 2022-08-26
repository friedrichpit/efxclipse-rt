/*******************************************************************************
 * Copyright (c) 2000, 2011 IBM Corporation and others.
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
package org.eclipse.swt.internal.image;


final class JPEGAppn extends JPEGVariableSizeSegment {

	public JPEGAppn(byte[] reference) {
		super(reference);
	}
	
	public JPEGAppn(LEDataInputStream byteStream) {
		super(byteStream);
	}
	
	public boolean verify() {
		int marker = getSegmentMarker();
		return marker >= JPEGFileFormat.APP0 && marker <= JPEGFileFormat.APP15;
	}
}

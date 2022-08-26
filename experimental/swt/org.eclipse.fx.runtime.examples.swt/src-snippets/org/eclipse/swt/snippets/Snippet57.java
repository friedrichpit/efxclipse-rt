/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
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
package org.eclipse.swt.snippets;

/*
 * ProgressBar example snippet: update a progress bar (from the UI thread)
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 */
import org.eclipse.fx.runtime.swtutil.SWTUtil;
import org.eclipse.fx.runtime.swtutil.SWTUtil.BlockCondition;
import org.eclipse.fx.runtime.swtutil.SWTUtil.SWTAppStart;
import org.eclipse.swt.*;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.*;

public class Snippet57 implements SWTAppStart {

	@Override
	public BlockCondition createApp(final Display display) {
		Shell shell = new Shell(display);
		final ProgressBar bar = new ProgressBar(shell, SWT.SMOOTH);
		Rectangle clientArea = shell.getClientArea();
		bar.setBounds(clientArea.x, clientArea.y, 200, 32);
		shell.open();

		display.timerExec(100, new Runnable() {
			int i = 0;

			public void run() {
				if (bar.isDisposed())
					return;
				bar.setSelection(i++);
				if (i <= bar.getMaximum())
					display.timerExec(100, this);
			}
		});

		return SWTUtil.getInstance().createShellBlockCondition(shell);
	}
	
	public static void main(String[] args) {
		SWTUtil.getInstance().bootstrap(new Snippet57());
	}
}

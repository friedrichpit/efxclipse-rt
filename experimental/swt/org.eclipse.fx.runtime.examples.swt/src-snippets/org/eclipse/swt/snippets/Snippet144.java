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
 * Virtual Table example snippet: create a table with 1,000,000 items (lazy)
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 * 
 * @since 3.0
 */
import org.eclipse.fx.runtime.swtutil.SWTUtil;
import org.eclipse.fx.runtime.swtutil.SWTUtil.BlockCondition;
import org.eclipse.fx.runtime.swtutil.SWTUtil.SWTAppStart;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;

public class Snippet144 implements SWTAppStart {

	static final int COUNT = 1000000;

	@Override
	public BlockCondition createApp(Display display) {
		final Shell shell = new Shell(display);
		shell.setLayout(new RowLayout(SWT.VERTICAL));
		final Table table = new Table(shell, SWT.VIRTUAL | SWT.BORDER);
		table.addListener(SWT.SetData, new Listener() {
			public void handleEvent(Event event) {
				TableItem item = (TableItem) event.item;
				int index = table.indexOf(item);
				item.setText("Item " + index);
				System.out.println(item.getText());
			}
		});
		table.setLayoutData(new RowData(200, 200));
		Button button = new Button(shell, SWT.PUSH);
		button.setText("Add Items");
		final Label label = new Label(shell, SWT.NONE);
		button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				long t1 = System.currentTimeMillis();
				table.setItemCount(COUNT);
				long t2 = System.currentTimeMillis();
				label.setText("Items: " + COUNT + ", Time: " + (t2 - t1)
						+ " (ms)");
				shell.layout();
			}
		});
		shell.pack();
		SWTUtil.getInstance().openBlocking(shell);
		return null;
	}

	public static void main(String[] args) {
		SWTUtil.getInstance().bootstrap(new Snippet144());
	}
}

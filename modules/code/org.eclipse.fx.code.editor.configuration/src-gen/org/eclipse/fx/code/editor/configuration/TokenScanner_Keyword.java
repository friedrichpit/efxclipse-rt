/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.code.editor.configuration;

public interface TokenScanner_Keyword extends EditorBase, TokenScanner {
	public java.util.List<String> getKeywordList();
	public Check getCheck();
	public Condition getCondition();

	public interface Builder {
		public Builder keywordList(java.util.List<String> keywordList);
		public Builder appendKeywordList(String keywordList);
		public Builder check(Check check);
		public Builder condition(Condition condition);
		public TokenScanner_Keyword build();
	}
}

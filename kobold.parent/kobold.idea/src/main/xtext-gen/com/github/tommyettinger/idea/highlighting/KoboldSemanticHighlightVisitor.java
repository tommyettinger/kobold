/*
 * generated by Xtext 2.10.0
 */
package com.github.tommyettinger.idea.highlighting;

import com.github.tommyettinger.idea.lang.KoboldLanguage;
import org.eclipse.xtext.idea.highlighting.SemanticHighlightVisitor;

public class KoboldSemanticHighlightVisitor extends SemanticHighlightVisitor {
	public KoboldSemanticHighlightVisitor() {
		KoboldLanguage.INSTANCE.injectMembers(this);
	}
}

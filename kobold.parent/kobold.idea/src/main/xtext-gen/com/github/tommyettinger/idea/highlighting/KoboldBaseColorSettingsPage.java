/*
 * generated by Xtext 2.10.0
 */
package com.github.tommyettinger.idea.highlighting;

import com.github.tommyettinger.idea.lang.KoboldLanguage;
import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;

public class KoboldBaseColorSettingsPage extends AbstractColorSettingsPage {
	
	public KoboldBaseColorSettingsPage() {
		KoboldLanguage.INSTANCE.injectMembers(this);
	}

	@Override
	public String getDisplayName() {
		return KoboldLanguage.INSTANCE.getDisplayName();
	}
}
/*
 * generated by Xtext 2.10.0
 */
package com.github.tommyettinger.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class KoboldFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(KoboldFileType.INSTANCE, AbstractKoboldFileType.DEFAULT_EXTENSION);
	}

}

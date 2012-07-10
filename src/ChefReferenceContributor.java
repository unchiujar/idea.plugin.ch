/*
 * Copyright 2010 The WicketForge-Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.intellij.patterns.InitialPatternCondition;
import com.intellij.patterns.PsiFilePattern;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReferenceContributor;
import com.intellij.psi.PsiReferenceRegistrar;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.Nullable;

/**
 */
public class ChefReferenceContributor extends PsiReferenceContributor {
	@Override
	public void registerReferenceProviders(PsiReferenceRegistrar registrar) {

		{// role file  recipe[...]
//			zmienic to notifyAll() string pattern recipe[...]
			PsiFilePattern.Capture<PsiFile> psiFileCapture = chefRoleFile();
			psiFileCapture.withText("recipe[");
			registrar.registerReferenceProvider(chefRoleFile(), new ChefRecipieReferenceProvider());
		}
		{// role file  role[...]
			PsiFilePattern.Capture<PsiFile> psiFileCapture = chefRoleFile();
			psiFileCapture.withText("role[");
//			registrar.registerReferenceProvider(chefRoleFile(), new ChefRecipieReferenceProvider());
		}


	}

	public static PsiFilePattern.Capture<PsiFile> chefRoleFile() {
		return new PsiFilePattern.Capture<PsiFile>(new InitialPatternCondition<PsiFile>(PsiFile.class) {
			@Override
			public boolean accepts(@Nullable Object o, ProcessingContext context) {
				return o instanceof PsiFile && ((PsiFile) o).getContainingDirectory().getName().equals("roles")
						&& ((PsiFile) o).getFileType().getDefaultExtension().equals("rb");
			}
		});
	}
}


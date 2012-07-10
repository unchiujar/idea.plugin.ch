/**
 * Copyright 2011 Nokia Siemens Networks 
 */

import java.util.List;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementResolveResult;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.ResolveResult;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;

/**
 * TODO mlip; javadoc
 *
 * @author mlipski
 */
public class ChefRecipieReference extends PsiReferenceBase<PsiElement> {
	public ChefRecipieReference(@NotNull PsiElement element) {
		super(element);
	}

	public PsiElement resolve() {
		VirtualFile baseDir = myElement.getProject().getBaseDir().findChild("cookbooks");
		String relPath = FileUtil.toSystemIndependentName(myElement.getText()+".rb");

		VirtualFile file = baseDir.findFileByRelativePath(relPath);

		if (file == null) return null;

		return getPsiFile(file);
	}

	@NotNull
	public Object[] getVariants() {
		return new Object[0];
	}


	private PsiFile getPsiFile(VirtualFile file) {
		return PsiManager.getInstance(getProject()).findFile(file);
	}
	private Project getProject() {
		return myElement.getProject();
	}

}

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

import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiExpression;
import com.intellij.psi.PsiExpressionList;
import com.intellij.psi.PsiJavaCodeReferenceElement;
import com.intellij.psi.PsiLiteralExpression;
import com.intellij.psi.PsiNewExpression;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceProvider;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

/**
 */
public class ChefRecipieReferenceProvider extends PsiReferenceProvider {
    @NotNull
    @Override
    public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
        PsiExpressionList expressionList = (PsiExpressionList) element.getParent();
//        PsiExpression[] expressions = expressionList.getExpressions();
//        if (expressions.length > 0 && expressions[0].equals(element)) {
//            if (WicketForgeFacet.hasFacetOrIsFromLibrary(element)) {
//                PsiElement parent = expressionList.getParent(); // can be PsiNewExpression or PsiAnonymousClass
//                PsiNewExpression newExpression = (PsiNewExpression) (parent instanceof PsiNewExpression ? parent : parent.getParent());
//                PsiJavaCodeReferenceElement clazzReference = newExpression.getClassOrAnonymousClassReference();
//                if (clazzReference != null) {
//                    PsiElement clazzElement = clazzReference.resolve();
//                    if (clazzElement instanceof PsiClass) {
//                        PsiClass psiClass = (PsiClass) clazzElement;
//                        if (WicketForgeUtil.isWicketComponent(psiClass) && !WicketForgeUtil.isWicketPage(psiClass)) {
//                            PsiClass wicketClass = WicketForgeUtil.getParentWicketClass(newExpression);
//                            if (wicketClass != null && WicketForgeUtil.getMarkupFile(wicketClass) != null) {
//                                return new PsiReference[] {new ClassWicketIdReference((PsiLiteralExpression) element, wicketClass)};
//                            }
//                        }
//                    }
//                }
//            }
//        }
        return PsiReference.EMPTY_ARRAY;
    }
}

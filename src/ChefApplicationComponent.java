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

import com.intellij.codeInspection.InspectionToolProvider;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.components.ServiceManager;
import org.jetbrains.annotations.NotNull;


/**
 *
 */
/*@State(name = "ChefApplicationComponent", storages = {@Storage(id = "other", file = "$APP_CONFIG$/other.xml")})*/
public class ChefApplicationComponent implements ApplicationComponent, InspectionToolProvider/*, Configurable, PersistentStateComponent<ChefApplicationComponent> */{
    /*private transient WicketForgeConfigurationPanel panel;*/

/*
    // gutter Icons
    public boolean showJavaToMarkup = true;
    public boolean showJavaToComponents = true;
    public boolean showMarkupToJava = true;
    public boolean showMarkupToComponents = true;
*/

    public static ChefApplicationComponent get() {
      return ServiceManager.getService(ChefApplicationComponent.class);
    }

    public ChefApplicationComponent() {
    }

    public void initComponent() {
    }

    public void disposeComponent() {
    }

    @NotNull 
    public String getComponentName() {
        return "ChefApplicationComponent";
    }

    public Class[] getInspectionClasses() {
        return new Class[]{};
    }

}

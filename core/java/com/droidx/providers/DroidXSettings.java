/**
 * Copyright (C) 2023 The LibreMobileOS Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.droidx.providers;

import android.provider.Settings;
import android.util.Log;


/**
 * DroidXSettings contains DroidX-UI specific preferences in System, Secure, and Global.
 */
public final class DroidXSettings {
    private static final String TAG = "DroidXSettings";

    /**
     * System settings, containing miscellaneous DroidX-UI system preferences. This table holds simple
     * name/value pairs. There are convenience functions for accessing individual settings entries.
     */
    public static final class System extends Settings.NameValueTable {
        // region System Settings

        /**
         * Whether to enable taskbar.
         * 
         * @hide
         */
        public static final String ENABLE_TASKBAR = "enable_taskbar";

    }

    /**
     * Secure settings, containing miscellaneous DroidX-UI secure preferences. This
     * table holds simple name/value pairs. There are convenience
     * functions for accessing individual settings entries.
     */
    public static final class Secure extends Settings.NameValueTable {
        // region Secure Settings

    }

    /**
     * Global settings, containing miscellaneous DroidX-UI global preferences. This
     * table holds simple name/value pairs. There are convenience
     * functions for accessing individual settings entries.
     */
    public static final class Global extends Settings.NameValueTable {
        // region Global Settings

    }
}

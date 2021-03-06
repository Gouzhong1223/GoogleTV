/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.tv.util.account;

import android.accounts.Account;
import android.support.annotation.Nullable;

/** Helper methods for getting and selecting a user account. */
public interface AccountHelper {
    /** Returns the currently selected account or {@code null} if none is selected. */
    @Nullable
    Account getSelectedAccount();
    /**
     * Selects the first account available.
     *
     * @return selected account or {@code null} if none is selected.
     */
    @Nullable
    Account selectFirstAccount();

    /** Returns all eligible accounts . */
    @Nullable
    Account getFirstEligibleAccount();

    /**
     * Initialize the account helper.
     *
     * <p>This method is a no op if called more than once.
     */
    void init();
}

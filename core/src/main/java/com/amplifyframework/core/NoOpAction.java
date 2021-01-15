/*
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * An {@link Action} that does nothing when called.
 */
public final class NoOpAction implements Action {
    private NoOpAction() {}

    /**
     * Creates an instance of an {@link Consumer} which does nothing
     * when called.
     * @return A No-operation action
     */
    @NonNull
    public static NoOpAction create() {
        return new NoOpAction();
    }

    @Override
    public void call() {}

    @Override
    public int hashCode() {
        return NoOpAction.class.hashCode();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return obj instanceof NoOpAction;
    }

    @NonNull
    @Override
    public String toString() {
        return "NoOpAction {}";
    }
}

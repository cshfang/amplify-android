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

package com.amplifyframework.auth.options;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * The shared options among all Auth plugins.
 * Note: This is currently empty but exists here to support common confirm sign up options in the future.
 */
public abstract class AuthConfirmSignUpOptions {
    /**
     * Use the default confirm sign-up options.
     * @return Default confirm sign-up options.
     */
    public static DefaultAuthConfirmSignUpOptions defaults() {
        return new DefaultAuthConfirmSignUpOptions();
    }

    /**
     * The builder for this class.
     * @param <T> The type of builder - used to support plugin extensions of this.
     */
    public abstract static class Builder<T extends Builder<T>> {
        /**
         * Return the type of builder this is so that chaining can work correctly without implicit casting.
         * @return the type of builder this is
         */
        public abstract T getThis();

        /**
         * Build an instance of AuthConfirmSignUpOptions (or one of its subclasses).
         * @return an instance of AuthConfirmSignUpOptions (or one of its subclasses)
         */
        @NonNull
        public abstract AuthConfirmSignUpOptions build();
    }

    /**
     * Default sign-in options. This works like a sentinel, to be used instead of "null".
     * The only way to create this is by calling {@link AuthConfirmSignUpOptions#defaults()}.
     */
    public static final class DefaultAuthConfirmSignUpOptions extends AuthConfirmSignUpOptions {
        private DefaultAuthConfirmSignUpOptions() {}

        @Override
        public int hashCode() {
            return DefaultAuthConfirmSignUpOptions.class.hashCode();
        }

        @Override
        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthConfirmSignUpOptions;
        }

        @NonNull
        @Override
        public String toString() {
            return DefaultAuthConfirmSignUpOptions.class.getSimpleName();
        }
    }
}

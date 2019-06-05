/*
 * Copyright (C) 2018 The Android Open Source Project
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
package com.android.tv.tuner.modules;

import com.android.tv.tuner.source.TunerSourceModule;
import com.android.tv.tuner.tvinput.factory.TunerSessionFactory;
import com.android.tv.tuner.tvinput.factory.TunerSessionFactoryImpl;

import dagger.Binds;
import dagger.Module;

/** Dagger module for TV Tuners. */
@Module(includes = {TunerSingletonsModule.class, TunerSourceModule.class})
public abstract class TunerModule {

    @Binds
    abstract TunerSessionFactory tunerSessionFactory(TunerSessionFactoryImpl impl);
}

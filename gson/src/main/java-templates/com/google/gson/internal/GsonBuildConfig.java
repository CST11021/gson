/*
 * Copyright (C) 2018 The Gson authors
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

package com.google.gson.internal;

/**
 * 执行templating-maven-plugin插件，将GsonBuildConfig添加到源码路径下
 *
 * 构建Gson的配置。该文件由templating-maven-plugin自动填充，并生成.java/.class文件供在Gson中使用。
 *
 * @author Inderjeet Singh
 */
public final class GsonBuildConfig {
  // Based on https://stackoverflow.com/questions/2469922/generate-a-version-java-file-in-maven

  /** This field is automatically populated by Maven when a build is triggered */
  public static final String VERSION = "${project.version}";

  private GsonBuildConfig() { }
}

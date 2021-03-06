/**
 * Backpack for Android - Skyscanner's Design System
 *
 * Copyright 2018-2020 Skyscanner Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.skyscanner.backpack.button.internal

import android.content.Context
import net.skyscanner.backpack.R

internal class ButtonTokens(val context: Context) {
  val bpkSpacingBase = context.resources.getDimensionPixelSize(R.dimen.bpkSpacingBase)
  val bpkSpacingLg = context.resources.getDimensionPixelSize(R.dimen.bpkSpacingLg)
  val bpkSpacingMd = context.resources.getDimensionPixelSize(R.dimen.bpkSpacingMd)
  val bpkSpacingSm = context.resources.getDimensionPixelSize(R.dimen.bpkSpacingSm)
  val bpkBorderSizeLg = context.resources.getDimensionPixelSize(R.dimen.bpkBorderSizeLg)
}

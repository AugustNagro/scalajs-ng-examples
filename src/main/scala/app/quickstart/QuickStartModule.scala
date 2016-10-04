package app.quickstart

import ng.common.CommonModule
import ng.forms.FormsModule
import ng.macros._

@NgModule(
  "imports" -> @@(classOf[CommonModule]),

  "declarations" -> @@(classOf[QuickStart]),

  "exports" -> @@(classOf[QuickStart])
)
class QuickStartModule {

}

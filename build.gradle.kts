plugins {
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.detekt) apply false
    alias(libs.plugins.compose.multiplatform) apply false
    alias(libs.plugins.dokkatoo.html)
}

dependencies {
    dokkatoo(project(":core"))
    dokkatoo(project(":material3"))

    // TODO: Remove when https://github.com/adamko-dev/dokkatoo/issues/14 is fixed
    dokkatooPluginHtml(
        dokkatoo.versions.jetbrainsDokka.map { dokkaVersion ->
            "org.jetbrains.dokka:all-modules-page-plugin:$dokkaVersion"
        }
    )

}
plugins {
    id("org.jetbrains.kotlin.jvm")
}
dependencies {
    implementation(project(mapOf("path" to ":domain")))
}

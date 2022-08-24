import com.soywiz.korge.gradle.korge

plugins {
    id(Deps.Plugins.Korge.Id)
}

group = AppInfo.PACKAGE
version = AppInfo.VERSION

dependencies {
    commonMainApi(Deps.Libs.Korlibs.KorIM)
    commonMainApi(Deps.Libs.Kotlin.Reflection)
}

korge {
    id = "org.warscape.game"
    jvmMainClassName = "org.warscape.game.MainKt"

    targetJvm()
    targetDesktop()
}


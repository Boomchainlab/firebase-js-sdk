plugins {
    id("agu-token.kotlin")
    application
}

dependencies {
    implementation(project(":agu-token-kotlin"))
}

application {
    mainClass = "com.agu_token.api.example.MainKt"
}

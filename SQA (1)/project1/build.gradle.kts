plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation 'org.testng:testng:6.14.3'
    implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.1.2'
}

tasks.test {
    useJUnitPlatform()
}
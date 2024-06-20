plugins {


    id("com.google.gms.google-services")
    id("kotlin-android")
    id("kotlin-kapt")
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

}

android {
    namespace = "kr.co.hping.istamp"
    compileSdk = 34

    defaultConfig {
        applicationId = "kr.co.hping.istamp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        // MultiDex 지원 추가
        multiDexEnabled = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    viewBinding {
        enable = true
    }

}

dependencies {

    implementation("com.google.android.gms:play-services-auth:20.0.0") // 최신 버전 확인
    implementation("androidx.multidex:multidex:2.0.1") // MultiDex 라이브러리 추가
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")

    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    implementation("com.google.firebase:firebase-analytics")

    implementation("com.github.bumptech.glide:glide:4.12.0")
    implementation(libs.firebase.auth.ktx)
    implementation(libs.firebase.firestore.ktx)
    implementation(libs.firebase.storage.ktx)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // JSON 변환을 위한 Gson Converter
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0") // 문자열 변환을 위한 Scalars Converter
    implementation("commons-net:commons-net:3.8.0")

    implementation("com.google.firebase:firebase-bom:30.4.1")
    implementation("com.google.android.gms:play-services-auth:20.3.0")
    implementation("androidx.multidex:multidex:2.0.1")
    implementation("com.google.firebase:firebase-auth-ktx:21.0.8")

    implementation("com.google.firebase:firebase-firestore-ktx:24.3.0")
    implementation("com.google.firebase:firebase-storage-ktx:20.0.2")
    implementation("com.github.bumptech.glide:glide:4.13.2")
    implementation("com.firebaseui:firebase-ui-storage:8.0.1")
    implementation("com.github.bumptech.glide:compiler:4.13.2")

    implementation("com.google.firebase:firebase-messaging-ktx:23.0.8")
    implementation("com.google.firebase:firebase-analytics-ktx:21.1.1")
    implementation("com.android.billingclient:billing:5.0.0")
}
import com.google.protobuf.gradle.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// protobuf関連のimport
import org.gradle.kotlin.dsl.provider.gradleKotlinDslOf
import org.gradle.kotlin.dsl.compile as compile

plugins {
	id("org.springframework.boot") version "2.3.5.RELEASE"
	id("io.spring.dependency-management") version "1.0.10.RELEASE"
	kotlin("jvm") version "1.3.72"
	kotlin("plugin.spring") version "1.3.72"

	// protobufを追加
	id("com.google.protobuf") version "0.8.8"
}

group = "jp.boctok"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

// 自動生成クラスの出力先
sourceSets{
	main{
		java{
			srcDir("src/main/grpc")
		}
	}
}

dependencies {
	// grpc関連を追加
	implementation("com.google.protobuf:protobuf-java:3.6.1")
	implementation("io.grpc:grpc-stub:1.15.1")
	implementation("io.grpc:grpc-protobuf:1.15.1")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.apache.maven.plugins:maven-assembly-plugin:3.1.1")
//	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.4")
	implementation("io.github.lognet:grpc-spring-boot-starter:4.2.2")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// コードジェネレータの設定
protobuf{
	protoc{
		artifact = "com.google.protobuf:protoc:3.6.1"
	}
	plugins{
		id("grpc"){
			artifact = "io.grpc:protoc-gen-grpc-java:1.15.1"
		}
	}
	generateProtoTasks{
		ofSourceSet("main").forEach{
			it.plugins{
				id("grpc")
			}
		}
	}
	// 生成するソースをsrc側に作る
	generatedFilesBaseDir = "$projectDir/src"
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

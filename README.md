# MCEF Modern

Minecraft Chromium Embedded Framework — mod and library for adding Chromium web browser into Minecraft  

MCEF is based on java-cef (Java Chromium Embedded Framework), 
which is based on CEF (Chromium Embedded Framework), 
which is based on Chromium. 
It was originally created by montoyo. 
Then, it was rewritten by the CinemaMod Group.
Then, it was rewritten again and named "MCEF Modern" by DimasKama.  

### Features

- Modern Minecraft and Chromium versions support
- Documented API
- Asynchronous initialization

### For Players

Install this mod like a regular fabric mod

### For Modders

`build.gradle` setup:

- With DimasKama's maven:

```groovy
repositories {
    // Other repositories
    
    maven {
        url = uri('https://maven.dimaskama.net/releases')
    }
}

dependencies {
    // Other dependencies

    modImplementation "net.dimaskama:mcef-modern:${mcef_modern_version}"
}
```

- Or with the Modrinth maven:

```groovy
repositories {
    // Other repositories

    exclusiveContent {
        forRepository {
            maven {
                url = "https://api.modrinth.com/maven"
            }
        }
        filter {
            includeGroup "maven.modrinth"
        }
    }
}

dependencies {
    // Other dependencies

    modImplementation "maven.modrinth:mcef-modern:${mcef_modern_version}"
}
```

### Example

Simple usage example can be found in [Test Mod](src/testmod)

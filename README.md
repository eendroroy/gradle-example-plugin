# gradle-example-plugin

An example gradle plugin

## Build and Use the plugin

User gradle to build the plugin

```bash
gradle build
```

After the first build modify `build.gradle` file to include the plugin.

```groovy
buildscript {
   ...

    // TODO: Uncomment these lines after first build to use the plugin
    repositories {
        flatDir {
            dirs "$buildDir/libs"
        }
    }
    dependencies {
         classpath name: "$project.name-${projectVersion}"
    }

    ...
}

...

// TODO: Uncomment this line after first build to use the plugin
apply plugin: 'com.indrajit.example'

...

```

Then run the `exampleTask`

```bash
gradle exampleTask
```

Should show the following:

```bash

> Task :exampleTask
Project Name: 'gradle-example-plugin'
Project Description: '...'


BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed

```


## Contributing

Bug reports and pull requests are welcome on GitHub at [gradle-example-plugin repository](https://github.com/eendroroy/gradle-example-plugin). 
This project is intended to be a safe, welcoming space for collaboration,
and contributors are expected to adhere to the [Contributor Covenant](http://contributor-covenant.org) code of conduct.

## Authors

* **indrajit** - *Owner* - [eendroroy](https://github.com/eendroroy)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details


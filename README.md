# gbfs-java-model

Generates Java model from GBFS json schema using jsonschema2pojo with jackson2 annotations.

In order to avoid naming conflicts in generated classes, each feed gets its own package, and all
classes are prefixed with "GBFS".

Packages include GBFS versions to accommodate for future releases which may include older versions,
since some consumers may need to handle multiple non-compatible versions in the same application 
(i.e. you should be able to parse v2.1 feeds with the v2.2 package, but v3.0 package would not
be able to parse v2.2 feeds).

### Special case: gbfs.json in v2.X

There is no support in jsonschema2pojo to handle "patternProperties" sanely, it will just result
in a class without any properties. The `gbfs.json` feed uses "patternProperties" for the `data`
property to define an object per language, where the language code is the name of the property.

The generated Gbfs class is therefore extended by
[src/main/org/entur/gbfs/v2_2/gbfs/GBFS.java](src/main/org/entur/gbfs/v2_2/gbfs/GBFS.java)
to override the `data` property with a Map implementation. This extended class should be used
when unmarshalling the `gbfs.json` feed.

Note: This does not apply to v3.0

## Maven central
This project is available in the central maven repository.
See https://search.maven.org/search?q=g:org.entur.gbfs
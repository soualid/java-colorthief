# Java Color Thief
A port to Java of Lokesh Dhakar "Color Thief" for it to be executed server side on a JEE container or in a J2SE app, or in an Android application. See http://lokeshdhakar.com/projects/color-thief/ for more informations and usage example of the javascript version.

⚠️ Note that this is a quick & dirty implementation for the need of a project I worked on few years ago, a better and faster implementation has been developped by Sven Woltmann and is available [here](https://github.com/SvenWoltmann/color-thief-java), you should definitely check this out.

![Example](https://raw.githubusercontent.com/soualid/java-colorthief/master/src/test/resources/example.png)

## How to use
See test case included in ```org.soualid.colorthief.MMCQTest``` (which is not really what I call a test case, it's a shame but you know, I said it was a quick & dirty implementation 🐽). 

Basically :

```java
BufferedImage img = /* read your image here using Image IO */;
// Then get the 10 most used colors palette (first being the dominant color of the image)
List<int[]> result = MMCQ.compute(img, 10); // 10 is the number of dominant colors to find 
```

Will return a list of dominant colors, where each integer array contains the red, green and blue values of each color in the palette.

## How to build
As a naive implementation, a prebuilt version of this library has not been made available on maven central or anywhere, but you can build it using Apache Maven, a simple `mvn package` will build the project, and the `install` or `deploy` goals can be used to make the artifact available within your local and/or private repository. 

Anyway, I guess you don't really need help on how to use Maven.

## Credits and license

### Author
Simon Oualid (simon@oualid.net), originally for the wipplay.com website (http://www.wipplay.com)

### Thanks
* Lokesh Dhakar - for the original Color Thief javascript version, available at http://lokeshdhakar.com/projects/color-thief/
* Nick Rabinowitz - for creating quantize.js (ported here in Java)

### License
Licensed under the [Creative Commons Attribution 2.5 License](http://creativecommons.org/licenses/by/2.5/)

* Free for use in both personal and commercial projects.
* Attribution requires leaving author name, author homepage link, and the license info intact.

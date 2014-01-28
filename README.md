#Java Color Thief
A port to Java of Lokesh Dhakar "Color Thief" for it to be executed server side on a JEE container or in a J2SE app. See http://lokeshdhakar.com/projects/color-thief/ for more informations and usage example of the javascript version.

![Example](https://raw2.github.com/soualid/java-colorthief/master/src/test/resources/example.png)

##How to use
See test case included in ```org.soualid.colorthief.MMCQTest```. 

Basically :

```java
	BufferedImage img = /* read your image here using Image IO */;
	// Then get the 10 most used colors palette (first being the dominant color of the image)
	List<int[]> result = MMCQ.compute(img, 10); 
```

##How to build
This project use Apache Maven.

##Credits and license

###Author
Simon Oualid (simon@oualid.net), originally for the wipplay.com website (http://www.wipplay.com)

###Thanks
* Lokesh Dhakar - for the original Color Thief javascript version, available at http://lokeshdhakar.com/projects/color-thief/
* Nick Rabinowitz - for creating quantize.js (ported here in Java)

###License
Licensed under the [Creative Commons Attribution 2.5 License](http://creativecommons.org/licenses/by/2.5/)

* Free for use in both personal and commercial projects.
* Attribution requires leaving author name, author homepage link, and the license info intact.
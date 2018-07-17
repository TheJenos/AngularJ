# AngulerJ[Java EE 7]

AngulerJ is a modules hybrid framwork that help to code faster and smarter. Also it helps to understand easily 

## Getting Started

it's simple to implement. just add the jar file to your project. That's all.

### Prerequisites
this is a AngulerJS bases framework. so we have to add AngulerJS file. there is framework called JSFramwork. we need to add that to. don't worry "AngulerJ.js" file comes with my jar. main thing is you have to upgrade your project to java EE 7 or higher
```
<script type="text/javascript" src="angular.min.js" ></script>
<script type="text/javascript" src="JSframwork.min.js" ></script>
<script type="text/javascript" src="AngulerJ.js"></script>
```

### Installing
Create a XML file("AngulerJ.xml") on default project. and paste these lines 
```
<app>
    <property type="DEBUG">true</property>
    <property type="Package">PACKAGE_NAME_OR_PATH</property>
</app>
```
"PACKAGE_NAME_OR_PATH" must be the package that contains elements
```
 <property type="Package">pkg</property>
```
Now create a subpackage And add Class file to it. Also both name must be the same and first letter must be a lowcase one.
```
pkg.testbutton.testbutton
```
This is the sample structue of the AngularJComponent
```
@Component()
public class testbutton extends AngularJComponent{
/* your codes */
    public String Test(){
        System.out.println("test");
        return new Date().toString();
    }
}
```
There are some functions on "@Component()" annotation
TemplateURL and Controller works with same package
```
    String Selector() default "";
    String[] Scope() default {};
    String Restrict() default "EA";
    boolean Transclude() default false;
    boolean Replace() default false;
    String TemplateURL() default "";
    String Controller() default "";
    String[] ControllerPara() default {};
```
Here example file for controller
"$server" means your java compoent. you can call java method from here.
```
$scope.run = function () {
    $scope.$server.Test(function (data) {
        console.log(data); 
    });
};
```

## Running
### How it's work
add your element to your html or jsp file
```
 <testbutton ngClick="run()"></testbutton>
```
don't forget to add AngulerJ module to your APP
```
angular.module("home", ['angularj']);
```


## Built With

* AngulerJS, JSframework - The web framework used
* GlassFish - Use with Java EE 7

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


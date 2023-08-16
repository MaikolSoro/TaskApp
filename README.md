<div align="center">
  <h1 align = "center">
  <b><i>TaskApp</i></b>
  </h1>

  
  [Deployment](#arrow_lower_right-deployment-arrow_lower_right) ~
  [Architecture](#hammer_and_wrench-architecture-hammer_and_wrench) ~
  [Tech Stack](#building_construction-tech-stack-building_construction) ~
  [Authors](#memo-authors-memo) ~
  [Contributing](#handshake-contributing-handshake)  
  [License](#scroll-license-scroll)  
</div>  
Build a To-Do App using Modern Declarative UI Toolkit called Jetpack Compose to Accelerate your UI and App development.

# :arrow_lower_right: Deployment :arrow_lower_right:
These are the key parameters for TaskApp.

| Parameters     | Value |
|----------------|-------|
| compileSdk     | 34    |
| targetSdk      | 33    |
| minSdk         | 24    |
| composeVersion | 1.4.0 |
| kotlinVersion  | 1.8.10 |

You can clone the repository or download the Zip file [here](https://github.com/MaikolSoro/TaskApp)

To build and run the app, you will need the latest version of Android Studio Flamingo (or [newer](https://developer.android.com/studio/)) installed on your system.
# :hammer_and_wrench: Architecture :hammer_and_wrench:

TaskApp is initially built using Android Clean Architecture that follows the more familiar   **Model-View-ViewModel** (MVVM) pattern .
## Architecture
[***MVVM (Model View View-Model)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture.
![ANDROID ROOM DB DIAGRAM](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)

# TaskApp ❤️
🌞 Light Mode
<table style="width:100%">
  <tr>
    <th>1. Splash Screen </th>
    <th>2. List Screen empty </th> 
    <th>3. Add Task  </th>
    <th>4. List Screen with content </th> 
    <th>5. Delete Task </th> 
    <th>6. Edit Task  </th> 
    <th>7. Search Task </th>
  </tr>
  <tr>
    <td><img src = "https://user-images.githubusercontent.com/46753453/136623871-11a6b7a8-ba3b-4464-b288-6047111164e4.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136623943-f60ef9cd-9fd3-4ac0-93d7-bc66e5985740.png" /></td>
    <td><img src = "https://user-images.githubusercontent.com/46753453/136624029-ecba4fb3-a3cb-4cb6-9b7c-97568a32c1ef.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136624208-ed74ed37-d8a0-4e92-a49c-bed684627f7a.png "/></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136624402-adf9e891-ae6f-43d8-9f71-fe3a1fd9558e.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136624554-bfbf17cd-d9b5-4105-85d7-b1ce71ccb946.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136624696-147b2190-baf3-45de-8e82-84e852bddf44.png" /></td> 
   
  </tr>
</table>

🌙 Dark Mode
<table style="width:100%">
  <tr>
    <th>1. Splash Screen </th>
    <th>2. List Screen empty </th> 
    <th>3. Add Task  </th>
    <th>4. List Screen with content </th> 
    <th>5. Delete Task </th> 
    <th>6. Edit Task  </th> 
    <th>7. Priority </th>
  </tr>
  <tr>
    <td><img src = "https://user-images.githubusercontent.com/46753453/136625513-855eaa50-efe4-48d6-8f12-1480a1c6b9f2.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136625867-7bb0ced9-e10b-4104-92bc-819c14ea9b07.png" /></td>
    <td><img src = "https://user-images.githubusercontent.com/46753453/136625639-8e3313e6-b710-4826-a072-77a07003727b.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136625673-20a04559-5447-4daf-8733-ad01a29b157b.png"/></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136625708-c28a403d-c584-4b79-9a63-df56b95ba64e.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136625744-9199a07e-4816-4583-a35d-9cb44d99503d.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136625773-62c5698e-a655-4719-b804-5f79cf9660ba.png" /></td> 
   
  </tr>
</table>

# :building_construction: Tech Stack :building_construction:

The TaskApp project uses many popular libraries and tools in the Android Ecosystem:

* [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
* [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
* [Navigation compose](https://developer.android.com/jetpack/compose/navigation) - Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app.
* [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
* [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
* [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
* [DataStore](https://developer.android.com/topic/libraries/architecture/datastore) - Jetpack DataStore is a data storage solution that allows you to store key-value pairs or typed objects with protocol buffers.
* [Dependency Injection](https://developer.android.com/training/dependency-injection) - 
* [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
*  [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
* [Jetpack Compose UI Toolkit](https://developer.android.com/jetpack/compose) - Modern UI development toolkit.

# :memo: Authors :memo:
- [@MaikolSoro](https://github.com/MaikolSoro)
 

# :handshake: Contributing :handshake🔥⚡: 

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request and enjoy! :D


# :scroll: License :scroll:
```
MIT License

Copyright (c) 2021 Michael Soro Zúñiga

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
